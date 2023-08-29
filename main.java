import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Media media = new Media();

        System.out.println("Type your name: ");
        media.setName(sc.nextLine());
        System.out.println("Send me your first grade: ");
        media.setX(sc.nextInt());
        System.out.println("Send me your second grade: ");
        media.setY(sc.nextInt());

        double average = media.calculateAverage();
        System.out.println("Average: " + average);

        if (average >= 7) {
            System.out.println("Congratulations, " + media.getName() + "! You are approved.");
        } else {
            System.out.println("Sorry, " + media.getName() + ". You are not approved.");
        }
    }
}
