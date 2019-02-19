import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Handles record management Read, write, create, store, delete
 * 
 * @author Martin_2
 */
public class RecordHandler implements Runnable {

	private ArrayList<Record> records = new ArrayList<Record>();
	private Path recordDirectory = null;

	public RecordHandler(String directoryPath) {

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

	private class Record {
		private String id;
		private String patient;
		private String nurse;
		private String doctor;
		private String division;
	}

	public String read(String file) {
		// TODO Auto-generated method stub
		return "";
	}

	public void createRecordFor(String patient, String nurse, String doctor, String division, String data) {
		// TODO Auto-generated method stub

	}

	public boolean delete(String file) {
		try {
			return Files.deleteIfExists(Paths.get("file" + ".record"));
		} catch (IOException e) {
			return false;
		}
	}

	public void write(String file) {
		// TODO Auto-generated method stub

	}

	public void list() {
		// TODO Auto-generated method stub

	}
}
