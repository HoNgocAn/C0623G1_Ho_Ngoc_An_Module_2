package casestudy.controller;

import casestudy.model.Facility.Facility;
import casestudy.respository.IFacilityRepository;
import casestudy.service.IFacilityService;
import casestudy.service.impl.FacilityService;

import java.util.LinkedHashMap;

public class FacilityController {
    private final IFacilityService facilityService = new FacilityService();

    public LinkedHashMap<Facility, Integer> display() {
        return this.facilityService.display();
    }

    public void addFacility(Facility facility) {
        this.facilityService.addFacility(facility);
    }

    public LinkedHashMap<Facility, Integer> displayListFacilityMaintenance() {
        return this.facilityService.displayListFacilityMaintenance();
    }
    public void deleteFacility(String inputId) {
        this.facilityService.deleteFacility(inputId);
    }
}
