import java.util.*;
class RangePrime{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a 1 Number:");
		int n1 = sc.nextInt();
         
    System.out.print("Enter a 2 Number:");
    int n2 = sc.nextInt();

    boolean flag=false;

    
    for(int i=n1;i<=n2;i++){
      for(int j=2;i<i-1;i++){
        
      }
    }

    for(int i=2;i<n1-1;i++){
          if(n1%i==0){
              flag=true;
              break;
          }
          else if(n2%i==0){
            flag=true;
            break;
          }
          else{
            flag=false;
          }
   }

        if(flag){
           System.out.println("Prime Numbers:"+j);
        }
          

        



		}
}