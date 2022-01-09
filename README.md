# Diary

## Project description

This was originally a team project for an object oriented programming course in Laurea UAS.
Our team consisted of 6 members, but in the end only I and Saara did other than brainstorming.

We came up with an idea of a simple diary application where implementing database and GUI makes sense.

I have worked on fixing the application after the course ended and I will be going over 
the functionalities then and now.


## Course requirements

- Make an application with different classes.
- Implement a database in a meaningful way.
- Make a GUI for the application.


## Database server

- MySQL Community local server

Download MySQL community server: https://dev.mysql.com/downloads/mysql/

How to set up local MySQL community server: 
https://www.youtube.com/watch?v=2HQC94la6go&t=3s&ab_channel=BlaineRobertson


## Languages

- Java
- SQL (queries)

## Tools

- Eclipse IDE (Compiling the code)
- JavaFX library (GUI)
- JDBC API (MySQL Database connection)

## Functionalities then

- **Graphical user interface**
	- Text input fields (Saara)
	- Save, Cancel buttons (Saara)
	- Old entries button (Joni)
	- Textfield (label) (Joni)

- **Java code** (Joni)
	- DatabaseConnection class
	- Controller class (link between GUI and Methods)
	- Main class

- **Functionalities**
	- User can add entries
	- Old entries can be brought back from "Old entries" -button
	- Entries displayed inside a label (bad solution)

## Functionalities now

- **Graphical user interface**
	- Text input fields (Saara)
	- Save, Cancel buttons (Saara)
	- Textfield (TextArea) (Joni)
	- Delete button (Joni)

- **Java code** (Joni)
	- DatabaseConnection class
	- Controller class (link between GUI and Methods)
	- Entry class
	- Main class
	
- **Functionalities**	
	- User can add entries
	- When adding an entry, it shows on top as it is the most recent 
	- Entries brought from database are arranged properly (most recent on top)
	- Old entries are brought when application is started, Old entries button removed
	- User can now delete most recent entry
	- Changed Textfield from label element to TextArea element,
	  now every entry can be seen thanks to the scrollbar

## How to run?
 
Video instructions that I made: https://youtu.be/WPQ_Po6dUvk

Download Eclipse IDE: https://www.eclipse.org/downloads/

ownload JDBC driver: https://dev.mysql.com/downloads/connector/j/

DOwnload JavaFX: https://gluonhq.com/products/javafx/
(Choose SDK for your respective OS)


