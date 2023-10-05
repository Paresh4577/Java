import java.util.*;
class Uppercase{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter A String:");
	String st=sc.next();

	if(st.charAt(0)>=97&&st.charAt(0)<=122){
		System.out.println("String Is Not Valid");

	}
	else{
		System.out.println("String Is Valid");
	}

	}
}