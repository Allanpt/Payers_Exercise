package entities;

public abstract class Payers {
	
	private String name;
	private Double income;
	
	public Payers() {
		
	}
	public Payers(String name, Double income) {
		
		this.name = name;
		this.income = income;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getIncome() {
		return income;
	}
	public void setIncome(Double income) {
		this.income = income;
	}
	public abstract double taxesPaid(); 
	
	
	
	
}
