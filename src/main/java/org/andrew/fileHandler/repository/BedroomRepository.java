package org.andrew.fileHandler.repository;

import org.andrew.fileHandler.Entity.BedroomEntity;
import org.andrew.fileHandler.Entity.TestEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BedroomRepository extends JpaRepository<BedroomEntity,String> {

}
