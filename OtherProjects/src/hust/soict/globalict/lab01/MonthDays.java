package hust.soict.globalict.lab01;

import java.util.Scanner;

public class MonthDays {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the month: ");
        String month = scanner.nextLine();
        System.out.print("Enter the year: ");
        int year = scanner.nextInt();
        switch (month) {
            case "January":
			System.out.println("There are 31 days in the month");
			break;
		case "Jan.":
			System.out.println("There are 31 days in the month");
			break;
		case "Jan":
			System.out.println("There are 31 days in the month");
			break;
		case "1":
			System.out.println("There are 31 days in the month");
			break;
		case "March":
			System.out.println("There are 31 days in the month");
			break;
		case "Mar.":
			System.out.println("There are 31 days in the month");
			break;
		case "Mar":
			System.out.println("There are 31 days in the month");
			break;
		case "3":
			System.out.println("There are 31 days in the month");
			break;
		case "May":
			System.out.println("There are 31 days in the month");
			break;
		case "5":
			System.out.println("There are 31 days in the month");
			break;
		case "July":
			System.out.println("There are 31 days in the month");
			break;
		case "Jul.":
			System.out.println("There are 31 days in the month");
			break;
		case "Jul":
			System.out.println("There are 31 days in the month");
			break;
		case "7":
			System.out.println("There are 31 days in the month");
			break;
		case "August":
			System.out.println("There are 31 days in the month");
			break;
		case "Aug.":
			System.out.println("There are 31 days in the month");
			break;
		case "Aug":
			System.out.println("There are 31 days in the month");
			break;
		case "8":
			System.out.println("There are 31 days in the month");
			break;
		case "October":
			System.out.println("There are 31 days in the month");
			break;
		case "Oct.":
			System.out.println("There are 31 days in the month");
			break;
		case "Oct":
			System.out.println("There are 31 days in the month");
			break;
		case "10":
			System.out.println("There are 31 days in the month");
			break;
		case "December":
			System.out.println("There are 31 days in the month");
			break;
		case "Dec.":
			System.out.println("There are 31 days in the month");
			break;
		case "Dec":
			System.out.println("There are 31 days in the month");
			break;
		case "12":
			System.out.println("There are 31 days in the month");
			break;
		case "April":
			System.out.println("There are 30 days in the month");
			break;
		case "Apr.":
			System.out.println("There are 30 days in the month");
			break;
		case "Apr":
			System.out.println("There are 30 days in the month");
			break;
		case "4":
			System.out.println("There are 30 days in the month");
			break;
		case "June":
			System.out.println("There are 30 days in the month");
			break;
		case "Jun.":
			System.out.println("There are 30 days in the month");
			break;
		case "Jun":
			System.out.println("There are 30 days in the month");
			break;
		case "6":
			System.out.println("There are 30 days in the month");
			break;
		case "September":
			System.out.println("There are 30 days in the month");
			break;
		case "Sep.":
			System.out.println("There are 30 days in the month");
			break;
		case "Sep":
			System.out.println("There are 30 days in the month");
			break;
		case "9":
			System.out.println("There are 30 days in the month");
			break;
		case "November":
			System.out.println("There are 30 days in the month");
			break;
		case "Nov.":
			System.out.println("There are 30 days in the month");
			break;
		case "Nov":
			System.out.println("There are 30 days in the month");
			break;
		case "11":
			System.out.println("There are 30 days in the month");
			break;
		case "2":
			if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {  
			       System.out.println("There are 29 days in the month.");
			       break;
			}
			else {
			        System.out.println("There are 28 days in the month.");
			        break;
			}
		case "February":
			if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {  
			       System.out.println("There are 29 days in the month.");
			       break;
			}
			else {
			        System.out.println("There are 28 days in the month.");
			        break;
			}
		case "Feb.":
			if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {  
			       System.out.println("There are 29 days in the month.");
			       break;
			}
			else {
			        System.out.println("There are 28 days in the month.");
			        break;
			}
		case "Feb":
			if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {  
			       System.out.println("There are 29 days in the month.");
			       break;
			}
			else {
			        System.out.println("There are 28 days in the month.");
			        break;
			}
		default:
                System.out.println("Invalid Month");
                break;
        }
        scanner.close();
        System.exit(0);
    }

}