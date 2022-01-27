package java_1stClass_Variable;

public class Learn_Variable {

	//Class is a blue print of Object
	//Two type of Variables 1)Global Variable or Instant Variable
	//                      2)Local Variable
	//Non-Static Global Variable or Instant Variable Call by Object name
	//Exam:
	  String name="Belayet";
	  int age=57;
	
	//Static Global Variable or Instant Variable Call by Class name
	//Note: If it is same Class, No need to mention the Class name but for different Class,
	//      Class name should be mention
	//Exam:
	  static String nicname="Miru";
	  static int salary=2000;
	  static String brothername="Zakir";
	  static int hisage=52;

	public static void main(String[] args) {
		//Printing Non-Static Variable creating with object
		Learn_Variable obj = new Learn_Variable();
		System.out.println("My Name is "+obj.name+" and Age is "+obj.age);

		//Printing Static Variable calling with Class Name
		System.out.println("My Brothers Name is "+Learn_Variable.brothername+" and His age is "+Learn_Variable.hisage); //mention the Class name

		//Printing Static Variable calling without Class name because it is the same Class
		System.out.println("My Nic Name is "+nicname+" and Salary is "+salary);

		obj.display(); //Non-Static Mathod Call by Object Name

		Learn_Variable.display1();//Static Mathod Call by Class Name

		display1(); //Same Class So no need to Call by Class Name
		
		//==== Call from Another Class
		//Non-Static Variable call by object Name
		Variable ob =new Variable();
		System.out.println("My Fatyher Name is "+ob.fathername);

		//Non-Static Method call by object Name
		ob.VariableMethod();

		//Static Variable call by Class Name
		System.out.println("He died in "+Variable.deathyear);

		//Static Method call by Class Name
		Variable.VMethod();
	}

	//Non-Static Mathod
	//Call by Object Name
	public void display() {
		String fname="Mohammed";
		String lname="Hossain";
		System.out.println("My Name is "+fname+" "+lname);
	}
	
	//Static Mathod
	//Call by Class Name
	public static void display1() {
		String address1="718 Taylor Ave";
		String address2="New York, 10473";
		System.out.println("My Address is "+address1+"\n\t\t\t  "+address2);

	}
	
}
