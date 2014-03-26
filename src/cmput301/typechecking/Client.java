package cmput301.typechecking;

public class Client {
	
	public static void main(String args[]){
		Employee emp1 = new Employee(new Engineer());	
		emp1.payAmount();
		emp1.setType(new Manager());
		emp1.payAmount();
	}
}
