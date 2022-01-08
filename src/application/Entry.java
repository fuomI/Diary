package application;

public class Entry {
	
	private String title;
	private String entry;
	private String date;
	
	public Entry(String entry, String title, String date) {
		
		this.title = title;
		this.entry = entry;
		this.date = date;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getEntry() {
		return entry;
	}

	public void setEntry(String entry) {
		this.entry = entry;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

}
