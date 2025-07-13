package org.andrew.fileHandler.repository;

import org.andrew.fileHandler.Entity.HouseEntity;
import org.andrew.fileHandler.Entity.TestEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HouseRepository extends JpaRepository<HouseEntity,String> {

}
