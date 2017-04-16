public class TraderMode
{
    private double toSellPercentage;
    private double toBuyPercentage;
    private String traderType;
    public TraderMode(double toSell, double toBuy, String traderType)
    {
        this.traderType = traderType;
        generatePercentages(toSell, toBuy);
    }

    public void generatePercentages(double toSell, double toBuy)
    {
        toSellPercentage = Math.random()*toSell;
        toBuyPercentage = Math.random()*toBuy;
    }

    public double getToSellPercentage()
    {
        return toSellPercentage;
    }
    public double getToBuyPercentage()
    {
        return toBuyPercentage;
    }
}
