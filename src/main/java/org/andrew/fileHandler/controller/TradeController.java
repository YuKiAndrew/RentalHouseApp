package org.andrew.fileHandler.controller;

import org.andrew.fileHandler.Entity.ApplianceEntity;
import org.andrew.fileHandler.dto.SellDto;
import org.andrew.fileHandler.helper.Response;
import org.andrew.fileHandler.repository.TradeRepository;
import org.andrew.fileHandler.service.TradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/api/trade")
public class TradeController {


    @Autowired
    private TradeService tradeService;

    @RequestMapping(value = "/sell",method = RequestMethod.GET)
    @ResponseBody
    public Response sell(@RequestBody SellDto sellDto) {
        List<ApplianceEntity> applianceEntities = tradeService.sellProduct(sellDto);
        return new Response().success(applianceEntities);
    }
}
