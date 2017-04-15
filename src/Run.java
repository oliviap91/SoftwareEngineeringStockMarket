import java.util.*;
public class Run
{
    static Time time; // used to get the current time
    static Timer timer; // a timer used to update the stockmarket and client's worth
    static StockMarket stockMarket; // The global stockmarket
    static LinkedList<Client> clientList; // List of clients
    static LinkedList<ExternalEvent> externalEvents; // List of external events
    static LinkedList<TradedCompanies> tradedCompanies;

    public static void main(String[] args)
    {
        initialiseVariables();
        initialiseExternalEvents();
        initialiseTradedCompanies();
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
        clientList.add(new Client("Norbert DaVinci"));
        clientList.add(new Client("Ellen Fotheringay-Smythe"));
        clientList.add(new Client("Donald Shrek"));
        clientList.add(new Client("Sir Melvin Codd"));
        clientList.add(new Client("A&G investments"));
        clientList.add(new Client("Trinity Investments"));
        clientList.add(new Client("Ivor Lott"));
        clientList.add(new Client("Justine Thyme"));
        clientList.add(new Client("Saeed Pune"));
        clientList.add(new Client("Xi Xian"));
    }
    private static void initialiseTradedCompanies()
    {
        tradedCompanies = new LinkedList<>();
        tradedCompanies.add(new TradedCompanies("Pear Computing", new TechnologyStock(), 6.50, 50000));
        tradedCompanies.add(new TradedCompanies("Wong Holdings", new PropertyStock(), 1.26, 10000));
        tradedCompanies.add(new TradedCompanies("Williams Leisure", new HardStock(), 0.82, 20000));
        tradedCompanies.add(new TradedCompanies("The Lovely Pie Co", new FoodStock(), 0.24, 6000));
        tradedCompanies.add(new TradedCompanies("Q1Q Tech", new TechnologyStock(), 1.30, 48900));
        tradedCompanies.add(new TradedCompanies("Texas Crisps", new FoodStock(), 1.80, 32900));
        tradedCompanies.add(new TradedCompanies("Swann Holdings", new PropertyStock(), 0.45, 23600));
        tradedCompanies.add(new TradedCompanies("Patels Sauces", new FoodStock(), 1.00, 55000));
        tradedCompanies.add(new TradedCompanies("Gardens 'R' Us", new HardStock(), 0.19, 19288));
        tradedCompanies.add(new TradedCompanies("Sussex Flats", new PropertyStock(), 5.70,23000));
        tradedCompanies.add(new TradedCompanies("Dawn Technology", new TechnologyStock(), 0.12, 18000));
        tradedCompanies.add(new TradedCompanies("Excelsior Foods", new FoodStock(), 5.40, 50000));
        tradedCompanies.add(new TradedCompanies("Supreme Sk8", new HardStock(), 3.45, 25000));
        tradedCompanies.add(new TradedCompanies("Luxury Caravans", new PropertyStock(), 2.68, 42000));
        tradedCompanies.add(new TradedCompanies("WyreCraft", new TechnologyStock(), 6.37, 42000));
        tradedCompanies.add(new TradedCompanies("Upduff and Co", new FoodStock(), 3.40, 36700));
        tradedCompanies.add(new TradedCompanies("Downe and Co", new HardStock(), 0.99, 40000));
        tradedCompanies.add(new TradedCompanies("Skinners", new PropertyStock(), 3.68, 57000));
        tradedCompanies.add(new TradedCompanies("WazooIt", new TechnologyStock(), 48, 9800));
        tradedCompanies.add(new TradedCompanies("Whizzer and Chipps", new FoodStock(), 2.10, 31000));
    }
    private static void initialiseExternalEvents()
    {
        externalEvents = new LinkedList<>();
        externalEvents.add(new ExternalEvent(new Date(2017,2,8,9,0),
                "Q1Q tech announce exciting developments in their smartphone range, anticipating a new model in June 2017",
                "Random traders buy Q1Q stock over 2 days", "Q1Q", 2));
        externalEvents.add(new ExternalEvent(new Date(2017,3,6,13,0),
                "Dept of Agriculture announces lower than forecast yields in UK foor manufacturing output. ",
                "Random traders sell stock in food category over 3 days", "food", 3));
        externalEvents.add(new ExternalEvent(new Date(2017,6,6,9,0),
                "Rumours that Q1Q have significant difficulties with their new smartphone product emerge",
                "Random traders may sell Q1Q stock over 3 days", "Q1Q", 3));
        externalEvents.add(new ExternalEvent(new Date(2017,7,1,9,0),
                "Government announces new tradr deal with China",
                "Random traders buy any UK stock aggressively over 3 days", "UK", 3));
        externalEvents.add(new ExternalEvent(new Date(2017,8,4,13,0),
                "A new study is published estimating all UK property to be over valued",
                "Random traders may sell property stock over 4 days", "property", 4));
        externalEvents.add(new ExternalEvent(new Date(2017,9,9,14,0),
                "UK Government announces a new export initiative for UK hard goods",
                "Random traders may buy hard goods stocks for 1 day", "hard goods", 1));
        externalEvents.add(new ExternalEvent(new Date(2017,10,4,9,0),
                "US investment firm announces acquisition programme of UK property stocks",
                "Random traders may buy property stocks over 4 days", "property", 4));
    }
}
