package entities;

public class PF extends Payers {

	private Double healthExpends;

	public PF() {
		
	}
	public PF(String name, Double income, Double healthExpends) {
		super(name, income);
		this.healthExpends = healthExpends;
	}
	public Double getHealthExpends() {
		return healthExpends;
	}
	public void setHealthExpends(Double healthExpends) {
		this.healthExpends = healthExpends;
	}
	
	@Override
	public double taxesPaid() {
		if(getIncome() < 20000) {
			
			return getIncome() * 15/100 - healthExpends * 50/100;
			
		}else {
			
			return getIncome() * 25/100 - healthExpends * 50/100; 
		}
	}
	
}
