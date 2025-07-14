import java.util.Scanner;

public class GradeEvaluation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Grade :");
        char grade = input.next().charAt(0);
        switch (grade){
            case 'A' :
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Very good");
                break;
            case 'C':
                System.out.println("Good");
                break;
            case 'D' :
                System.out.println("Pass");
                break;
            case 'F':
                System.out.println("Fail");
                break;
            default:
                System.out.println("invalid Grade ");

                input.close();


    }

    }


    }
