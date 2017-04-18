import java.util.*;
public class Run
{
    static Time time; // used to get the current time
    static Timer programTimer; // a programTimer used to update the stockmarket and client's worth
    static Timer eventTimer; // a timer used to time the length of events
    static StockMarket stockMarket; // The global stockmarket
    static LinkedList<Client> clientList; // List of clients
    static LinkedList<ExternalEvent> externalEvents; // List of external events
    public static LinkedList<TradedCompanies> tradedCompanies; // list of the trading companies with stock price and
    static TraderMode balanced;
    static TraderMode aggressiveSeller;
    static TraderMode aggressivePurchaser;
    public static int timeScale = 100;

    public static void main(String[] args)
    {
        balanced = new TraderMode(1,1, "balanced");
        aggressiveSeller = new TraderMode(2,0.5,"aggressiveSeller");
        aggressivePurchaser = new TraderMode(0.5,2, "aggressivePurchaser");
        clientList = new LinkedList<>();
        time = new Time(timeScale); // use time.GetDate() to get the time in int[] form;
        stockMarket = new StockMarket();
        initialiseTimers();
        initialiseExternalEvents();
        initialiseTradedCompanies();
        initialiseClientList();
    }

    private static void checkExternalEvents()
    {
        for (ExternalEvent e : externalEvents)
        {
            for (TradedCompanies c : tradedCompanies)
            {
                if(time.getDate() == e.getDateOfEvent())
                {
                    if(e.getStockTypeAffected().equals(c.getName()) || e.getStockTypeAffected().equals(c.getStockType()))
                    {
                        for (Client client : clientList)
                        {
                            // change buying and selling preferences for event e

                            int length = e.getDuration();
                            eventTimer.schedule(new TimerTask()
                            {
                                @Override
                                public void run()
                                {
                                    stockMarket.UpdateIndex();
                                    for (Client client:clientList)
                                    {
                                        if(client.trader.getTraderType().equals("random"))
                                        {
                                            // reset the buying and selling preferences of the random traders
                                        }
                                    }
                                }
                            },(1000*60*60*24)*length/timeScale);
                        }
                    }
                }
            }
        }
    }

    private static void changeTraderMode(Client client)
    {
        double temp = Math.random();
        if(client.trader.getTraderMode() == balanced)
        {
            if(temp>=0 && temp <0.1)
                client.trader.setTraderMode(aggressiveSeller);
            else if(temp>=0.1 && temp <0.9)
                client.trader.setTraderMode(balanced);
            else if(temp>=0.9 && temp <1)
                client.trader.setTraderMode(aggressiveSeller);
        }
        else if(client.trader.getTraderMode() == aggressiveSeller)
        {
            if(temp>=0 && temp <0.6)
                client.trader.setTraderMode(aggressiveSeller);
            else if(temp>=0.6 && temp <1)
                client.trader.setTraderMode(balanced);
        }
        else if(client.trader.getTraderMode() == aggressivePurchaser)
        {
            if(temp>=0 && temp <0.7)
                client.trader.setTraderMode(balanced);
            else if(temp>=0.7 && temp <1)
                client.trader.setTraderMode(aggressiveSeller);
        }
    }

    private static void initialiseTimers()
    {
        programTimer = new Timer();
        programTimer.schedule(new TimerTask()
        {
            @Override
            public void run()
            {
                stockMarket.UpdateIndex();
                for (Client client:clientList)
                {
                    client.updateWorth();
                    changeTraderMode(client);
                    checkExternalEvents();
                }
            }
        }, 0, 900000/timeScale);

        //////////////////////////////////////////////////

        eventTimer = new Timer();

    }

    private static void initialiseClientList()
    {
        clientList = new LinkedList<>();
        clientList.add(new Client("Norbert DaVinci", new RandomTrader(balanced, tradedCompanies)));
        clientList.add(new Client("Ellen Fotheringay-Smythe", new RandomTrader(balanced,tradedCompanies)));
        clientList.add(new Client("Donald Shrek", new RandomTrader(balanced,tradedCompanies)));
        clientList.add(new Client("Sir Melvin Codd", new RandomTrader(balanced,tradedCompanies)));
        clientList.add(new Client("A&G investments", new RandomTrader(balanced,tradedCompanies)));
        clientList.add(new Client("Trinity Investments", new RandomTrader(balanced,tradedCompanies)));
        clientList.add(new Client("Ivor Lott", new RandomTrader(balanced,tradedCompanies)));
        clientList.add(new Client("Justine Thyme", new RandomTrader(balanced,tradedCompanies)));
        clientList.add(new Client("Saeed Pune", new RandomTrader(balanced,tradedCompanies)));
        clientList.add(new Client("Xi Xian", new RandomTrader(balanced,tradedCompanies)));
    }

