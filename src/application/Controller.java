package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Controller {

    @FXML
    private Button cancelEntry;

    @FXML
    private Button saveEntry;
    
    @FXML
    private Button oldEntries;

    @FXML
    private TextField userTextInput;

    @FXML
    private TextField userTitleInput;
    
    @FXML 
    private Label fieldForEntries;
    
    String entry;
    String headline;
    
    @FXML
    void SaveEntry(ActionEvent event) {
    	
    	
    	headline = userTitleInput.getText();
    	entry = userTextInput.getText();
    	Date date = new Date();
    	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    	String formattedDate = sdf.format(date);
    	
    	// Adds the new desired entry to the field for entries.
    	addTextToLabel(entry, headline, formattedDate);
    	
    	// Saves the entry to the database also.
    	addEntryToDatabase(entry, headline, formattedDate);
    	
    	// Clears input fields.
    	userTextInput.setText("");
    	userTitleInput.setText("");
    }


    @FXML
    void CancelEntry(ActionEvent event) {
    	
    	// Clears input fields.
    	userTextInput.setText("");
    	userTitleInput.setText("");

    }
    
    @FXML 
    void oldEntries(ActionEvent event) {
    	
    	if (fieldForEntries.getText().isEmpty()) {
    		getEntriesFromDatabase();
    	}

    }
    
    
    // This method updates the field for entries when a new entry is added. And also updates the database.
    void addTextToLabel (String entry, String headline, String date) {	
    	
    	String wholeEntry = "\n" + headline + " " + date + "\n" + entry + "\n";
    	
    	fieldForEntries.setText(fieldForEntries.getText() + wholeEntry);
    }
    
    // DB connection and adding entry to the database.
    void addEntryToDatabase(String entry, String headline, String date) {
    	
        Connection connection = null;
        Statement statementOne = null;
        ResultSet resultSet = null;
        Statement statementTwo = null;
        int idCount = 0;
        
		connection = DatabaseConnection.getConnection();
		
    	try {
    		
    		statementOne = connection.createStatement();
    		
    		String query = "SELECT entryID FROM entries";
    		
    		resultSet = statementOne.executeQuery(query);
    		
    		while (resultSet.next()) {
    			idCount = resultSet.getInt("entryID");
    		}
			
		} catch (Exception e) {
			System.out.println(e);
		}
    	
    	try {
    		
    		idCount = idCount + 1;
    		
    		statementTwo = connection.createStatement();
    		
    		String addEntry = "INSERT INTO entries (entryID, entry, headline, entryDate) VALUES (" + idCount + ",'" + entry + "','" + headline + "','" + date + "')";
    		    		
    		statementTwo.executeUpdate(addEntry);
    		 		
			
		} catch (Exception e) {
			System.out.println(e);
		}
    }
    
    // Bringing entries from the database to the GUI. 
    public void getEntriesFromDatabase() {
    	
    	Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        
		connection = DatabaseConnection.getConnection();
		
		try {
			
			statement = connection.createStatement();
    		
    		String query = "SELECT entry, headline, entryDate FROM entries";
    		
    		resultSet = statement.executeQuery(query);
    		
    		while (resultSet.next()) {
    			
    			String dbEntry = resultSet.getString("entry");
    			String dbHeadline = resultSet.getString("headline");
    			String dbEntryDate = resultSet.getString("entryDate");
    			
    			addTextToLabel(dbEntry, dbHeadline, dbEntryDate);		 
    		}		
		} catch (Exception e) {
			System.out.println(e);
		}
    	
    }
}