package com.Turpster.WarGauge;

import com.Turpster.WarGauge.Logger.Level;
import com.Turpster.WarGauge.client.Client;

public class WarGauge 
{
	public static void main(String[] args)
	{
		Logger logger = new Logger(System.out);
		for (int x = 0; x < args.length; x++)
		{
			String arg = args[x];
			if (arg.equalsIgnoreCase("-server"))
			{
				
			}
			else
			{
				String username = null, password = null;
				if (arg.equalsIgnoreCase("-username"))
				{
					if (args.length <= x + 1)
					{
						username = args[x + 1];
					}
					else
					{
						logger.log(Level.ERROR, "Username was not set.");
					}
				}
				else
				{
					logger.log(Level.ERROR, "Username was not set.");
					System.exit(0);
				}
				if (arg.equalsIgnoreCase("-password"))
				{
					if (args.length <= x + 1)
					{
						password = args[x + 1];
					}
					else
					{
						logger.log(Level.ERROR, "Password was not set.");
					}
				}
				else
				{
					logger.log(Level.ERROR, "Password was not set.");
					System.exit(0);
				}
				
				new Client(username, password, logger);
			}
		}
	}
}
