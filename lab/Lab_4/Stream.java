import java.util.*;
class Stream{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st = sc.next();

		for(int i=0;i<st.length();i++){
			for(int k=st.length();k>i;k--){
			System.out.print(" ");
		}
			for(int j=0;j<=i;j++){
				System.out.print(" ");
				System.out.print(st.charAt(j));
			}
			System.out.println();
		}
	}
}