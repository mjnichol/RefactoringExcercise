package cmput301.typechecking;


/**
 * @see cmput301.typechecking.Employee#MANAGER
 */
public class Manager extends Type {

	public int payAmount(Employee employee) {
		return employee.getMonthlySalary() + employee.getBonus();
	}
}