import java.util.Scanner;

public class ActivityInput {

    int studyHours;
    int codingHours;
    int sleepHours;
    int distractionHours;

    public void takeInput() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter study hours: ");
        studyHours = sc.nextInt();

        System.out.print("Enter coding hours: ");
        codingHours = sc.nextInt();

        System.out.print("Enter sleep hours: ");
        sleepHours = sc.nextInt();

        System.out.print("Enter distraction hours: ");
        distractionHours = sc.nextInt();
    }
}
