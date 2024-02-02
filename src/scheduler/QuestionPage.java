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
	
	public QuestionPage() {
		//testing out nodes, so I can properly view events?
		//Event blankEvent = new Event();
		//Node<Event> blankNode = new Node<Event>(blankEvent);
		//mon.myList.setHead(blankNode);
		//mon.myList.
		
		
	}
	
	public void promptAction(int action) {
		//set days to having no events
		boolean keepGoing = true;
		while(keepGoing) {
			
			//fix this little bit here... delete the two other scanners.
		Scanner actionScanner = new Scanner(System.in);
		System.out.println("");
    	
    	int nextAction = actionScanner.nextInt();
    	
		//int action = scanner.nextInt();
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
    		//exited = true;
    		keepGoing = false;
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
    	//LinkedList<Event> myEvent = new LinkedList<Event>();
    	//myEvent.add(new Event("tea party", 13, 15));
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
    		chosenDay = scanner.nextLine().toLowerCase();
    		break;
    	
    	}
    	}while(!eventSet);
    	
    	System.out.println("Event was added to Calendar");
    	
    	System.out.println("");
    	
    	int nextAction = eventScanner.nextInt();
    	promptAction(nextAction);
    	//promptAction();
    	//myEvent.
    	
    }
    

	public void viewEvents() {
    	//System.out.println("Second option selected");
    	//System.out.println(mon);
    	//System.out.println(tues);
		Scanner reader = new Scanner(System.in);
    	for(int i = 0; i<days.length; i++) {
    		System.out.println(days[i]);
    	
    		Node someNode = days[i].myList.getHead();
    		while(someNode != null) {
    			System.out.println(someNode.getValue().toString());
    			someNode = someNode.getNext();
    		}
    		
    	}
    	
    	System.out.println("");
    	
    	int nextAction = reader.nextInt();
    	promptAction(nextAction);
    	
    	
    }
    
    public void removeEvent() {
    	Scanner scannerA = new Scanner(System.in);
    	Scanner actionScanner = new Scanner(System.in);
    	System.out.println("Which day would you like to remove an event from?");
    	String dayChosen = scannerA.nextLine().toLowerCase();
    	
    	System.out.println("Enter the name of the event:");
    	String eventName  = scannerA.nextLine().toLowerCase();
    	
    	//boolean eventDeleted = false;
    	
    	int counter = 0;
    	int myDay = 0;
    	Node someEvent = null;
    	
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
        		return;
    			
    		}
    		
    		someEvent = days[myDay].myList.getHead();
    		while(someEvent != null) {
			if(((Event) someEvent.getValue()).getDescription().equals(eventName)) {
				days[myDay].myList.remove(counter);
				System.out.println("Event was removed from calender");
				
				return;
			}
    		
    		
    		someEvent = someEvent.getNext();
    		counter++;
    		}
    		
    		//only occurs if event was not removed:
    		
    		

    }
	
}
