package startup;



 class Calc
{
	  int num1,num2;
	  
	 
	 
	 int perform()
	 {
		 return num1+num2;
	 }
	 
	
}

public class Student {

	
	public static void main(String args[])
	{
		
		Calc obj = new Calc();
		
		obj.num1=10;
		obj.num2=20;
		
		System.out.print(obj.perform());
		
		
	}
}
