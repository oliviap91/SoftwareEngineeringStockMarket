public class TechnologyStock extends StockType {
    
  public int variation;
  public int valueOfWorth;
 
  public TechnologyStock() {
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
