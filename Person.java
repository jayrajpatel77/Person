
public class Person {
	protected String name;
	protected String address;
	protected String emailId;
	protected double mobileNumber;
	
	
	public Person(String name, String address, String emailId, double mobileNumber) {
		
		
		this.name=name;
		this.address=address;
		this.emailId=emailId;
		this.mobileNumber=mobileNumber;
		
		
	}
	
	public String toString() {
		return name+" "+address+" "+emailId+" "+mobileNumber+" ";
	}
	
	

}

	class Student extends Person{
		
		private String status;

		public Student(String name, String address, String emailId, double mobileNumber, String status) {
			super(name, address, emailId, mobileNumber);
			
			
			this.status=status;
			// TODO Auto-generated constructor stub
		}
		
		public String getStatus() {
			String status = null;
			if (status==" Freshman")
				return "Freshman";
			else if  (status==" sophomore")
				return "sophomore";
			else if (status==" junior")
				return "junior";
			else if (status==" Senior")
				return "Senior";
			else 
				return null;
		}
		
		public String toString() {
			return name+" "+address+" "+emailId+" "+mobileNumber+" "+ status+" ";
		}
		
		
		
	}
	
	class Employee extends Person{
		private String Office;
		private int salary;
		private int dateOfJoin;

		public Employee(String name, String address, String emailId, double mobileNumber,String Office,int salary,int dateOfJoin) {
			super(name, address, emailId, mobileNumber);
			this.Office=Office;
			this.salary=salary;
			this.dateOfJoin=dateOfJoin;
			// TODO Auto-generated constructor stub
		}
		 {
			// TODO Auto-generated constructor stub
		}
		public String toString() {
			return name+" "+address+" "+emailId+" "+mobileNumber+" "+ Office+" "+salary+" "+ dateOfJoin+" ";
		}
		
		
	}
	
	class Faculty extends Employee{
		private int officeHour;
		private String rank;

		public Faculty(String name, String address, String emailId, double mobileNumber, String Office, int salary,
				int dateOfJoin, int officeHour, String rank) {
			super(name, address, emailId, mobileNumber, Office, salary, dateOfJoin);
			
			this.officeHour=officeHour;
			this.rank=rank;
			// TODO Auto-generated constructor stub
		}
		public String toString() {
			return rank+ " "+officeHour+" ";
		}
		
		
		
	}
	class Staff extends Employee{
		private String title;

		public Staff(String name, String address, String emailId, double mobileNumber, String Office, double salary,
				int dateOfJoin, String title) {
			super(name, address, emailId, mobileNumber, Office, (int) salary, dateOfJoin);
			this.title=title;
			// TODO Auto-generated constructor stub
		}
		public String toString() {
			return title+" ";
		}
		
		
		
	}
	class MyDate{
		private int year;
		private int month;
		private int day;
		
		public String toString() {
			return year+"-"+month+"-"+day;
		}
	}
	
	class test{
		Person p = new Person("Jayraj","113 cherrylawmn ave","jayrpatel@algomau.ca",4062);
		Student s= new Student("Jayraj","113 cherrylawmn ave","jayrpatel@algomau.ca",4062,"Senior");
		Employee e =new Employee("Jayraj","113 cherrylawmn ave","jayrpatel@algomau.ca",4062,"toronto",50000,072001);
		Faculty f=new Faculty("Jayraj","113 cherrylawmn ave","jayrpatel@algomau.ca",4062,"toronto",50000,072001,40,"Manager");
		Staff s1 =new Staff("Jayraj","113 cherrylawmn ave","jayrpatel@algomau.ca",4062,"toronto",50000,072001,"Branch Manager");
		
	}
	
