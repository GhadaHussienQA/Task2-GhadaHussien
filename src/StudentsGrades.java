import java.util.Scanner;

public class StudentsGrades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of students : ");
        int numberOfStudents = input.nextInt();

        for (int i = 1; i <= numberOfStudents; i++) {
            System.out.println(" Student " + i + ": ");


        System.out.print("Enter student name : ");
        String name = input.next();

        System.out.print(" Enter first score : ");
        double Score1 = input.nextDouble();

        System.out.print(" Enter second score : ");
        double Score2 = input.nextDouble();

        System.out.print(" Enter third score : ");
        double Score3 = input.nextDouble();

        double avg = getAverage( Score1 , Score2 , Score3 );
        String grade = getGrade(avg);
        System.out.println("Result for " + name + " : ");
        System.out.println("Average = " + avg);
        System.out.println("Grade = " + grade);
    }
        input.close();
    }
    public static double getAverage ( double s1 , double s2 , double s3 ) {
            return (s1 + s2 + s3) / 3 ;
        }
    public static String getGrade(double avg) {
            if (avg>=85) return "A";
            else if (avg >=70) return "B";
            else if (avg >= 50) return"C";
            else return "F" ;

            }

        }

