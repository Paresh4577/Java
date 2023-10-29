class StaticCount{
	static int a=0;

	StaticCount(){
       a++;
	}


	public static void main(String[] args) {
		StaticCount s1 = new StaticCount();
		StaticCount s2 = new StaticCount();
		StaticCount s3 = new StaticCount();

		System.out.println("The Total Object Are:"+a);
	}
}