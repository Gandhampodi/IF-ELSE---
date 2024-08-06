import java.util.Scanner;

public class Program2 {
    public static void main(String agr[]){
        Scanner scanner= new Scanner(System.in);
        System.out.println("seventh class maths subject");
        System.out.println("Please enter the students marks :");
        int marks=scanner.nextInt();
        if(marks>90 && marks<=100){
            System.out.println("this person got the grade A");
        } else if (marks>80 && marks <=90) {
            System.out.println("this person got the grade B");
        }else if(marks>70 && marks <=80){
            System.out.println("this person got the grade c");
        }
        else if (marks>60 && marks<=70){
            System.out.println("this person got the grade D");
        }

        else{
            System.out.println("this person fail this subject");
        }

    }
}
