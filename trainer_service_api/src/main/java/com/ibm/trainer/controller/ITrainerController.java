package com.ibm.trainer.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ibm.trainer.model.TrainerCompanyModel;

@RequestMapping("/trainer")
public interface ITrainerController {

	@RequestMapping(value="/get/info",method=RequestMethod.GET)
	public List<TrainerCompanyModel> getAllTrainerCompanyModel();
	
	@RequestMapping(value="/get/info/{id}",method=RequestMethod.GET)
	public TrainerCompanyModel getTrainerCompanyModelByTrainerId(@PathVariable("id") String id);
}
