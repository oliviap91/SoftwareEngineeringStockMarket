abstract class Trader
{
    Client client;

    public Trader(Client client)
    {
        this.client = client;
    }

    public abstract void buyShare();

    public abstract void sellShare();
}
