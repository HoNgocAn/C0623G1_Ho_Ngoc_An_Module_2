package casestudy.respository.impl;

import casestudy.model.Facility.Facility;
import casestudy.respository.IFacilityRepository;

import java.util.LinkedHashMap;
import java.util.Map;

public class FacilityRepository implements IFacilityRepository {
    private static LinkedHashMap<Facility,Integer> linkedHashMap = new LinkedHashMap<>();
    @Override
    public LinkedHashMap<Facility, Integer> display() {
        return linkedHashMap;
    }

    @Override
    public void addFacility(Facility facility) {
        for (Map.Entry<Facility,Integer> entry : linkedHashMap.entrySet()) {
            if(entry.getKey().equals(facility)){
                continue;
            }
        }
        linkedHashMap.put(facility,0);
    }

    @Override
    public LinkedHashMap<Facility, Integer> displayListFacilityMaintenance() {
        LinkedHashMap<Facility, Integer> facilityMaintenance = new LinkedHashMap<>();
        for(Map.Entry<Facility, Integer> entry: linkedHashMap.entrySet()) {
            if(entry.getValue()%5==0) {
                facilityMaintenance.put(entry.getKey(), entry.getValue());
            }
        }
        return facilityMaintenance;
    }

    @Override
    public void deleteFacility(String inputId) {
        for (Facility f: linkedHashMap.keySet()) {
            if (inputId.equals(f.getServiceCode())){
                linkedHashMap.remove(f);
                break;
            }
        }
    }
}
