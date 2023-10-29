import java.util.*;
class Vowel{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String st = sc.nextLine();
	while(true){
    st += sc.nextLine();
	if(st.contains("Quit")){
		break;
	}

}
    int a=0;
    int e=0;
    int i=0;
    int o=0;
    int u=0;

   for(int j=0;j<st.length();j++){
   	if(st.charAt(j)=='a'){
   		a++;
   	}
   	if(st.charAt(j)=='e'){
   		e++;
   	}
   	if(st.charAt(j)=='i'){
   		i++;
   	}
   	if(st.charAt(j)=='o'){
   		o++;
   	}
   	if(st.charAt(j)=='u'){
   		u++;
   	}
  }

     System.out.println("Total A Are:"+a);
     System.out.println("Total E Are:"+e);
     System.out.println("Total I Are:"+i);
     System.out.println("Total O Are:"+o);
     System.out.println("Total U Are:"+u);

	}
}