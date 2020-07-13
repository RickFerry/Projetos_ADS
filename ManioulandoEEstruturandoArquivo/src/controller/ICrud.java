package controller;

import java.io.IOException;

public interface ICrud {
	
	public void createFile(String path, String name) throws IOException;
	public void readFile(String path, String name)throws IOException;
	public void writerInFile(String path, String name)throws IOException;
	public void deleteFile(String path, String name)throws IOException;
}
