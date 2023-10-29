import java.util.*;
class Vowel{
	public static void main(String[] args) {
		int v=0,c=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter A String:");
		String st= sc.next();

		for(int i=0;i<st.length();i++){
			if(st.charAt(i)=='a'||st.charAt(i)=='e'||st.charAt(i)=='o'||st.charAt(i)=='u'){
				v++;
			}
			else{
				c++;
			}
		}
        
        System.out.println("Total Consonent Are:"+v);
        System.out.println("Total Vowel Are:"+c);


		
	}
}