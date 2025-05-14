package revision;



public class Student {

	//public static void main(String[] args) {
		
		 private  String name;
		 private int rollnumber;
		
	//GENERATED VIA SOURCES	 
		 
//		 public int getRollnumber() {
//			return rollnumber;
//		}
//
//
//		public void setRollnumber(int rollnumber) {
//			
//			if(rollnumber<=0) {
//				throw new IllegalArgumentException("fuck off");
//			}
//			this.rollnumber = rollnumber;
//		}


		
		 
		 
		 //***GETTER***
		  
	    public int getRollNumber( ) //return type is int kyuki int me value dega
		
	            {
					 return this.rollnumber;
					 
				 }
	
		 
		 //****SETTERRR****
		
		 //getRollNumber this will be written in the camelCAse
		 public void setRollNumber(int rollnumber) // //(int rollnumber )we are putting in this.rollnumber=rollnumber 
		 {
			 if(rollnumber<=0) 
			 {
				 throw new IllegalArgumentException("not valid");
			 }
			 
			this.rollnumber =rollnumber;
		 }

		
		 public void Display()
		 {
			System.out.println(this.name); 
			System.out.println(this.rollnumber); 
		 }
		

	}


