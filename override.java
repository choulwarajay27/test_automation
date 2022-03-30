package inheritance;

public class override {
	
	int ovld(int a, int b){ 
	
		return a+b;
	}
     int ovld(int a, int b,int c){ 
		return a+b+c;
	}
     String ovld(String a, String b, String c){ 
    		
 		return a+b+c;
 	}
	
	
	
	
	public static void main(String[] args){
		override u = new override();
		System.out.println(u.ovld(2,30));
		System.out.println(u.ovld(2,30,5));
		System.out.println(u.ovld("2"," 30"," 5"));
		
	}

}
