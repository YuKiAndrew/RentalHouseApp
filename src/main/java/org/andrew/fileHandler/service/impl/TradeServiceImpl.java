package org.andrew.fileHandler.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.andrew.fileHandler.Entity.ApplianceEntity;
import org.andrew.fileHandler.dto.SellDto;
import org.andrew.fileHandler.repository.TradeRepository;
import org.andrew.fileHandler.service.TradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
public class TradeServiceImpl implements TradeService {

    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private TradeRepository tradeRepository;

    @Transactional(rollbackFor = Exception.class)
    @Override
    public List<ApplianceEntity> sellProduct(SellDto sellDto) {
        String key = constructSellKey(sellDto.getCategory(),sellDto.getProductName());
        try {
            if (Boolean.TRUE.equals(redisTemplate.hasKey(key))) {
                redisTemplate.opsForValue().decrement(key);
            } else {
                redisTemplate.opsForValue().set(key, sellDto.getQuantity());
            }
        } catch (Exception e) {
            redisTemplate.opsForValue().decrement(key);
            throw e;
        }
        return null;
    }

    private String constructSellKey(String...keys) {
        return new StringBuffer("andrew:sell:stock").append(Arrays.stream(keys).collect(Collectors.joining(":"))).toString();
    }
}
