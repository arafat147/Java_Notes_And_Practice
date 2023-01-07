package basicJava;

public class H_Constructor {

	//Constructor : a constructor is a special type of method which is used to initialize a newly created object  .


//	public  H_Constructor() {
//		
//	}
	String empName;
	int empID;
	double empSalary;

    int age;
    double height;



    public H_Constructor(String name){
        System.out.println("student name is " + name);
    }


    public H_Constructor(String address, String zipCode) {

        System.out.println("Address is " + address + " and zip code is " + zipCode);

    }


//    public H_Constructor(int newAge, double newHeight) {
//
//        this.age = newAge;
//        this.height = newHeight;
//
//        System.out.println("Student age is " + this.age + " and student's height is " + this.height);
//
//    }


    public H_Constructor(int newAge, double newHeight){
        this.age = newAge;
        this.height = newHeight;
        System.out.println("Alex is " + newAge + "years old and he is " + newHeight + " feet long");
    }


    public static int doAddition() {

        int a = 10;
        int b = 5;

        return b;

    }

    public void H_Constructor(String empName, int empId, Double empSalary){

    	this.empName = empName;
    	this.empID = empId;
    	this.empSalary = empSalary;
		System.out.println("emp name is " + empName + " and emp id is " + empId + " with salary of " + empSalary);

	}

    public static void main(String[] args) {

//		H_Constructor obj1 = new H_Constructor("Alexa");
//
//		H_Constructor obj2 = new H_Constructor("Queens, NY", "11377");
//
//		H_Constructor obj3 = new H_Constructor(25, 6.5);

        System.out.println(H_Constructor.doAddition());

        H_Constructor obj3 = new H_Constructor("alex","10069");

        H_Constructor obj1 = new H_Constructor("Alex");
        H_Constructor obj4 = new H_Constructor(15,6.5);


    }

}
