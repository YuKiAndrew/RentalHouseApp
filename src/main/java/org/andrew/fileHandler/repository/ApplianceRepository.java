package org.andrew.fileHandler.repository;

import org.andrew.fileHandler.Entity.ApplianceEntity;
import org.andrew.fileHandler.Entity.TestEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplianceRepository extends JpaRepository<ApplianceEntity,String> {

}
