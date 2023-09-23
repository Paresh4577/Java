import java.util.*;
class Allsum{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

	    System.out.println("Enter 1 Value:");
	    int a = sc.nextInt();

	    System.out.println("Enter 2 Value:");
	    int b = sc.nextInt();

	    System.out.println("Enter a operation to perform(+,-,*,/)");
	    String op = sc.next();
        
        if(op.equals()='+'){
        	System.out.println("The Addition is:"+(a+b));
        }
        else if(op.equals()='-'){
        	System.out.println("The Substraction is:"+(a-b));
        }
        else if(op.equals()='*'){
            System.out.println("The Multiplication is:"+(a*b));
        }
         else if(op.equals()='/'){
            System.out.println("The Division is:"+(a/b));
        }
        else{
        	System.out.println("please Enter number!");
        }



	}
	
}
