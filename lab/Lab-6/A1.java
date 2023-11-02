/*Declare a class called student having following data members:id_no,
no_of_subjects_registered, subject_code, subject_credits,
grade_obtained and spi. Define constructor and calculate_spi
methods.Define main to instantiate an array for objects of class student
to process data of n students to be given as command line arguments.*/
import java.util.*;

class Student{
  int id_no;
  int no_of_subject_registered;
  int[] subject_code;
  int[] subject_credits;
  int[] grade_obtained;
  double spi;

  Student(int id_no,){
  this.id_no=id_no;
  this.no_of_subject_registered=no_of_subject_registered;
  this.subject_code=subject_code;
  this.subject_credits=subject_credits;
  this.grade_obtained=grade_obtained;
  double spi;
  }
}

class Main(){
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = (args[0]);
		Student[] s = new Student[size];

		for(int i=0;i<n;i++){
        System.out.println("Enter student id_no:");
		int id_no=sc.nextInt();  
		System.out.println("Enter student no_of_students_registered:");
		int no_of_students_registered=sc.nextInt();
		int subject_code[]=new int[no_of_students_registered];
		int subject_credits[]=new int[no_of_students_registered];
		int grade_obtained[]=new int[no_of_students_registered];

		for(j=0;j<subject_code.length;i++)
			{
				System.out.println("Enter student subject_code:");
				subject_code[j]=sc.nextInt();
				System.out.println("enter subject credits:");
				subject_credits[j]=sc.nextInt();
				System.out.println("enter subject obtained:");
				grade_obtained[j]=sc.nextInt();
			}
		}
	}
}