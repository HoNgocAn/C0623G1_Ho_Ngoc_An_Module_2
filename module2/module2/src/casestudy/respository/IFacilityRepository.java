package casestudy.respository;

import casestudy.model.Facility.Facility;

import java.util.LinkedHashMap;

public interface IFacilityRepository extends IRepository{
    LinkedHashMap<Facility, Integer> display();
    void addFacility(Facility facility);
    LinkedHashMap<Facility, Integer> displayListFacilityMaintenance();
    void deleteFacility(String inputId);
}
