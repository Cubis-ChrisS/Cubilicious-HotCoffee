
public class Employee {
	
	//Instance variables
	//Private for encapsulation
	private String name;
	private int age;
	private int code;
	
	//Static variables or Class variables
	public static String description;
	public static int count = 0;
	
	//Constant variables in UPPERCASE
	public final static int LUCKY_NUMBER = 7;
	
	//Constructor

	
	public Employee(String name, int age) {
		this(name,age, count);
	}
	
	public Employee(String name, int age, int code) {
		
		//Generate unique ID
		count++;
		
		this.name = name;
		this.age = age;
		this.code = count;
		
	}
	
	//Methods
	public void comment() {
		System.out.println("My name is " + name + " and I am " + age + " years old; my Employee code is: " + code + " and I am a: " + description); 
	}
	
	public void sayHello() {
		System.out.println("Hello there!");
	}
	
	public void listNames(String[] names, int empCount) {
		for (int i = 0; i < empCount;i++) {
			System.out.println(names[i]);
		}
	}
	
	public int calculateYearsToRetirement() {
		int yearsLeft = 65 - age;	
		return yearsLeft;
	}
	
	//User information methods
	
	public void setEmployeeInfo(String name, int age) {
		setAge(age);
		setName(name);
	}
	
	//Age
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	//Name
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
}
