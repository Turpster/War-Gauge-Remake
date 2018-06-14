package com.Turpster.WarGauge.client;

import com.Turpster.WarGauge.Logger;

public class Client 
{
	private String username, password;
	
	public Logger logger;
	
	public Client(String username, String password, Logger logger)
	{
		this.username = username;
		this.password = password;
		
		this.logger = logger;
	}
}
