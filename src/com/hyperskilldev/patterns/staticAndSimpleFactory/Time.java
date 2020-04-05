package com.hyperskilldev.patterns.staticAndSimpleFactory;

import java.util.Scanner;

class Time {

    int hour;
    int minute;
    int second;

    public static Time noon() {
        return Time.of(12, 0, 0);
    }

    public static Time midnight() {
        return Time.of(0, 0, 0);
    }

    public static Time ofSeconds(long seconds) {
        if (seconds < 0) {
            return null;
        }
        int temp = (int) seconds / 3600;
        int hour = temp > 23 ? (temp % 24) : temp;
        seconds = seconds - temp * 3600;
        temp = (int) seconds / 60;
        int minute = temp;
        int second = (int) seconds - minute * 60;
        return Time.of(hour, minute, second);
    }

    public static Time of(int hour, int minute, int second) {
        if (hour > 23 || minute > 59 || second > 59) {
            return null;
        }
        if (hour < 0 || minute < 0 || second < 0) {
            return null;
        }

        Time time = new Time();
        time.hour = hour;
        time.minute = minute;
        time.second = second;
        return time;
    }
}

/* Do not change code below */
class Main3 {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        final String type = scanner.next();
        Time time = null;

        switch (type) {
            case "noon":
                time = Time.noon();
                break;
            case "midnight":
                time = Time.midnight();
                break;
            case "hms":
                int h = scanner.nextInt();
                int m = scanner.nextInt();
                int s = scanner.nextInt();
                time = Time.of(h, m, s);
                break;
            case "seconds":
                time = Time.ofSeconds(scanner.nextInt());
                break;
            default:
                time = null;
                break;
        }

        if (time == null) {
            System.out.println(time);
        } else {
            System.out.println(String.format("%s %s %s", time.hour, time.minute, time.second));
        }
    }
}