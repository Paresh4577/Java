import java.util.*;
class Circle{
	public static void main(String[] args) {
		double pi=3.14,area;
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter r:");
       int r = sc.nextInt();

		area = pi*r*r;
		System.out.println("The area of circle is:"+area);
	}
}