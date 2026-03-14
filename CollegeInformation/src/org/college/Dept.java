package org.college;
//Child Class
public class Dept {
	
	private void deptName() {
	
		System.out.println("Math O Math");
		
	}
	public static void main(String[] args) {
		
	
	// Child Class object creation

		Dept mathOne = new Dept();
		
		mathOne.deptName();
		
			//Parent Class Object creation
 
		//ClassName ObjectName = new Class Name(); 
				College numberOne = new College();
				
						//method calling
				//ObjectName.methodName();
				numberOne.collegeName();
				numberOne.collegeCode();
				numberOne.collegeRank();
				
			//Parent Class Object creation
				//ClassName ObjectName = new ClassName();
				Student personOne = new Student();
				//method calling
				//ObjectName.methodName();
				
				personOne.studentName();
				personOne.studentId();
				personOne.studentDept();
				
			//Parent Class Object creation
				//ClassName ObjectName = new ClassName();
				Hostel nameOne = new Hostel();
				//method calling
				//objectName.methodName();
				nameOne.hostalName();
				
	}
}
				
				
			
	
	
	
	
	
	
	
			
			
		
