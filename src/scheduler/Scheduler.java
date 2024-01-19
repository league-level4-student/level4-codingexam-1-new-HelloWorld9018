package scheduler;

import java.util.Scanner;

/*
 * Objective: Create a weekly scheduling application.
 * 
 * You may create any additional enums, classes, methods or variables needed
 * to accomplish the requirements below:
 * 
 * - You should use an array filled with enums for the days of the week and each
 *   enum should contain a LinkedList of events that includes a time and what is 
 *   happening at the event.
 * 
 * - The user should be able to to interact with your application through the
 *   console and have the option to add events, view events or remove events by
 *   day.
 *   
 * - Each day's events should be sorted by chronological order.
 *  
 * - If the user tries to add an event on the same day and time as another event
 *   throw a SchedulingConflictException(created by you) that tells the user
 *   they tried to double book a time slot.
 *   
 * - Make sure any enums or classes you create have properly encapsulated member
 *   variables.
 */
public class Scheduler {
	static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
    	
    	QuestionPage questions = new QuestionPage();
    	Scanner firstScan = new Scanner(System.in);
    	
    	System.out.println("Welcome to calendar. Type a number to perform an action\n(1) to add event\n(2) to view event\n"
    			+ "(3) to remove event");
    	int option = firstScan.nextInt();
    	//firstScan.close();
    	questions.promptAction(option);
    	
    	
    	
    	/*
    	checkForAction();
    	System.out.println("Stuff happening");
    	checkForAction();*/
    	
    	
    	
    }
    
    /*public static void checkForAction(){
    	
    	int input = scanner.nextInt();
    	
    }*/
    
    
}
