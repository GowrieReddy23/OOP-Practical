package Lab2;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class Dateclass {
 public static void main(String[] args) {
   // TODO Auto-generated method stub
  LocalDate currentdate = LocalDate.now();
     System.out.println("Current Date: " + currentdate);
     LocalTime currentTime = LocalTime.now();
     System.out.println("Current Time: " + currentTime);
     
     Date currentDate = new Date();
     System.out.println("Current Date and Time: " + currentDate);
     System.out.println("Date as String: " + currentDate.toString());
   } 
  
 }