import java.util.*;
class Student
{
	int id_no;
	int no_of_students_registered;
	int[] subject_code;
	int[] subject_credits;
	int[] grade_obtained;
	double spi;
	int i,j;
	
	Student(int id_no,int no_of_students_registered,int subject_code[],int subject_credits[],int grade_obtained[])
	{
		this.id_no=id_no;
		this.no_of_students_registered=no_of_students_registered;
		this.subject_code=subject_code;
		this.subject_credits=subject_credits;
		this.grade_obtained=grade_obtained;
	}
	void spi()
	{
		double totalweight=0.0;
		int totalcredit=0;
		for(i=0;i<no_of_students_registered;i++)
		{
		totalweight+=subject_credits[i]*grade_obtained[i];
		totalcredit+=subject_credits[i];
		}
		spi=totalweight/totalcredit;
		System.out.println("spi is:" +spi);
	}
}

	
class Stu_spi_calculation{
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	int n=Integer.parseInt(args[0]);
	int[] student=new int[n];
	Student[] s=new Student[n];
	int i,j;
		
		for(i=0;i<student.length;i++)
		{
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
			s[i]=new Student(id_no,no_of_students_registered,subject_code,subject_credits,grade_obtained);
			s[i].spi();
			
		}
	}
}