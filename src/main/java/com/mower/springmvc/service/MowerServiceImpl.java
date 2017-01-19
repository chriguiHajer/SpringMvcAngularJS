package com.mower.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mower.springmvc.model.Mower;

@Service("mowerService")
public class MowerServiceImpl implements MowerService {

	@Autowired
	ParseService parseService;

	public List<Mower> getMowers() throws Exception {
		return parseService.getMowers();
	}
	
	public void setParseService(ParseService parseService) {
		this.parseService = parseService;
	}

}
