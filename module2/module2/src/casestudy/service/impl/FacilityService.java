package casestudy.service.impl;

import casestudy.model.Facility.Facility;
import casestudy.respository.IFacilityRepository;
import casestudy.respository.impl.FacilityRepository;
import casestudy.service.IFacilityService;

import java.util.LinkedHashMap;

public class FacilityService implements IFacilityService {
    private final IFacilityRepository facilityRepository = new FacilityRepository();

    @Override
    public LinkedHashMap<Facility, Integer> display() {
        return this.facilityRepository.display();
    }

    @Override
    public void addFacility(Facility facility) {
        this.facilityRepository.addFacility(facility);
    }

    @Override
    public LinkedHashMap<Facility, Integer> displayListFacilityMaintenance() {
        return this.facilityRepository.displayListFacilityMaintenance();
    }

    @Override
    public void deleteFacility(String inputId) {
        this.facilityRepository.deleteFacility(inputId);
    }
}
