package org.andrew.fileHandler.service;

import org.andrew.fileHandler.Entity.ApplianceEntity;
import org.andrew.fileHandler.dto.SellDto;

import java.util.List;

public interface TradeService {
    List<ApplianceEntity> sellProduct(SellDto sellDto);
}
