import java.util.Scanner;
import java.lang.Math;


public class MyCalendar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int yearMin = 1780;
        int yearMax = 2040;
        // Prompt user to enter year
        System.out.print("Enter a year between 1780 and 2040: ");
        int year = input.nextInt();
        while ((year > yearMax) || (year < yearMin)) {
            System.out.print("Invalid year, please re-enter\n");
            System.out.print("Enter a year between 1780 and 2040: ");
            year = input.nextInt();
        }

        int dayOfTheWeek;
        dayOfTheWeek = (int) (28 + (year % 100) + (int) Math.floor(((year % 100) - 1) / 4.0) + Math.floor(year / 400) - (2 * Math.floor(year / 100))) % 7;
        if (dayOfTheWeek < 0) {
            dayOfTheWeek += 7;
        }

        int currentMonth;
        for (currentMonth = 1; currentMonth <= 12; currentMonth++) {
            String calendarMonth = "";

            int daysInMonth = 0;
            switch (currentMonth) {
                case 1:
                    calendarMonth = "January";
                    daysInMonth = 31;
                    System.out.printf("%15s %d  \n", calendarMonth, year);
                    System.out.println("----------------------------");
                    System.out.printf("%s %s %s %s %s %s %s\n ", "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat");
                    break;
                case 2:
                    calendarMonth = "February";
                    if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                        daysInMonth = 29;
                    } else {
                        daysInMonth = 28;
                    }
                    System.out.printf("%15s %d  \n", calendarMonth, year);
                    System.out.println("----------------------------");
                    System.out.printf("%s %s %s %s %s %s %s \n", "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat");
                    break;
                case 3:
                    calendarMonth = "March";
                    daysInMonth = 31;
                    System.out.printf("%15s %d  \n", calendarMonth, year);
                    System.out.println("----------------------------");
                    System.out.printf("%s %s %s %s %s %s %s\n ", "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat");
                    break;
                case 4:
                    calendarMonth = "April";
                    daysInMonth = 30;
                    System.out.printf("%15s %d  \n", calendarMonth, year);
                    System.out.println("----------------------------");
                    System.out.printf("%s %s %s %s %s %s %s\n ", "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat");
                    break;
                case 5:
                    calendarMonth = "May";
                    daysInMonth = 31;
                    System.out.printf("%15s %d  \n", calendarMonth, year);
                    System.out.println("----------------------------");
                    System.out.printf("%s %s %s %s %s %s %s\n ", "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat");
                    break;
                case 6:
                    calendarMonth = "June";
                    daysInMonth = 30;
                    System.out.printf("%15s %d  \n", calendarMonth, year);
                    System.out.println("----------------------------");
                    System.out.printf("%s %s %s %s %s %s %s\n ", "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat");
                    break;
                case 7:
                    calendarMonth = "July";
                    daysInMonth = 31;
                    System.out.printf("%15s %d  \n", calendarMonth, year);
                    System.out.println("----------------------------");
                    System.out.printf("%s %s %s %s %s %s %s\n ", "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat");
                    break;
                case 8:
                    calendarMonth = "August";
                    daysInMonth = 30;
                    System.out.printf("%15s %d  \n", calendarMonth, year);
                    System.out.println("----------------------------");
                    System.out.printf("%s %s %s %s %s %s %s\n ", "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat");
                    break;
                case 9:
                    calendarMonth = "September";
                    daysInMonth = 30;
                    System.out.printf("%15s %d  \n", calendarMonth, year);
                    System.out.println("----------------------------");
                    System.out.printf("%s %s %s %s %s %s %s\n ", "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat");
                    break;
                case 10:
                    calendarMonth = "October";
                    daysInMonth = 31;
                    System.out.printf("%15s %d  \n", calendarMonth, year);
                    System.out.println("----------------------------");
                    System.out.printf("%s %s %s %s %s %s %s\n ", "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat");
                    break;
                case 11:
                    calendarMonth = "November";
                    daysInMonth = 30;
                    System.out.printf("%15s %d  \n", calendarMonth, year);
                    System.out.println("----------------------------");
                    System.out.printf("%s %s %s %s %s %s %s\n ", "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat");
                    break;
                case 12:
                    calendarMonth = "December";
                    daysInMonth = 31;
                    System.out.printf("%15s %d  \n", calendarMonth, year);
                    System.out.println("----------------------------");
                    System.out.printf("%s %s %s %s %s %s %s\n ", "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat");
                    break;
            }
            for (int space =1; space<=dayOfTheWeek; space++)
            {
                System.out.printf("%4s", "    ");
            }
            for (int i = 1; i <=daysInMonth; i++)
            {
                dayOfTheWeek++;
                if (dayOfTheWeek% 7==0)
                    System.out.printf("%- 4d\n", i);
                else
                    System.out.printf("%-4d", i);

            }
            dayOfTheWeek = (dayOfTheWeek + daysInMonth)%7;

            System.out.println();
        }
    }
}

