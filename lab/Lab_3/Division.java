import java.util.*;

class Markifelse{
    public static void main(String[] args) {

        Scanner r = new Scanner(System.in);
        System.out.print("Enter marks for subject 1: ");
        double subject1 = r.nextDouble();
        System.out.print("Enter marks for subject 2: ");
        double subject2 = r.nextDouble();
        System.out.print("Enter marks for subject 3: ");
        double subject3 = r.nextDouble();
        System.out.print("Enter marks for subject 4: ");
        double subject4 = r.nextDouble();
        System.out.print("Enter marks for subject 5: ");
        double subject5 = r.nextDouble();

    
        double totalMarks = subject1 + subject2 + subject3 + subject4 + subject5;

    
        double percentage = (totalMarks / 500) * 100;

    
        String division;
        
         if( percentage >=80 ){
           division="First Division with A++";
        }
         else if (percentage >= 60) {
            division = "First Division";
        } else if (percentage >= 50) {
            division = "Second Division";
        } else if (percentage >= 40) {
            division = "Third Division";
        } else {
            division = "Fail";
        }

    
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Division: " + division);

        r.close();

    }
}