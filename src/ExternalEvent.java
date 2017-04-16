public class ExternalEvent
{
    private Date dateOfEvent;
    private String natureOfEvent;
    private String action;
    private int duration; // the duration of the event, in days
    private String stockTypeAffected;

    public ExternalEvent(Date dateOfEvent, String natureOfEvent, String action, String stockTypeAffected, int duration)
    {
        this.dateOfEvent = dateOfEvent;
        this.natureOfEvent = natureOfEvent;
        this.action = action;
        this.stockTypeAffected = stockTypeAffected;
        this.duration = duration;
    }

    public Date getDateOfEvent()
    {
        return dateOfEvent;
    }
    public String getNatureOfEvent()
    {
        return natureOfEvent;
    }
    public String getAction()
    {
        return action;
    }
    public int getDuration() { return duration; }
    public String getStockTypeAffected()
    {
        return stockTypeAffected;
    }


}
