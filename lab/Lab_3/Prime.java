import java.util.*;
class Prime{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number:");
		int n = sc.nextInt();
         
         boolean flag=false;


        for(int i=2;i<n-1;i++){
        	if(n%i==0){
              flag=true;
              break;
        	}
        	else{
        		flag=false;
        		
        	}
   }


        if(flag){
           System.out.println("Number Is Not Prime");
        }
        else{
        	System.out.println("Number Is Prime");
        }

        



		}
}