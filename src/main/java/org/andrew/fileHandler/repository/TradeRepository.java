package org.andrew.fileHandler.repository;

import org.andrew.fileHandler.Entity.ApplianceEntity;
import org.andrew.fileHandler.dto.SellDto;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface TradeRepository {

    List<ApplianceEntity> sellProduct(SellDto sellDto);
}
