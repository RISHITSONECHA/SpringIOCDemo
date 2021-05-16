package com.demo.main;

import com.demo.serviceProvider.ServiceProvider;
import com.demo.services.ServiceBundle;

public class User {
	private ServiceProvider sim;
	private ServiceBundle serviceBundle;
	
	
	public User(ServiceProvider sim, ServiceBundle serviceBundle) {
		this.sim = sim;
		this.serviceBundle = serviceBundle;
	}
	
//	public void setServiceBundle(ServiceBundle serviceBundle) {
//		this.serviceBundle = serviceBundle;
//	}
//
//	public void setServiceProvider(ServiceProvider serviceProvider) {
//		this.sim = serviceProvider;
//	}
	
	public void service() {
		sim.simService();
		serviceBundle.activatedService();
	}

}
