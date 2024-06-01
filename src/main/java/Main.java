// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
/**
Filename: W2U1A4A1_Alishba_Tariq_Sleep
Author: Alishba Tariq 
Date:  Sunday, February 25, 2024
Purpose:  To figure out how many hourse and days a person slept in their life.
*/

import java.util.Scanner;  

public class Main {
    public static void main(String[] args) {  
      Scanner keyedInput = new Scanner(System.in);  
      String inputAmount = "";  
      int birthYear, birthMonth, birthDate;
  int currentYear, currentMonth, currentDate;
 

  System.out.println("Enter your birth year: ");
     
      
      inputAmount = keyedInput.nextLine();
      birthYear = Integer.parseInt(inputAmount);
      System.out.println("Enter your birth month: ");
      inputAmount = keyedInput.nextLine();
      birthMonth = Integer.parseInt(inputAmount);
      System.out.println("Enter your birth date: ");
      inputAmount = keyedInput.nextLine();
      birthDate = Integer.parseInt(inputAmount);
      System.out.println("Enter the current year: ");
      inputAmount = keyedInput.nextLine();
      currentYear = Integer.parseInt(inputAmount);
      System.out.println("Enter the current month: ");
       inputAmount = keyedInput.nextLine();
      currentMonth = Integer.parseInt(inputAmount);
      System.out.println("Enter the current date: ");
      inputAmount = keyedInput.nextLine();
      currentDate = Integer.parseInt(inputAmount);
      int daysAlive = (currentYear - birthYear)*365   + (currentMonth - birthMonth)*30 + (currentDate - birthDate); 
      int hoursSlept = (daysAlive * 8);
      int daysSlept = (hoursSlept / 24);
      System.out.println("You have slept for " + daysSlept + " days.");
      System.out.println("You have slept for " + hoursSlept + " hours.");
    }
}