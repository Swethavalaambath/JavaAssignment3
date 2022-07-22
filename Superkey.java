package oopsexamples;

 
	class Superanimal
	{  
		String color="white"; 
		void eat()
		{System.out.println("eating...");}
		 Superanimal()
		{System.out.println("animal is created");}  
		
			}  
		
		class Dognew extends Superanimal{  
		String color="black";  
		
		void printColor(){  
		System.out.println(color); 
		System.out.println(super.color); 
		}  
		void eat(){System.out.println("eating bread...");} 
		void bark(){System.out.println("barking...");}  
		void work() {  
		super.eat(); } 
		
		Dognew(){  
			super();  
			System.out.println("dog is created");  
		}  }
		
		public class Superkey{  
		
		public static void main(String args[]){  
		Dognew d=new Dognew();  
		d.printColor();  
		}}  

