import java.util.*;
public class Run
{
    static Time time; // used to get the current time
    static Timer timer; // a timer used to update the stockmarket and client's worth
    static StockMarket stockMarket; // The global stockmarket
    static LinkedList<Client> clientList; // List of clients
    static LinkedList<ExternalEvent> externalEvents; // List of external events

    public static void main(String[] args)
    {
        initialiseVariables();
        initialiseExternalEvents();
        initialiseClientList();
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

    private static void initialiseClientList()
    {
        clientList = new LinkedList<>();
    }
    private static void initialiseExternalEvents()
    {
        externalEvents = new LinkedList<>();
        externalEvents.add(new ExternalEvent(new Date(2017,2,8,9,0),
                "Q1Q tech announce exciting developments in their smartphone range, anticipating a new model in June 2017",
                "Random traders buy Q1Q stock over 2 days"));
        externalEvents.add(new ExternalEvent(new Date(2017,3,6,13,0),
                "Dept of Agriculture announces lower than forecast yields in UK foor manufacturing output. ",
                "Random traders sell stock in food category over 3 days"));
        externalEvents.add(new ExternalEvent(new Date(2017,6,6,9,0),
                "Rumours that Q1Q have significant difficulties with their new smartphone product emerge",
                "Random traders may sell Q1Q stock over 3 days"));
        externalEvents.add(new ExternalEvent(new Date(2017,7,1,9,0),
                "Government announces new tradr deal with China",
                "Random traders buy any UK stock aggressively over 3 days"));
        externalEvents.add(new ExternalEvent(new Date(2017,8,4,13,0),
                "A new study is published estimating all UK property to be over valued",
                "Random traders may sell property stock over 4 days"));
        externalEvents.add(new ExternalEvent(new Date(2017,9,9,14,0),
                "UK Government announces a new export initiative for UK hard goods",
                "Random traders may buy hard goods stocks for 1 day"));
        externalEvents.add(new ExternalEvent(new Date(2017,10,4,9,0),
                "US investment firm announces acquisition programme of UK property stocks",
                "Random traders may buy property stocks over 4 days"));
    }
}
