package com.mower.springmvc.controller;
 
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mower.springmvc.model.Mower;
import com.mower.springmvc.service.MowerService;
 
@RestController
public class MyRestController {
 
    @Autowired
    MowerService  mowerService; 
 
    
    //-------------------Retrieve All Mowers--------------------------------------------------------
     
    @RequestMapping(value = "/mowers/", method = RequestMethod.GET)
    public ResponseEntity<List<Mower>> listAllMowers() throws Exception {
        List<Mower> mowers = mowerService.getMowers() ;
        if(mowers.isEmpty()){
            return new ResponseEntity<List<Mower>>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
        }
        return new ResponseEntity<List<Mower>>(mowers, HttpStatus.OK);
    }
 
}