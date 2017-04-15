import java.util.*;
public class Portfolio
{
    private double cash;
    private LinkedList<Share> shareList;
    
    public Portfolio(){
        cash = 0;
        shareList = new LinkedList<>();
    }

    public void addShare(Share share)
    {
        shareList.add(share);
    }

    public void setCash(double money) {
        cash = money;
    }
    public double getCash()
    {
        return cash;
    }
    public LinkedList<Share> getShareList()
    {
        return shareList;
    }
}
