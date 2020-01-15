public abstract class Ticket {
	String eventLocation;
	String eventName;
	String date;
	double basicPrice;
	double ticketPrice;
	
	public abstract void calculateTicketPrice();
	
	public void setEventLocation(String eventLocation) {
		this.eventLocation = eventLocation;
	}
	public String getEventLocation() {
		return eventLocation;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	public String getEventName() {
		return eventName;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getDate() {
		return date;
	}
	public void setBasicPrice(double basicPrice) {
		this.basicPrice = basicPrice;
	}
	public double getBasicPrice() {
		return basicPrice;
	}
	
	public void output() {
		System.out.println();
		System.out.println("															 ");
		System.out.println("|\t\t"+eventLocation+"             |");
		System.out.println("	"						+eventName+"                     |");
		System.out.println("															  ");
		System.out.println("			"+date+ticketPrice+"�"+"            	  		  ");
		System.out.println("										   					  ");
	}
}