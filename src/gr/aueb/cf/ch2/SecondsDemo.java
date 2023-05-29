package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Converts seconds to Days,
 * Hours, Minutes, Secs
 */

public class SecondsDemo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int DAY_SECS = 24 * 60 * 60;
        final int HOUR_SECS = 3600;
        final int MINUTE_SECS = 60;
        int inputSeconds = 0;
        int remainingSeconds = 0;
        int days = 0;
        int hours = 0;
        int minutes = 0;
        int seconds = 0;

        System.out.println("Please insert the amount of seconds");
        inputSeconds = in.nextInt();

        remainingSeconds = inputSeconds;

        days = remainingSeconds / DAY_SECS;
        remainingSeconds = remainingSeconds % DAY_SECS;

        hours = remainingSeconds / HOUR_SECS;
        remainingSeconds = remainingSeconds % HOUR_SECS;

        minutes = remainingSeconds / MINUTE_SECS;
        remainingSeconds = remainingSeconds % MINUTE_SECS;

        seconds = remainingSeconds;

        System.out.printf("%,d input seconds = %d Days, %d Hours, %d Minutes, %d Seconds", inputSeconds, days, hours, minutes, seconds);


    }
}
