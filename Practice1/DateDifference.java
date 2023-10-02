package Practice1;

//input 1: 25-06-1998
//         04-04-2010

//input 1: 01-01-2000
//         31-12-2022

import java.util.Scanner;

public class DateDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the two dates as strings
        System.out.print("Date 1 (dd-mm-yyyy): ");
        String date1Str = scanner.next();
        System.out.print("Date 2 (dd-mm-yyyy): ");
        String date2Str = scanner.next();

        scanner.close();

        // Parse the date strings
        String[] date1Parts = date1Str.split("-");
        String[] date2Parts = date2Str.split("-");

        int day1 = Integer.parseInt(date1Parts[0]);
        int month1 = Integer.parseInt(date1Parts[1]);
        int year1 = Integer.parseInt(date1Parts[2]);

        int day2 = Integer.parseInt(date2Parts[0]);
        int month2 = Integer.parseInt(date2Parts[1]);
        int year2 = Integer.parseInt(date2Parts[2]);

        // Calculate the difference
        int yearDiff = year2 - year1;
        int monthDiff = month2 - month1;
        int dayDiff = day2 - day1;

        // Adjust for negative differences
        if (dayDiff < 0) {
            monthDiff--;
            int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            dayDiff += daysInMonth[month1];
            if (month1 == 2 && ((year1 % 4 == 0 && year1 % 100 != 0) || (year1 % 400 == 0))) {
                dayDiff++; // Leap year adjustment
            }
        }
        if (monthDiff < 0) {
            yearDiff--;
            monthDiff += 12;
        }

        // Output the difference
        System.out.println(dayDiff + " days, " + monthDiff + " months, " + yearDiff + " years");
    }
}