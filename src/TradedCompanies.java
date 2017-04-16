public class TradedCompanies
{
    private String name;
    private StockType stockType;
    private double stockPrice;
    private int totalShares;
    
    public TradedCompanies(String name, StockType stockType, double stockPrice, int totalShares)
    {
        this.name = name;
        this.stockType = stockType;
        this.stockPrice = stockPrice;
        this.totalShares = totalShares;
    }
    public double getStockPrice()
    {
        return stockPrice;
    }
    public String getName()
    {
        return name;
    }
    public StockType getStockType()
    {
        return stockType;
    }
}
