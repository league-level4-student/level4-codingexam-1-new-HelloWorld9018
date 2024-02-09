package scheduler;

import java.util.Scanner;

public class QuestionPage {
	
	Days[] days = Days.values();
	
	Days mon = days[0];
	Days tues = days[1];
	Days wed = days[2];
	Days thur = days[3];
	Days fri = days[4];
	Days sat = days[5];
	Days sun = days[6];
	Scanner scanner = new Scanner(System.in);
	boolean keepGoing = true;
	
	
	public void promptAction(int action) {
		
		while(keepGoing) {
			
			System.out.println("");
    	
	    	switch (action) {
	    	case 1:	
	    		addEvent();
	    		break;
	    	case 2:
	    		viewEvents();
	    		break;
	    	case 3:
	    		removeEvent();
	    		break;
	    	case 4:
	    		keepGoing = false;
	    		System.out.println("Thank you for using calendar");
	    		break;
	    	default:
	    		System.out.println(action + " is not one of the options. Please enter a number 1-3");
	    		break;
	    	}
    	
		}
		
		
		
	}
	
			public void addEvent() {
				Scanner eventScanner = new Scanner(System.in);
		    	System.out.println("Which day would you like to add an event to?");
		    	String chosenDay = eventScanner.nextLine().toLowerCase();
		    	
		    	System.out.println("Enter a description of the event: ");
		    	String description = eventScanner.nextLine();
		    	System.out.println("Enter the start time (military time): ");
		    	int start = eventScanner.nextInt();
		    	System.out.println("Enter the end time (military time): ");
		    	int end = eventScanner.nextInt();
		    	
		    	boolean eventSet = false;
		    	
		    	do {
		    	switch(chosenDay) {
		    	case "monday":
		    		mon.myList.add(new Event(description, start, end));
		    		
		    		eventSet = true;
		    		break;
		    		
		    	case "tuesday":
		    		tues.myList.add(new Event(description, start, end));
		    		eventSet = true;
		    		break;
		    	
		    	case "wednesday":
		    		wed.myList.add(new Event(description, start, end));
		    		eventSet = true;
		    		break;
		    		
		    	case "thursday":
		    		thur.myList.add(new Event(description, start, end));
		    		eventSet = true;
		    		break;
		    		
		    	case "friday":
		    		fri.myList.add(new Event(description, start, end));
		    		eventSet = true;
		    		break;
		    	
		    	case "saturday":
		    		sat.myList.add(new Event(description, start, end));
		    		eventSet = true;
		    		break;
		    		
		    	case "sunday":
		    		sun.myList.add(new Event(description, start, end));
		    		eventSet = true;
		    		break;
		    	
		    	default:
		    		System.out.println("Sorry, " + chosenDay + " isn't recognised. Double check your spelling and type again.");
		    		chosenDay = eventScanner.nextLine().toLowerCase();
		    		break;
		    	
		    	}
		    	}while(!eventSet);
		    	
		    	System.out.println("Event was added to Calendar");
		    	
		    	System.out.println("");
		    	
		    	int nextAction = scanner.nextInt();
		    	promptAction(nextAction);
		    	//promptAction();
		    	//myEvent.
		    	
		    }
    

	public void viewEvents() {
    
    	for(int i = 0; i<days.length; i++) {
    		System.out.println(days[i]);
    	
    		Node<Event> someNode = days[i].myList.getHead();
    		while(someNode != null) {
    			System.out.println(someNode.getValue().toString());
    			someNode = someNode.getNext();
    		}
    		
    	}
    	
    	System.out.println("");
    	
    	int nextAction = scanner.nextInt();
    	promptAction(nextAction);
    	
    	
    }
    
		    public void removeEvent() {
		    	Scanner scannerA = new Scanner(System.in);
		    	
		    	System.out.println("Which day would you like to remove an event from?");
		    	String dayChosen = scannerA.nextLine().toLowerCase();
		    	
		    	System.out.println("Enter the name of the event:");
		    	String eventName  = scannerA.nextLine().toLowerCase();
		    	    	
		    	int counter = 0;
		    	int myDay = 0;
		    	Node<Event> someEvent = null;
		    	boolean gate = true;
		    	
		    		switch(dayChosen) {
		    		case "monday":
		    			myDay = 0;
		    			
		    			break;
		    			
		    		case "tuesday":
		    			myDay = 1;
		    			break;
		    			
		    		case "wednesday":
		    			myDay = 2;
		    			
		    			break;
		    		
		    		case "thursday":
		    			myDay = 3;
		    			break;
		    			
		    		case "friday":
		    			myDay = 4;
		    			break;
		    			
		    		case "saturday":
		    			myDay = 5;
		    			break;
		    			
		    		case "sunday":
		    			myDay = 6;
		    			break;
		    			
		    		default:
		    			System.out.println("Sorry, " + dayChosen + " isn't recognised. Double check your spelling and type again.");
		        		dayChosen = scannerA.nextLine().toLowerCase();
		        		gate = false;
		        		break;
		    			
		    		}
		    		
		    		//study this a bit more
		    		if(gate) {
			    		someEvent = days[myDay].myList.getHead();
			    		
			    		boolean responded = false;
			    		
			    		while(someEvent != null) {
							if(((Event) someEvent.getValue()).getDescription().equals(eventName)) {
								days[myDay].myList.remove(counter);
								System.out.println("Event was removed from calender");
								responded = true;
								break;
							}
			    		someEvent = someEvent.getNext();
			    		counter++;
			    		}
			    		
			    		if(!responded) {
			    			System.out.println("Event does not exist");
			    		}
		    		
		    		}
		    		
		    		int nextAction = scanner.nextInt();
		        	promptAction(nextAction);
		    		
		
		    }
	
}
