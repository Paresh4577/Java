import java.util.*;
class Triangle{
	public static void main(String[] args) {

		int total;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 1 Num:");
		int num1 = sc.nextInt();

		System.out.println("Enter 2 Num:");
		int num2 = sc.nextInt();

        System.out.println("Enter 3 Num:");
		int num3 = sc.nextInt();

		total = num1+num2+num3;

		if(total==180){
			System.out.println("The Triangle Is Valid");
		}
		else{
			System.out.println("The Triangle Is Not Valid");
		}


	}
}