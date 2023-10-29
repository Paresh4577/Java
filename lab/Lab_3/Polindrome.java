import java.util.*;
class Polindrome{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Num:");
		int n = sc.nextInt();

		int temp = n;

		int n1 = temp/10;
		int n2 = n1/10;
		int n3 = n2/10;
        int rev = 0;
		while(temp>0)
		{
          n3 = temp%10;
          rev = (rev*10)+n3;
          temp = temp/10;
		}
		if(n==rev){
			System.out.println("The Num Is Polindrome");
		}
		else{
			System.out.println("The Num Is Not Polindrome");
		}
	}
}