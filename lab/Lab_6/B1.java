import java.util.*;
class Member{
	String name;
	int age;
	int phoneno;
	String address;
	int salary;

	Member(String name,int age,int phoneno,String address,int salary){
		this.name = name;
		this.age = age;
		this.phoneno = phoneno;
		this.address = address;
		this.salary = salary;
	}

	public void display(){
        System.out.println(name + age + phoneno + address + salary);
     }

}
class emp extends Member{
  String specialiazation;

  emp(String name,int age,int phoneno,String address,int salary){
		this.name = name;
		this.age = age;
		this.phoneno = phoneno;
		this.address = address;
		this.salary = salary;
	}

	public void display(){
        System.out.println(name + age + phoneno + address + salary);
     }
}

class manager extends Member{
  String department;
   manager(String name,int age,int phoneno,String address,int salary){
		this.name = name;
		this.age = age;
		this.phoneno = phoneno;
		this.address = address;
		this.salary = salary;
	}

	public void display(){
        System.out.println(name + age + phoneno + address + salary);
     }
}

class Main{
	public static void main(String[] args) {
		Member m = new Member("paresh",20,79856,"Rajkot",80000);
		emp e = new emp("xyz",30,89789,"Rajkot",9000);
		manager mn = new manager("abc",33,90908,"Chotila",78000);
       
       m.display();
       e.display();
       mn.display();
		
        
	}




	
}