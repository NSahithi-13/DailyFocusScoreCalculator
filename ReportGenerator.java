public class ReportGenerator {

    public void showReport(int score) {
        System.out.println("\nYour Focus Score: " + score);

        if (score >= 75) {
            System.out.println("Day Quality: Excellent");
        } else if (score >= 50) {
            System.out.println("Day Quality: Good");
        } else {
            System.out.println("Day Quality: Poor");
        }
    }
}
