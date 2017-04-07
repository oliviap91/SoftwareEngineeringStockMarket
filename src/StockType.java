/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cao31
 */
abstract class StockType  {
    
    int valueOfWorth;
    int variation;
 
  public StockType() {
    }
    
  int getValueOfWorth(){
    return valueOfWorth;
  }

  int getVariation(){
      return variation;
  }
  
  void setValueOfWorth(int val){
  }


}
