public class HardStock extends StockType{
    
   public int variation;
  public int valueOfWorth;
 
  public HardStock() {
    variation = 0;
    valueOfWorth = 0;
  }
    
   @Override
  int getValueOfWorth(){
    return valueOfWorth;
  }

  int getVariation(){
    return variation;
  }
  
   @Override
  void setValueOfWorth(int val){
    valueOfWorth = val;
  }

  void setVariation(int var){
    variation = var;
  }
    
}
