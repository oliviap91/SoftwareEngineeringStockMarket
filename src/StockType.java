abstract class StockType
{
    int valueOfWorth;
    int variation;
 
    public StockType()
    {
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
