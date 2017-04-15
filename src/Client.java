public class Client
{
    String clientName;
    Portfolio portfolio;
    int risk;
    
    public Client(String clientName)
    {
        this.clientName = clientName;
        portfolio = new Portfolio();
    }
    
    public void setRisk(int risk)
    {
        this.risk = risk;
    }
    public void updateWorth()
    {
        
    }
    
}
