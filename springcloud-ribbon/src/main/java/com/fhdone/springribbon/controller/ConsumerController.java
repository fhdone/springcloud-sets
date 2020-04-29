package com.fhdone.springribbon.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fhdone.springribbon.service.ComputeService;

@RestController
public class ConsumerController {


    private final Logger logger = LogManager.getLogger(getClass());

	@Autowired
	private ComputeService computeService;
	
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String add() {
        logger.info("add invoked");
		return computeService.addService();
	}

}