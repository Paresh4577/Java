import java.util.*;
class ComplexNo{
	
	int real;
	int imaginery;
	int add;

	ComplexNo(int r,int i){
		this.real=r;
        this.imaginery=i;
	}

	public void show(){
     System.out.println(this.real+"+"+this.imaginery+"i");
	}

	public int addition(int n1,int n2){
        ComplexNo res = new ComplexNo(0, 0);
        res.real = n1.real+n2.real;
        res.imaginery = n1.imaginery+n2.imaginery;

        return res;
	}
	
	public static void main(String[] args) {
		ComplexNo cn1 = new ComplexNo(10,20);
		cn1.show();
		ComplexNo cn2 = new ComplexNo(14,28);
		cn2.show();

		ComplexNo c3 = new ComplexNo(0,0);
		c3.addition();

	}
	




}
