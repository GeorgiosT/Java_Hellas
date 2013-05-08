package com.ptai;

public class Tester3 {
	public static void main(String[] args) throws Exception {
		new Tester3();
	}

	public Tester3() throws Exception {
		Logger logger = new Logger();
		SystemStatus systemStatus = new SystemStatus();
		NetworkConnection networkConnection = new NetworkConnection();
		logger.appendToLog(systemStatus);
		logger.appendToLog(networkConnection);
		networkConnection.connect();
		Thread.sleep(2000);
		logger.appendToLog(systemStatus);
		logger.appendToLog(networkConnection);
		logger.close();
	}
}
