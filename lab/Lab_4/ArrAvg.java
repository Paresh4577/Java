import java.util.*;
class Arravg{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A String:");
		 int num = sc.nextInt();

		 int a[] = new int[num];

		 int sum=0,avg=0;

		 for(int i=0;i<num;i++){
		 	System.out.println("Enter Numbers:");
		 	a[i]=sc.nextInt();

		 	sum+=5;
		 	avg=sum/5;
		 }
		 System.out.println("The Sum is:"+sum);
		 System.out.println("The Avg Of Sum Is:"+avg);
	}
}