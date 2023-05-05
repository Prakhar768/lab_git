package day8_class;
class Database1
{
	//static & non static variable |methods
	String name;  //non static |instance variable 
	String password;
	static String driver;//static |class variable
	
	//non static method can access sttaic as well as non static variables
	void input ()
	{
		name="root";
		password="root";
	    driver="xcxkcx";
	}
	//static method can access only static variables of class
	//to access non static variables we need toi create class object 
	static void show()
	{
		driver="kddfdlfdl";
		Database1 r= new Database1();
		r.name="sds";
		r.password="dfdfd";
		
	}
	
	
}

public class StaticExample {

	public static void main(String[] args) {
		 
		Database1 d= new Database1();
		 d.input();
		
		 //static methods are called with classname 
		 Database1.show();
		

	}

}
