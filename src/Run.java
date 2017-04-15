import java.util.*;
public class Run
{
    static Time time; // used to get the current time
    static Timer timer; // a timer used to update the stockmarket and client's worth
    static StockMarket stockMarket; // The global stockmarket
    static LinkedList<Client> clientList; // List of clients

    public static void main(String[] args)
    {
        initialiseVariables();
    }

    private static void initialiseVariables()
    {
        clientList = new LinkedList<>();
        time = new Time(); // use time.GetDate() to get the time in int[] form;
        stockMarket = new StockMarket();
        timer = new Timer();
        timer.schedule(new TimerTask()
        {
            @Override
            public void run()
            {
                stockMarket.UpdateIndex();
                for (Client client:clientList)
                {
                    client.updateWorth();
                }
            }
        }, 0, 900000);
    }
}
