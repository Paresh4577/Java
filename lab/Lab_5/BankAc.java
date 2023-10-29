import java.util.*;
class Bank{
	int acno;
	String username;
	String email;
	String ac_type;
	int ac_balance;

	public void GetAcDetails(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Account No:");
		acno = sc.nextInt();

		System.out.print("Enter Username:");
		username = sc.next();

		System.out.print("Enter Email:");
		email = sc.next();

		System.out.print("Enter Account Type:");
		ac_type = sc.next();

		System.out.print("Enter Balance Of Account:");
		ac_balance = sc.nextInt();

	   }

	   public void Display(){
	   	System.out.println("The Account No is:"+acno);
	   	System.out.println("The Account Username is:"+username);
	   	System.out.println("The Email is:"+email);
	   	System.out.println("The ac_type is:"+ac_type);
	   	System.out.println("The Account Balance is:"+ac_balance);
	   }

	   public static void main(String[] args) {
	       Bank b = new Bank();
	       
	       b.Display();
	   }
    
}
	