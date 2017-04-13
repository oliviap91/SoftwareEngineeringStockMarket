import java.util.*;

public class Time
{
    int[] date;
    int[] monthDays;
    private int year;
    private int month;
    private int day;
    private int hour;
    private int minute;
    private int second;
    private int counter;
    Timer timer;

    public Time()
    {
        initialiseMonthDays();
        year = 2017;
        month = 1;
        day = 1;
        hour = 0;
        minute = 0;
        second = 0;
        counter = 1;
        date = new int[6];


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
                    if(day == monthDays[counter])
                    {
                        counter++;
                        day = 0;
                        if(month == 12)
                        {
                            // finish timer, call exit method
                        }
                        month++;
                    }
                    day++;
                }
                hour++;
            }
            minute++;
        }
        second++;

        updateDateArray();
    }

    public int[] getDate()
    {
        return date;
    }

    private void updateDateArray()
    {
        date[0] = second;
        date[1] = minute;
        date[2] = hour;
        date[3] = day;
        date[4] = month;
        date[5] = year;
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
}
