package com.Turpster.WarGauge;

import java.io.File;
import java.io.PrintStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger
{
	public PrintStream printStream;
	public File log;
	
	public enum Level
	{
		INFO,
		WARNING,
		SERVRE,
		ERROR,
		CRITICAL;
		
		@Override
		public String toString()
		{
			switch(this) 
			{
			case INFO:
				return "INFO";
			case WARNING:
				return "WARNING";
			case SERVRE:
				return "SERVRE";
			case ERROR:
				return "ERROR";
			case CRITICAL:
				return "CRITICAL";
			default:
				return null;
			}
		}
	}
	
	public Logger(PrintStream printStream)
	{
		this.printStream = printStream;
	}
	
	public void log(Level level, String message)
	{
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		printStream.println("~ " + "[" + dateFormat.format(new Date()) + "] " + level.toString() + ": " + message);
	}
}
