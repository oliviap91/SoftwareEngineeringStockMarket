public class Client
{
    public Trader trader;
    private String clientName;
    private Portfolio portfolio;
    int risk;
    
    public Client(String clientName, Trader trader)
    {
        this.clientName = clientName;
        this.trader = trader;
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
