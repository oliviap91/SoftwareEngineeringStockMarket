public class Share
{
    private String shareName;
    private double sharePrice;
    private boolean isWorthless;
    private int numOfShares;

    public Share(String shareName, double sharePrice, int numOfShares)
    {
        this.shareName = shareName;
        this.sharePrice = sharePrice;
        this.numOfShares = numOfShares;
        isWorthless = false;
    }

    public String getShareName()
    {
        return shareName;
    }
    public double getSharePrice()
    {
        return sharePrice;
    }
    public boolean IsWorthless()
    {
        return isWorthless;
    }
    public int NumOfShares() { return numOfShares; }

    public void updateSharePrice(double value)
    {
        sharePrice = value;
        if(sharePrice == 0)
        {
            isWorthless = true;
        }
    }
}
