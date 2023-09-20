import java.util.*;
class Rangeprime{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	int start = sc.nextInt();
	int end = sc.nextInt();
	boolean flag=true;

	for(int j=start;j<end;j++){
		for(int i=2;i<j/2;i++){
			if(j%i==0){
				flag=false;
				break;
			}
			else{
				flag=true;
			}
		}
			if(flag){
				System.out.println(j+"\t");
			}
		
	}
	}
}