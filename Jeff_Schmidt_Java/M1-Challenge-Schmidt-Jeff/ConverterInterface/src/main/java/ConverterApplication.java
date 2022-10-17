
public class ConverterApplication {
    public static void main(String[] args) {
        ConverterIf ifStatementResults = new ConverterIf();

        ifStatementResults.convertMonth(1);
        ifStatementResults.convertMonth(2);
        ifStatementResults.convertMonth(13);

        ifStatementResults.convertDay(1);
        ifStatementResults.convertDay(4);
        ifStatementResults.convertDay(8);

        System.out.println("================================");

        ConverterSwitch switchStatementResults = new ConverterSwitch();

        switchStatementResults.convertMonth(5);
        switchStatementResults.convertMonth(6);
        switchStatementResults.convertMonth(13);

        switchStatementResults.convertDay(2);
        switchStatementResults.convertDay(5);
        switchStatementResults.convertDay(8);
    }

}