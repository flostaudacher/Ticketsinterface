
public class TheaterTicket implements Ticketinterface{
	private String eventLocation;
	private String eventName;
	private String date;
	private double basicPrice;
	private double ticketPrice;
	public TheaterTicket(String eventLocation, String eventName, String date, double basicPrice) {
		setEventLocation(eventLocation);
		setEventName(eventName);
		setDate(date);
		setBasicPrice(basicPrice);
		calculateTicketPrice();
	}
	public TheaterTicket(String eventLocation, String eventName, String date) {
		this(eventLocation, eventName, date, 20);
	}
	public TheaterTicket(String eventLocation, String eventName) {
		this(eventLocation, eventName, "01.01.2020", 20);
	}
	public TheaterTicket(String eventLocation) {
		this(eventLocation, "", "01.01.2020", 20);
	}
	public TheaterTicket() {
		this("", "", "01.01.2020", 20);
	}
	public String getEventLocation() {
		return eventLocation;
	}
	public void setEventLocation(String eventLocation) {
		this.eventLocation = eventLocation;
	}
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public double getBasicPrice() {
		return basicPrice;
	}
	public void setBasicPrice(double basicPrice) {
		this.basicPrice = basicPrice;
	}
	public double getTicketPrice() {
		return ticketPrice;
	}
	public void setTicketPrice(double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	
	
	public void calculateTicketPrice() {
		if (eventLocation == "Landestheater") {
			ticketPrice = basicPrice * 0.5;
		}
		else if (eventLocation == "Theater Innsbruck") {
			ticketPrice = basicPrice * 1.5;
		}
		else {
			ticketPrice = basicPrice;
		}
	}
	public void output() {
		System.out.println();
		System.out.println("															 ");
		System.out.println("|\t\t"+eventLocation+"             |");
		System.out.println("	"						+eventName+"                     |");
		System.out.println("															  ");
		System.out.println("			"+date+ticketPrice+"€"+"            	  		  ");
		System.out.println("										   					  ");
	}
}