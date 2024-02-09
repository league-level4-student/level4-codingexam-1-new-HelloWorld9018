package scheduler;

public class Event {
	private String description;
	private int startTime; //military time
	private int endTime;
	
	
	public Event(String description, int startTime, int endTime) {
		this.description = description;
		this.startTime = startTime;
		this.endTime = endTime;
	}
	public Event() {
		description = "nothing planned";
		startTime = 0;
		endTime = 0;
	}
	
	public String toString() {
		return description + " at " + startTime + " to " + endTime;
	}
	
	public String getDescription() {
		return description;
	}
	
	public int getStartTime() {
		return startTime;
	}
	
	public int getEndTime() {
		return endTime;
	}
}
