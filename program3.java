import java.util.Scanner;

public class program3 {
    public static void main(String agr[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the day");
        String day = scanner.next();
        if (day.equals("monday") ||
                day.equals("Tuesday") ||
                day.equals("wednesday") ||
                day.equals("Thursday") ||
                day.equals("Firday"))
            System.out.println(" uff , it is week day");
        else if
            (day.equals("saturday") ||
                    day.equals("sunday"))
            System.out.println("yaa, it is weekend");
           scanner.close();
        }
    }

