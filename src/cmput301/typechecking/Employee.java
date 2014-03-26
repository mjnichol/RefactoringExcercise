package cmput301.typechecking;

public class Employee {
	private Type type;
	
	private int monthlySalary;
	private int commision;
	private int bonus;
	
	public Employee(Type aType){
		this.setType(aType);
	}

	public Type getType(){
		return type;
	}
	
	public void setType(Type empType){
		this.type = empType;
	}
	
	public int payAmount(){
		return type.payAmount(this);
	}

	public int getMonthlySalary() {
		return monthlySalary;
	}

	public int getCommision() {
		return commision;
	}

	public int getBonus() {
		return bonus;
	}

}
