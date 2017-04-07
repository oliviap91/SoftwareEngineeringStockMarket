/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cao31
 */
public class FoodStock extends StockType {

  public int variation;
  public int valueOfWorth;
 
  public FoodStock() {
    variation = 0;
    valueOfWorth = 0;
  }
    
  int getValueOfWorth(){
    return valueOfWorth;
  }

  int getVariation(){
    return variation;
  }
  
  void setValueOfWorth(int val){
    valueOfWorth = val;
  }

  void setVariation(int var){
    variation = var;
  }
}
