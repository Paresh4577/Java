import java.util.*;
class Account{
	
	double amount;
	Account(){
		amount = 5000;
	}

	public void display(){
       System.out.print("Total Amount is:\n"+amount);
	}

	public void deposit(double p){
		 amount = amount+p;
	}

	public void withdraw(double p){
		try{
			if((amount-p)<5000){
				throw new Exception("Sorry Not Enough Balance! You Cant Withdraw");
			}
			else{
				 amount = amount-p;
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}

class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Account a = new Account();
		while(true){
			System.out.println("Enter a Choice:\n 1.Balance Check\n 2.Deposit\n 3.Withdraw.\n 4.Exit");
			int choice = sc.nextInt();
			switch(choice){
				case 1:
				a.display();
				break;

				case 2:
				System.out.println("Enter Amount You Want to Deposit:");
				double amt = sc.nextDouble();
				a.deposit(amt);
				break;

				case 3:
				System.out.println("Enter Amount You Want to Withdraw:");
				double amt1 = sc.nextDouble();
				a.withdraw(amt1);
				break;

				case 4:
				System.exit(0);
			}
		}
	}
}