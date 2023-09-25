 import java.util.*;
 import java.lang.*;
class S{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter A String:");
		String st = sc.next();

		System.out.println("Length Of String:"+st.length());
		System.out.println(st.substring(0,st.length()/2));
	}
}
//  class StringCountWithSpace {
//     public static void main(String[] args) {
    	
//         String text = "Paresh Mori";

//         // Count the number of characters, including spaces
//         int charCount = text.length();

//         System.out.println("Total characters (including spaces): " + charCount);
//     }
// }
