package fi.laurea.diary.main;

public class Main {

	public static void main(String[] args) {
		
		// Testing the functionalities of the Entry class.
		
		String testEntry = "Today I programmed";
		
		Entry myEntry = new Entry(testEntry);
		
		System.out.println(myEntry.toString());
	}

}
