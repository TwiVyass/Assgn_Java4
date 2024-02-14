class Student {
	// decalrinng some private varibles 
	private String prn;
	private String name;
	private String dob;
	private double marks;
	
	// initializing constructor
	// parameterized constructor
	Student(String prn, String name, String dob, double marks) {
		this.prn = prn;
		this.name = name;
		this.dob = dob;
		this.marks = marks;
	}
	// allocate some space to prn, name, dob
	// default constructor that will run the second the class runs 
	
	// access private variables : write setter, getter method
	public void setPRN(String prn) {
		this.prn = prn; // setter method for prn
	}
	// access setprn to change prn for that particular instance
	
	public String getPRN() {
		return prn;
	}
	
	// Setter and getter for name
	public void setName(String name) {
		this.name = name; // setter method for name
	}
	// access setprn to change prn for that particular instance
	
	public String getName() {
		return name;
	}
	
	// setter and getter for dob
	public void setDOB(String dob) {
		this.dob = dob; // setter method for dob
	}
	// access setprn to change prn for that particular instance
	
	public String getDOB() {
		return dob;
	}

	
	public double getMarks() {
		return marks;
	}
	
	public void setMarks(double marks) {
		this.marks = marks;
	}
	
	public String toString() {
		return "PRN: " + prn + " Name:" + name + " DoB:" + dob + " Marks:" + marks;
	}
}
