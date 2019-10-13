package pack4;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Test1 {

	public static void main(String[] args) {
	    LocalDate date = LocalDate.now(); 
	    System.out.println("the current date is "+ date); 
	   
	    LocalTime time = LocalTime.now(); 
	    System.out.println("the current time is "+ time); 
	      
	    LocalDateTime current = LocalDateTime.now(); 
	    System.out.println("current date and time : "+ current); 
	    
	    DateTimeFormatter format =  DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");   
	    String formatedDateTime = current.format(format);   
	    System.out.println("in foramatted manner "+ formatedDateTime); 

	}

}
