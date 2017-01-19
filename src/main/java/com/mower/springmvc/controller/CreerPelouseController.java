package com.mower.springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mower.springmvc.model.Mower;
import com.mower.springmvc.service.MowerService;

@Controller
@RequestMapping
public class CreerPelouseController {

	@Autowired
    MowerService  mowerService; 
	
	@RequestMapping(value="/", method = RequestMethod.GET)
	public ModelAndView creerPelouse(
			final BindingResult pBindingResult, final ModelMap pModel) {
		List<Mower> listeMowers = new ArrayList<Mower>(); 
	    try {
	    	
	    	listeMowers = mowerService.getMowers();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return new ModelAndView("/","listePowers",listeMowers);
	}
	
}
