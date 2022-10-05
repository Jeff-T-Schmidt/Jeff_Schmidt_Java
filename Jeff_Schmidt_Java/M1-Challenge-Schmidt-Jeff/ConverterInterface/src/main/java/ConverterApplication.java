
public class ConverterApplication implements Converter{
    public static void main(String[] args) {
            ConverterApplication imLost = new ConverterApplication();
            imLost.convertDay(3);
            imLost.convertMonth(2);
    }


    public int convertMonth(int monthNumber) {

        //I know it's super wet - I couldn't get the array of months to work and I'm tired of tyring.

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
        return monthNumber;
    }
// I do not understand the need for a return statement - I watched YouTube videos and read JavaDocs
// and I just don't get what value is needed in the return.
// I have the variables monthNumber and dayNumber in both returns, but what are they doing?
    public int convertDay(int dayNumber) {

            switch (dayNumber) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
            }
            return dayNumber;
        }
    }

