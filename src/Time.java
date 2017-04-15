import java.util.*;

public class Time
{
    int[] monthDays;
    String[] weekdays;
    private Date date;
    private boolean isOpen;
    private int year;
    private int month;
    private int day;
    private int hour;
    private int minute;
    private int second;
    private int dayCounter;
    private int weekdayCounter;
    private Timer timer;

    public Time()
    {
        initialiseMonthDays();
        year = 2017;
        month = 1;
        day = 1;
        hour = 0;
        minute = 0;
        second = 0;
        dayCounter = 1;
        weekdayCounter = 1;
        date = new Date();


        timer = new Timer();
        timer.schedule(new TimerTask()
        {
            @Override
            public void run()
            {
                runTime();
            }
        }, 0, 1000);
    }

    private void runTime()
    {
        if(second == 59)
        {
            second = 0;
            if(minute == 59)
            {
                minute = 0;
                if(hour == 59)
                {
                    hour = 0;
                    if(day == monthDays[dayCounter])
                    {
                        dayCounter++;
                        day = 0;
                        if(month == 12)
                        {
                            // finish timer, call exit method
                        }
                        month++;
                    }
                    day++;
                    if(weekdayCounter == 7)
                        weekdayCounter = 1;
                    else
                        weekdayCounter++;
                }
                hour++;
            }
            minute++;
        }
        second++;
        updateDateArray();
        isOpen = CheckDate();
    }

    public Date getDate()
    {
        return date;
    }

    private void updateDateArray()
    {
        date.setSecond(second);
        date.setMinute(minute);
        date.setHour(hour);
        date.setDay(day);
        date.setMonth(month);
        date.setYear(year);
    }

    private void initialiseMonthDays()
    {
        monthDays = new int[12];
        monthDays[0] = 31;
        monthDays[1] = 28;
        monthDays[2] = 31;
        monthDays[3] = 30;
        monthDays[4] = 31;
        monthDays[5] = 30;
        monthDays[6] = 31;
        monthDays[7] = 31;
        monthDays[8] = 30;
        monthDays[9] = 31;
        monthDays[10] = 30;
        monthDays[11] = 31;
    }

    private boolean CheckDate()
    {
        if(date.getMonth()==4 && date.getDay()==14)
            return false;
        if(date.getMonth()==4 && date.getDay()==17)
            return false;
        if(date.getMonth()==12 && date.getDay()==25)
            return false;
        if(date.getMonth()==12 && date.getDay()==26)
            return false;
        if(weekdayCounter == 6 || weekdayCounter == 7)
            return false;
        if(date.getHour()<9 || date.getHour()>3)
            return false;
        return true;
    }

    public boolean IsOpen()
    {
        return isOpen;
    }
}
