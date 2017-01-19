package com.mower.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.mower.springmvc.model.Mower;
import com.mower.springmvc.util.ParseInput;

@Service("parseService")
public class ParseServiceImpl extends ParseInput implements ParseService {

	
	@Value("${url}")
	private String url ;
	
	
	public List<Mower> getMowers() throws Exception {

		return getMowersFromInput(url);
	}
	
	

}
