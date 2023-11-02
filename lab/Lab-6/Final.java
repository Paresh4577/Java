//Demonstrate the use of Final Keyword.
import java.util.*;

class Final{
  final int appleprice = 100;
  void eat(){
  	appleprice = 200;
  }
}


class Main{
	public static void main(String[] args) {
		Final f =new Final();
		f.eat();
	}
}