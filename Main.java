public class Main {
    public static void main(String[] args) {

        ActivityInput input = new ActivityInput();
        input.takeInput();

        FocusCalculator calculator = new FocusCalculator();
        int score = calculator.calculateScore(input);

        ReportGenerator report = new ReportGenerator();
        report.showReport(score);
    }
}
