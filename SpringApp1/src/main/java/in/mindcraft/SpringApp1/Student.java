package in.mindcraft.SpringApp1;

public class Student {

	private int rollno;
	private String name;
	private Address add;
	
	
	


	public int getRollno() {
		return rollno;
	}





	public void setRollno(int rollno) {
		this.rollno = rollno;
	}





	public String getName() {
		return name;
	}





	public void setName(String name) {
		this.name = name;
	}





	public Address getAdd() {
		return add;
	}





	public void setAdd(Address add) {
		this.add = add;
	}





	public void display() {
		System.out.println(rollno);
		System.out.println(name);
		add.display();
	}
}
