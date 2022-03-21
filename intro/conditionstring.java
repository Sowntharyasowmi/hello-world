import java.util.*;
public class conditionstring {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("day");
        String today = input.nextLine();
        switch (today) {
            case "monday": {
                System.out.println("hi sweety good morning");
                break;
            }
            case "tuesday": {
                System.out.println("hi sweety good aftnoon");
                break;
            }
            case "wednesday": {
                System.out.println("hi sweety good evening");
                break;
            }
            case "thursday": {
                System.out.println("hi sweety good night");
                break;
            }

        }
    }
}
