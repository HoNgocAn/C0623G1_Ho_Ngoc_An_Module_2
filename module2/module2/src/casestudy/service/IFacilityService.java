package casestudy.service;

import casestudy.model.Facility.Facility;

import java.util.LinkedHashMap;

public interface IFacilityService extends IService{
    LinkedHashMap<Facility, Integer> display();
    void addFacility(Facility facility);
    LinkedHashMap<Facility, Integer> displayListFacilityMaintenance();
    void deleteFacility(String inputId);
}
