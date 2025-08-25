package th.mfu;

import java.util.Date;

public class Concert {

    private String title;
    private String description;
    private Date date;
    private String location;
    private double ticketPrice;

    public Concert() {
    }

    public Concert(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public Concert(String title, String description, Date date, String location, double ticketPrice) {
        this.title = title;
        this.description = description;
        this.date = date;
        this.location = location;
        this.ticketPrice = ticketPrice;
    }

    // Getters and Setters
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }

    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }
    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }
}
