import java.util.Scanner;

public class program1 {
    public static void main(String agr[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the number :");
        int number= scanner.nextInt();
        if(number%2==0){
            System.out.println("this number is even");
        }else {
            System.out.println("this number is odd");
        }
        scanner.close();
    }
}
