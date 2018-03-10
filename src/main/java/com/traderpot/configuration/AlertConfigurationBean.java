package com.traderpot.configuration;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class AlertConfigurationBean {
	private Map<Long,Double> durationVsPriceMovementMap;
	
	public AlertConfigurationBean() {
		durationVsPriceMovementMap = new HashMap<Long,Double>();
		loadConfigurationsFromDb();
	}

	private void loadConfigurationsFromDb() {
		// TODO change this method to fetch data from db
		durationVsPriceMovementMap.put(60000l, (double) 5);
		durationVsPriceMovementMap.put(300000l, (double) 10);
		durationVsPriceMovementMap.put(600000l, (double) 20);
	}
	
	public Map<Long,Double> getDurationVsPriceMovementMap() {
		return durationVsPriceMovementMap;
	}
}
