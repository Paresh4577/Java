// Declare a class called student having following data members:id_no, no_of_subjects_registered, subject_code,
// subject_credits, grade_obtained and spi. Define constructor and calculate_spi methods.
//Define main to instantiate an array for objects of class student to process data of n students to 
//be given as command line arguments.

import java.util.*;
class student{
	int id_no;
	int no_of_subjects_registered;
	String[] subject_code;
	double[] subject_credits;
	char grade;
	double spi;

	student(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student Id No:");
		id_no = sc.nextInt();

		System.out.println("Enter No Of Subject:");
		no_of_subjects_registered = sc.nextInt();

		subject_code = new String[no_of_subjects_registered];
		subject_credits = new double[no_of_subjects_registered];

		for(int i=0;i<no_of_subjects_registered;i++){
			System.out.println("Enter "+(i+1)+"Subject Code");
			subject_code[i] = sc.next();
			System.out.println("Enter "+(i+1)+"Subject credits");
			subject_credits[i] = sc.nextDouble();
		}

		System.out.println();
	}

	double calculate_spi(){
		double sum=0;
		for(int i=0;i<no_of_subjects_registered;i++){
			sum = sum+subject_credits[i];
		}
		spi = (sum/no_of_subjects_registered)/10;
		return spi;
	}
}

class Main{
	public static void main(String[] args) {
      student s[] = new student[Integer.parseInt(args[0])];

      System.out.println(s.length);
      for(int i=0;i<s.length;i++){
      	s[i] = new student();
      }
      for(int i=0;i<s.length;i++){
      	System.out.println((i+1)+"Student SPI:"+s[i].calculate_spi());
      }
	}
}