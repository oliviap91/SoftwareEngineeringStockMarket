abstract class Trader
{
    private TraderMode traderMode;

    public Trader(TraderMode traderMode)
    {
        this.traderMode = traderMode;
    }

    public abstract void buyShare(String companyName);

    public abstract void sellShare();

    public TraderMode getTraderMode()
    {
        return traderMode;
    }
    public void setTraderMode(TraderMode traderMode)
    {
        this.traderMode = traderMode;
    }
}
