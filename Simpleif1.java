import java.util.*;
class Simpleif{
	public static void main(String[] args) {
              int diff;

	Scanner sc = new Scanner(System.in);
       System.out.println("Enter 1 num");
       int num1 = sc.nextInt();
       System.out.println("Enter 2 num");
       int num2 = sc.nextInt();
       
       diff = num1-num2;
        System.out.println("The Difference is:"+diff);
       if(diff>0){
       	System.out.println("The Number Is Positive:");
       }
       if(diff<0){
       	System.out.println("The Number Is Nagative:");
       }

	}
}