package entities;

public class PJ extends Payers {

	private Integer employees;
	
	public PJ() {
		
	}
	public PJ(String name, Double income, Integer employees) {
		super(name, income);
		this.employees = employees;
	}
	
	@Override
	public double taxesPaid() {
		if(employees > 10) {
		
			return getIncome() * 14/100;
			
		}else {
			
			return getIncome() * 16/100;
			
		}
	}
	
}
