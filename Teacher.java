public class Teacher 
{
	String TeacherName;
	int Teacher_age;

	Teacher()
	{
		
	}
	
	void setname(String TeacherName)   			//TeacherName = "Maria"
	{
		this.TeacherName = TeacherName;				// This refers to the current object
		
	}
	void setage(int Teacher_age)
	{
		this.Teacher_age = Teacher_age;											//use of this keyword 
	}
	
	
	public static void main(String[] args) 
	{
		Teacher obj = new Teacher();
		obj.setname("Maria");
		obj.setage(45);
		System.out.println(obj.TeacherName);
		System.out.println(obj.Teacher_age);
	}

}
