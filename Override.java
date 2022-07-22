package oopsexamples;

class Vehicle{  
	  
	  void run(){System.out.println("Vehicle is running");}  
	}  
	  
	class Override extends Vehicle{  
	  
	  void run(){System.out.println("Bike is running safely");}  
	  
	  public static void main(String args[]){  
	Override obj = new Override(); 
	  obj.run(); 
	  }  
	}  
