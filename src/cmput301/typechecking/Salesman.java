package cmput301.typechecking;


/**
 * @see cmput301.typechecking.Employee#SALESMAN
 */
public class Salesman extends Type {


	public int payAmount(Employee employee) {
		return employee.getMonthlySalary() + employee.getCommision();
	}
}