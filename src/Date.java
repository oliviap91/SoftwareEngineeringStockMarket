public class Date
{
    private int year;
    private int month;
    private int day;
    private int hour;
    private int minute;
    private int second;

    public Date()
    {
        year = 2017;
        month = 0;
        day = 0;
        hour = 0;
        minute = 0;
        second = 0;
    }
    /*
    public Date(int year, int month, int day, int hour, int minute, int second)
    {
        this.year = year;
        this.month = month;
        this.day = day;
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    */
    public void setYear(int year)
    {
        this.year = year;
    }
    public int getYear()
    {
        return year;
    }

    public void setMonth(int month)
    {
        this.month = month;
    }
    public int getMonth()
    {
        return month;
    }

    public void setDay(int day)
    {
        this.day = day;
    }
    public int getDay()
    {
        return day;
    }

    public void setHour(int hour)
    {
        this.hour = hour;
    }
    public int getHour()
    {
        return hour;
    }

    public void setMinute(int minute)
    {
        this.minute = minute;
    }
    public int getMinute()
    {
        return minute;
    }

    public void setSecond(int second)
    {
        this.second = second;
    }
    public int getSecond()
    {
        return second;
    }
}
