package com.demo.services;

public class ServiceBundle {
	
	StringBuffer sb = new StringBuffer();
	
	private CallingService callingservice;
	private DataService dataService;
	private HelloTuneService helloTuneService;
	
	
//	public ServiceBundle(CallingService callingservice, DataService dataService, HelloTuneService helloTuneService) {
//		this.callingservice = callingservice;
//		this.dataService = dataService;
//		this.helloTuneService = helloTuneService;
//	}
	

	
	public void activatedService() {
		
		if(callingservice != null) {
			if(sb.length() > 0 )
				sb.append(",");
			sb.append("calling service");
		}
		
		if(dataService != null) {
			if(sb.length() > 0 )
				sb.append(",");
			sb.append("data service");
		}
		
		if(helloTuneService != null) {
			if(sb.length() > 0 )
				sb.append(",");
			sb.append("hello tune service");
		}
		
		System.out.println("Activated services are : " + sb.toString());
	}


	public void setCallingservice(CallingService callingservice) {
		this.callingservice = callingservice;
	}


	public void setDataService(DataService dataService) {
		this.dataService = dataService;
	}


	public void setHelloTuneService(HelloTuneService helloTuneService) {
		this.helloTuneService = helloTuneService;
	}
}
