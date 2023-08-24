import java.util.*;
class temperature{
	public static void main(String[] args) {
		double nc,nf;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter F:");
		double f= sc.nextDouble();
         nc = f-32*5/9;

		System.out.println("Enter c:");
		double c= sc.nextDouble();
        nf = c-32*5/9;
		
		
        
		System.out.println("The f convert to c is:"+c);
		System.out.println("The c convert to f is:"+f);

	}
}
