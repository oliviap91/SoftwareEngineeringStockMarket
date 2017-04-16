public class StockType
{
    int valueOfWorth;
    int variation;
    String name;
 
    public StockType(String name)
    {
        this.name = name;
        valueOfWorth = 0;
        variation = 0;
    }
    
    public int getValueOfWorth()
    {
        return valueOfWorth;
    }
    public int getVariation()
    {
        return variation;
    }
    public void setValueOfWorth(int val)
    {
        valueOfWorth = val;
    }
}
