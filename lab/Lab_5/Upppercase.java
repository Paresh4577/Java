import java.util.*;
// class Upper{
// 	public static void main(String[] args) {
// 		Scanner sc=new Scanner(System.in);
// 		System.out.println("Enter String");
//             String st = sc.next();
//             String fu = st.substring(0,1).toUppercase();

		
// 		if(fu){
// 			System.out.println("Success");
// 		}
// 		else{
// 			System.out.println("Invalid String");
// 		}
// 	}
// }

class UppercaseFirstCharacter {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter String");
     String input = sc.next();
        
        if(input.charAt(0)>=65&&input.charAt(0)<=90){
        	System.out.println("Success");
        }
        else{
        	System.out.println("Invalid String");
        }
        // Check if the input string is not empty
     //        // Convert the first character to uppercase
     // String firsChar= input.substring(0,1);
     //        String firstCharUppercase = input.substring(0, 1).toUpperCase();
     //        String firstCharLowercase = input.substring(0,1).toLowerCase();

     //        if(input.charAt(0)=='A'){
     //        	 System.out.println("Success");
     //        }
     //        else{
     //        	System.out.println("Invalid String");
     //        }

           
        //     // Get the rest of the string
        //     String restOfString = input.substring(1);
            
        //     // Concatenate the first character and the rest of the string
        //     String result = firstCharUppercase + restOfString;
            
        //     System.out.println("Original string: " + input);
        //     System.out.println("String with first character in uppercase: " + result);
        // } else {
        //     System.out.println("Input string is empty.");
        }
    }

