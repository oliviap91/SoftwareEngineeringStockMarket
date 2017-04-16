abstract class Trader
{
    private TraderMode traderMode;
    private String traderType;

    public Trader(TraderMode traderMode, String traderType)
    {
        this.traderMode = traderMode;
        this.traderType = traderType;
    }

    public abstract void buyShare(String companyName);

    public abstract void sellShare();

    public TraderMode getTraderMode()
    {
        return traderMode;
    }
    public String getTraderType() { return  traderType; }
    public void setTraderMode(TraderMode traderMode)
    {
        this.traderMode = traderMode;
    }
}
