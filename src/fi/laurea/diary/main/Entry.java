package fi.laurea.diary.main;

import java.util.Date;

public class Entry {
	
	private int entryId;
	private String entry;
	private Date entryDate;
	
	// Constructor
	
	public Entry(String entry) {
		
		this.entryId = entryId;
		entryId++;
		this.entry = entry;
		this.entryDate = new Date();
	}

	// Setters & Getters

	public int getEntryId() {
		return entryId;
	}

	public void setEntryId(int entryId) {
		this.entryId = entryId;
	}

	public String getEntry() {
		return entry;
	}

	public void setEntry(String entry) {
		this.entry = entry;
	}

	public Date getEntryDate() {
		return entryDate;
	}

	public void setEntryDate(Date entryDate) {
		this.entryDate = entryDate;
	}

	
	// toString format of the Entry object.
	
	@Override
	public String toString() {
		return entryDate.toString() + "\n" + getEntry();
	}

	
}

