package org.andrew.fileHandler.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.andrew.fileHandler.Entity.TestEntity;
import org.andrew.fileHandler.repository.TestRepository;
import org.andrew.fileHandler.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class TestServiceImpl implements TestService {

        @Autowired
        private  TestRepository testRepository;
    @Override
    public List<TestEntity> selectAll() {
        List<TestEntity> all = testRepository.findAll();
        return all;
    }
}
