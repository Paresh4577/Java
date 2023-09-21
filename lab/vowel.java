import java.util.*;
class Vowel{
	public static void main(String[] args) {
		int v=0,c=0;
		Scanner sc = new Scanner(System.in);
		String st= sc.next();

		for(int i=0;i<st.length();i++){
			if(st.charAt(i)=='a'||st.charAt(i)=='e'||st.charAt(i)=='o'||st.charAt(i)=='u'){
				v++;
				System.out.println("Vowels Are:"+st.charAt(i));
			}
			else{
				c++;
				System.out.println("Consonent:"+st.charAt(i));

			}
		}
		
	}
}