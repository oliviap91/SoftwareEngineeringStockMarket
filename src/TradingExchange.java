import java.util.*;
public class TradingExchange
{
    private LinkedList<Share> sharesList;
    public TradingExchange()
    {
        sharesList = new LinkedList<>();
    }

    public void addShareToExchange(Share share)
    {
        sharesList.add(share);
    }

    public Share BuyShare(String shareName)
    {
        for (Share s : sharesList)
        {
            if(s.getShareName() == shareName)
            {
                Share temp = s;
                sharesList.remove(s);
                return temp;
            }
        }
        return null;
    }

    void buying(){
        
    }
    
    void selling(){
        
    }
    
}
