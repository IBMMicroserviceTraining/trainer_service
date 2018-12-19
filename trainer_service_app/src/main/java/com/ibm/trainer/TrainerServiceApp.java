/**
 * 
 */
package com.ibm.trainer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author saket
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
public class TrainerServiceApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(TrainerServiceApp.class, args);

	}

}
