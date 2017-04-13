public class FoodStock extends StockType
{
    public FoodStock(int val)
    {
        variation = 0;
        valueOfWorth = val;
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

    public void setVariation(int var)
    {
        variation = var;
    }
}
