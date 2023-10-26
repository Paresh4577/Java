import java.util.*;
class Time{
	int hh;
	int mm;
	Time(int hh,int mm){
		this.hh=hh;
		this.mm=mm;
	}


	 void add(Time t1,Time t2){
		int h= t1.hh+t2.hh%12;
		int m= t1.mm+t2.mm%60;
	}
}

class Timecal{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
    System.out.println("Enter Time");

	Time t1= new Time(12,30);
	Time t2= new Time(3,13);

	Time sum = t1.add(t2);

	System.out.println("Sum is:"+sum);
}
}
