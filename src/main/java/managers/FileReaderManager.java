package managers;

import dataProvider.ConfigurationFileReader;
import utility.TestDataFileReader;

public class FileReaderManager {

	private static FileReaderManager fileReaderManager = new FileReaderManager();
	private static ConfigurationFileReader configFileReader;
	private static TestDataFileReader testDataFileReader;
	
	private FileReaderManager() {
	}
	
	/**
	 * Method to get the instance for FileReaderManager
	 */
	public static FileReaderManager getInstance( ) {
	      return fileReaderManager;
	 }

	/**
	 * Method to get the object for ConfigurationFileReader
	 */
	 public ConfigurationFileReader getConfigReader() {
		 return (configFileReader == null) ? new ConfigurationFileReader() : configFileReader;
	 }
	 
	 /**
		 * Method to get the object for TestDataFileReader
		 */
	 public TestDataFileReader getTestDataFileReader() {
		 return (testDataFileReader == null) ? new TestDataFileReader() : testDataFileReader;
	 }
}
