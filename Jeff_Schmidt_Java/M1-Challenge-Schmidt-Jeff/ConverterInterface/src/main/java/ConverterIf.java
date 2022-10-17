public class ConverterIf implements Converter {

    @Override
    public int convertMonth(int monthNumber) {
//        String[] myArray = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

//        if(monthNumber <= 12) {
//            return myArray.length;
//        } else if (monthNumber >= 13) {
//            System.out.println("Number provided needs to be 1 - 12");
//        }
//        return 0;
        if (monthNumber == 1) {
            System.out.println("Jan");
        }
        if (monthNumber == 2) {
            System.out.println("Feb");
        }
        if (monthNumber == 3) {
            System.out.println("Mar");
        }
        if (monthNumber == 4) {
            System.out.println("Apr");
        }
        if (monthNumber == 5) {
            System.out.println("May");
        }
        if (monthNumber == 6) {
            System.out.println("Jun");
        }
        if (monthNumber == 7) {
            System.out.println("Jul");
        }
        if (monthNumber == 8) {
            System.out.println("Aug");
        }
        if (monthNumber == 9) {
            System.out.println("Sep");
        }
        if (monthNumber == 10) {
            System.out.println("Oct");
        }
        if (monthNumber == 11) {
            System.out.println("Nov");
        }
        if (monthNumber == 12) {
            System.out.println("Dec");
        }
        if (monthNumber >= 13)
            System.out.println("Number provided needs to be 1 - 12.");
        return monthNumber;
    }

    @Override
    public int convertDay(int dayNumber) {
        if (dayNumber == 1) {
            System.out.println("Monday");
            ;
        } else if (dayNumber == 2) {
            System.out.println("Tuesday");
            ;
        } else if (dayNumber == 3) {
            System.out.println("Wednesday");
            ;
        } else if (dayNumber == 4) {
            System.out.println("Thursday");
            ;
        } else if (dayNumber == 5) {
            System.out.println("Friday");
            ;
        } else if (dayNumber == 6) {
            System.out.println("Saturday");
            ;
        } else if (dayNumber == 7) {
            System.out.println("Sunday");
        } else if (dayNumber >= 7) {
            System.out.println("Number provided needs to be 1 - 7.");
        }
        return dayNumber;
    }
}
