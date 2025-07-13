package org.andrew.fileHandler.service;

import org.andrew.fileHandler.Entity.ApplianceEntity;
import org.andrew.fileHandler.Entity.BedroomEntity;
import org.andrew.fileHandler.Entity.HouseEntity;

import java.util.List;

public interface DisplayService {

    List<ApplianceEntity> searchAllAppliance();

    List<BedroomEntity> searchAllBedrooms();
    List<HouseEntity> searchAllHouses();
}
