package scheduler;

public enum Days {
	
	MONDAY(new LinkedList<Event>()), TUESDAY(new LinkedList<Event>()), WEDNESDAY(new LinkedList<Event>()), THURSDAY(new LinkedList<Event>()), FRIDAY(new LinkedList<Event>()), SATURDAY(new LinkedList<Event>()), SUNDAY(new LinkedList<Event>());
	
	LinkedList<Event> myList;
	
	
	Days(LinkedList<Event> myList){
		//LinkedList list inside parenthesis
		//myList.add(event);
		this.myList = myList;
	}

}
