import java.util.*;

class VowelCount{
	public void countVowels(String str) {
        for (char ch : str.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(ch) != -1) {
                switch (ch) {
                    case 'a':
                        counts[0]++;
                        break;
                    case 'e':
                        counts[1]++;
                        break;
                    case 'i':
                        counts[2]++;
                        break;
                    case 'o':
                        counts[3]++;
                        break;
                    case 'u':
                        counts[4]++;
                        break;
                }
            }
        }
    }
}

  public void displayCounts() {
        System.out.println("Vowel Counts : ");
        System.out.println("A : " + counts[0]);
        System.out.println("E : " + counts[1]);
        System.out.println("I : " + counts[2]);
        System.out.println("O : " + counts[3]);
        System.out.println("U : " + counts[4]);
    }


class Vowel{
	public static void main(String[] args) {
		int v=0,c=0;
	

		
		while(true){
		Scanner sc = new Scanner(System.in);
		String st= sc.nextLine();

		if(st.equals("Quit")){
			break;
		}
	}
	 
	System.out.println("Total Vowels Are:"+v);
}
}