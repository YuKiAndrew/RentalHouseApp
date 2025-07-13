package org.andrew.fileHandler.service.impl;

import org.andrew.fileHandler.Entity.ApplianceEntity;
import org.andrew.fileHandler.Entity.BedroomEntity;
import org.andrew.fileHandler.Entity.HouseEntity;
import org.andrew.fileHandler.repository.ApplianceRepository;
import org.andrew.fileHandler.repository.BedroomRepository;
import org.andrew.fileHandler.repository.HouseRepository;
import org.andrew.fileHandler.service.DisplayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DisplayServiceImpl implements DisplayService {

    @Autowired
    private ApplianceRepository applianceRepository;

    @Autowired
    private BedroomRepository bedroomRepository;

    @Autowired
    private HouseRepository houseRepository;
    @Override
    public List<ApplianceEntity> searchAllAppliance() {
        return applianceRepository.findAll();
    }

    @Override
    public List<BedroomEntity> searchAllBedrooms() {
        return bedroomRepository.findAll();
    }

    @Override
    public List<HouseEntity> searchAllHouses() {
        return houseRepository.findAll();
    }
}
