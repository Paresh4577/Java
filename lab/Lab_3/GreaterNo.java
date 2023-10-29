import java.util.*;
class Greater{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter 1 no:");
		int num1 = sc.nextInt();

		System.out.print("Enter 2 no:");
		int num2 = sc.nextInt();

		System.out.print("Enter 3 no:");
		int num3 = sc.nextInt();


       if(num1>0){
		if(num1>num2 && num1>num3){
          System.out.println("Num1 Is Greater");
        }
          if(num2>num3 && num2>num1){
          	System.out.println("Num2 Is Greater");
          }
          else{
            System.out.println("Num3 Is Greater");
          }
		}


	}
}