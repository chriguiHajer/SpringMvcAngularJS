package com.mower.springmvc.service;

import java.util.List;

import com.mower.springmvc.model.Mower;

public interface ParseService {

	List<Mower> getMowers() throws Exception;

}
