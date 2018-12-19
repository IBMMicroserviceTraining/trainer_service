/**
 * 
 */
package com.ibm.trainer.config.props;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Getter;
import lombok.Setter;

/**
 * @author saket
 *
 */
@Configuration
@ConfigurationProperties(prefix="trainer")
@Getter
@Setter
public class TrainerProperties {

	private String location;
}
