package inheritance;

public class derived extends base{
	void derivedmethod(){
		System.out.println("2normal derived class method!!!!!!!!!!!!");
	}
	
	
	
	
	derived(){
		System.out.println("3normal derived class method!!!!!!!!!!!!");
		
	}
	
    public static void main(String[] args){
		derived d = new derived();
		d.method();
			
		
	}

}
