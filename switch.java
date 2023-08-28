import java.util.*;

class Grade{
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Percentage(%):");
        int pr = sc.nextInt();

        switch (pr/10) {
            case 10:
            case 9:
            System.out.println("Distinction");
            break;  
            case 8:
            System.out.println("Distinction");
            break;
            case 7:
            System.out.println("A grade");
            break;
             case 6:
            System.out.println("B grade");
            break;
             case 5:
            System.out.println("C grade");
            break;
            case 4:
            System.out.println("D grade");
            break;
            case 3:
            System.out.println("Fail");
            break;
            case 2:
            System.out.println("Fail");
            break;
            case 1:
            System.out.println("Fail");
            break;
            case 0:
            System.out.println("Fail");
            break;
            default:
                break;
        }
        sc.close();
    
    }
}