    private static void initialiseTradedCompanies()
    {
        tradedCompanies = new LinkedList<>();
        tradedCompanies.add(new TradedCompanies("Pear Computing", new StockType("technology"), 6.50, 50000));
        tradedCompanies.add(new TradedCompanies("Wong Holdings", new StockType("property"), 1.26, 10000));
        tradedCompanies.add(new TradedCompanies("Williams Leisure", new StockType("hard"), 0.82, 20000));
        tradedCompanies.add(new TradedCompanies("The Lovely Pie Co", new StockType("food"), 0.24, 6000));
        tradedCompanies.add(new TradedCompanies("Q1Q Tech", new StockType("technology"), 1.30, 48900));
        tradedCompanies.add(new TradedCompanies("Texas Crisps", new StockType("food"), 1.80, 32900));
        tradedCompanies.add(new TradedCompanies("Swann Holdings", new StockType("property"), 0.45, 23600));
        tradedCompanies.add(new TradedCompanies("Patels Sauces", new StockType("food"), 1.00, 55000));
        tradedCompanies.add(new TradedCompanies("Gardens 'R' Us", new StockType("hard"), 0.19, 19288));
        tradedCompanies.add(new TradedCompanies("Sussex Flats", new StockType("property"), 5.70,23000));
        tradedCompanies.add(new TradedCompanies("Dawn Technology", new StockType("technology"), 0.12, 18000));
        tradedCompanies.add(new TradedCompanies("Excelsior Foods", new StockType("food"), 5.40, 50000));
        tradedCompanies.add(new TradedCompanies("Supreme Sk8", new StockType("hard"), 3.45, 25000));
        tradedCompanies.add(new TradedCompanies("Luxury Caravans", new StockType("property"), 2.68, 42000));
        tradedCompanies.add(new TradedCompanies("WyreCraft", new StockType("technology"), 6.37, 42000));
        tradedCompanies.add(new TradedCompanies("Upduff and Co", new StockType("food"), 3.40, 36700));
        tradedCompanies.add(new TradedCompanies("Downe and Co", new StockType("hard"), 0.99, 40000));
        tradedCompanies.add(new TradedCompanies("Skinners", new StockType("property"), 3.68, 57000));
        tradedCompanies.add(new TradedCompanies("WazooIt", new StockType("technology"), 48, 9800));
        tradedCompanies.add(new TradedCompanies("Whizzer and Chipps", new StockType("food"), 2.10, 31000));
    }

    private static void initialiseExternalEvents()
    {
        externalEvents = new LinkedList<>();
        externalEvents.add(new ExternalEvent(new Date(2017,2,8,9,0),
                "Q1Q tech announce exciting developments in their smartphone range, anticipating a new model in June 2017",
                "Random traders buy Q1Q stock over 2 days", "Q1Q Tech", 2));
        externalEvents.add(new ExternalEvent(new Date(2017,3,6,13,0),
                "Dept of Agriculture announces lower than forecast yields in UK foor manufacturing output. ",
                "Random traders sell stock in food category over 3 days", "food", 3));
        externalEvents.add(new ExternalEvent(new Date(2017,6,6,9,0),
                "Rumours that Q1Q have significant difficulties with their new smartphone product emerge",
                "Random traders may sell Q1Q stock over 3 days", "Q1Q Tech", 3));
        externalEvents.add(new ExternalEvent(new Date(2017,7,1,9,0),
                "Government announces new tradr deal with China",
                "Random traders buy any UK stock aggressively over 3 days", "UK", 3));
        externalEvents.add(new ExternalEvent(new Date(2017,8,4,13,0),
                "A new study is published estimating all UK property to be over valued",
                "Random traders may sell property stock over 4 days", "property", 4));
        externalEvents.add(new ExternalEvent(new Date(2017,9,9,14,0),
                "UK Government announces a new export initiative for UK hard goods",
                "Random traders may buy hard goods stocks for 1 day", "hard", 1));
        externalEvents.add(new ExternalEvent(new Date(2017,10,4,9,0),
                "US investment firm announces acquisition programme of UK property stocks",
                "Random traders may buy property stocks over 4 days", "property", 4));
    }
}
