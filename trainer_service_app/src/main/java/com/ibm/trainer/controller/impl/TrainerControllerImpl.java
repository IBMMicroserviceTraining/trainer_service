/**
 * 
 */
package com.ibm.trainer.controller.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.trainer.config.props.TrainerProperties;
import com.ibm.trainer.controller.ITrainerController;
import com.ibm.trainer.model.TrainerCompanyModel;

import lombok.extern.slf4j.Slf4j;

/**
 * @author saket
 *
 */
@RestController
@Slf4j
public class TrainerControllerImpl implements ITrainerController {

	
	@Autowired
	TrainerProperties trainerProps;
	
	private static final String className = TrainerControllerImpl.class.toString();
	
	List<TrainerCompanyModel> modelList = new ArrayList<TrainerCompanyModel>();
	TrainerControllerImpl()
	{
       for(int i=0;i<3;i++)
       {
    	   TrainerCompanyModel compModel = new TrainerCompanyModel();
    	   compModel.setTrainerCompanyId("00608V"+i);
    	   compModel.setTrainerDesignation("Rest Services lead_"+i);
    	   compModel.setTrainerLocation("Manyatha_"+i);
    	   modelList.add(compModel);
       }
	}
	
	/**
	 * 
	 */
	public List<TrainerCompanyModel> getAllTrainerCompanyModel() {
		String methodName = "getAllTrainerCompanyModel";
		log.info(className+"->"+methodName);
		log.info("trainer location is::"+trainerProps.getLocation());
		return modelList;
	}

	/**
	 * 
	 */
	public TrainerCompanyModel getTrainerCompanyModelByTrainerId(@PathVariable String id) {
		String methodName = "getTrainerCompanyModelByTrainerId";
		log.info(className+"->"+methodName);
		TrainerCompanyModel compModel = new TrainerCompanyModel();
		modelList.forEach(trainerModel ->{
			if(trainerModel.getTrainerCompanyId().equalsIgnoreCase(id))
			{
				compModel.setTrainerCompanyId(id);
				compModel.setTrainerDesignation(trainerModel.getTrainerDesignation());
				compModel.setTrainerLocation(trainerModel.getTrainerLocation());
			}
		});
		return compModel;
	}

}
