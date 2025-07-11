package org.andrew.fileHandler.service;

import org.andrew.fileHandler.Entity.TestEntity;

import java.util.List;

public interface TestService {

    List<TestEntity> selectAll();
}
