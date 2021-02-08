class Demo {
	public static void main(String args[]) {
	int abc[]={10,20,30,40,50,60};	
	System.out.println("Welcome to java.....");
	System.out.println(abc[0]);
	System.out.println("using for loop");
	for(int i=0;i<abc.length;i++) {
		System.out.println(abc[i]);
	}
	System.out.println("for each loop");
	for(int a:abc) {
		System.out.println(a);
	}
	}
}
