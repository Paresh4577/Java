import java.util.*;
class Raj{
	int n1,n2; int add,mul,div,sub;
	public static void main(String[] args) {
		Raj r=new Raj();
		r.input();
		r.process();
		r.output();
	}
	void input(){
		Scanner r=new Scanner(System.in);
	    System.out.println("Enter the value of n1 :- ");
	    n1=r.nextInt();
	    System.out.println("Enter the value of n2 :- ");
	    n2=r.nextInt();
            
	}
	void process(){
		add=n1+n2;
		mul=n1*n2;
		div=n1/n2;
		sub=n1-n2;

	}
	void output(){
        System.out.println("add():-"+add);
        System.out.println("mul():-"+mul);
        System.out.println("div():-"+div);
        System.out.println("sub():-"+sub);


	}
}