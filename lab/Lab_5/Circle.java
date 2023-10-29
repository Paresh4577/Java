import java.util.*;
class Circle{
	double pi = 3.14;
	double area;
	public static void main(String[] args) {
		Circle c1 = new Circle();
		c1.CircleDemo();
	}

void CircleDemo(){
	System.out.println("Enter The Radius Of Circle");
	
	Scanner sc = new Scanner(System.in);
	double radius = sc.nextDouble();

    area = pi*Math.pow(radius,2);

    System.out.println("The Area Of Circle Is:"+area);
}
}