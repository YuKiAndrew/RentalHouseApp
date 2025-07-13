package org.andrew.fileHandler.controller;


import org.andrew.fileHandler.Entity.ApplianceEntity;
import org.andrew.fileHandler.Entity.BedroomEntity;
import org.andrew.fileHandler.Entity.HouseEntity;
import org.andrew.fileHandler.helper.Response;
import org.andrew.fileHandler.service.DisplayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/api/display")
public class DisplayController {

    @Autowired
    private DisplayService displayService;

    @RequestMapping(value = "/findAllAppliances",method = RequestMethod.GET)
    @ResponseBody
    public Response findAllAppliances() {
        List<ApplianceEntity> applianceEntities = displayService.searchAllAppliance();
        return new Response().success(applianceEntities);
    }

    @RequestMapping(value = "/findAllBedrooms",method = RequestMethod.GET)
    @ResponseBody
    public Response findAllBedrooms() {
        List<BedroomEntity> bedroomEntities = displayService.searchAllBedrooms();
        return new Response().success(bedroomEntities);
    }

    @RequestMapping(value = "/findAllHouses",method = RequestMethod.GET)
    @ResponseBody
    public Response findAllHouses() {
        List<HouseEntity> HouseEntities = displayService.searchAllHouses();
        return new Response().success(HouseEntities);
    }

}
