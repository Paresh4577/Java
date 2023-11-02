//Demonstrate the use of Super Keyword.
import java.util.*;

class Super{
  public void display(){
  	System.out.println("The Women Is Living:");
  }
}

class SuperDemo extends Super{
  public void display(){
  	System.out.println("The Man Is Living:");
  }
  public void work(){
  		super.display();
  	}
  	
  
}

class Main{
	public static void main(String[] args) {
		SuperDemo sd = new SuperDemo();
		sd.work();
	}
}