public class LeapYearChecker {
    public static boolean itsLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println("2020 год високосный? " + itsLeapYear(2020));
        System.out.println("2021 год високосный? " + itsLeapYear(2021));
        System.out.println("400 год високосный? " + itsLeapYear(400));
        System.out.println("300 год високосный? " + itsLeapYear(300));
    }
}