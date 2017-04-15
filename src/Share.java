public class Share
{
    private String companyName;
    private double shareValue;
    private boolean isWorthless;
    private int numOfShares;
    private TradedCompanies tradedCompany;

    public Share(String companyName, int numOfShares, TradedCompanies tradedCompany)
    {
        this.companyName = companyName;
        shareValue = CalculateSharePrice();
        this.numOfShares = numOfShares;
        isWorthless = false;
        this.tradedCompany = tradedCompany;
    }

    public String getCompanyName()
    {
        return companyName;
    }
    public double getSharePrice()
    {
        return shareValue;
    }
    public boolean IsWorthless()
    {
        return isWorthless;
    }
    public int NumOfShares() { return numOfShares; }

    public void updateSharePrice(double value)
    {
        shareValue = value;
        if(shareValue == 0)
        {
            isWorthless = true;
        }
    }
    private double CalculateSharePrice()
    {
        return tradedCompany.getStockPrice()*numOfShares;
    }
}
