import java.util.LinkedList;
import java.util.Random;

public class RandomTrader extends Trader
{
    LinkedList<TradedCompanies> companies;
    StockType[] stock;
    public RandomTrader(TraderMode traderMode, LinkedList<TradedCompanies> comp)
    {
        super(traderMode, "random");
        this.companies = comp;
        stock = new StockType[10];
    }

    public void buyShare(String companyName)
    {
        Random rando = new Random(stock.length);
        for(int i = 0; i < companies.size();i++){
            if(companyName == companies.get(i).getName()){
                
            }
        }
    }

    public void sellShare()
    {

    }
}
