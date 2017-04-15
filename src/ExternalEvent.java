public class ExternalEvent
{
    private Date dateOfEvent;
    private String natureOfEvent;
    private String action;

    public ExternalEvent(Date dateOfEvent, String natureOfEvent, String action)
    {
        this.dateOfEvent = dateOfEvent;
        this.natureOfEvent = natureOfEvent;
        this.action = action;
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
}
