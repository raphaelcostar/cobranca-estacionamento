package model.entities;

public class Invoice {
	
	private Double basicPayment;
	private Double tax;
	
	public Invoice(double basicPayment, double tax) {
		this.basicPayment = basicPayment;
		this.tax = tax;
	}

	public Double getBasicPayment() {
		return basicPayment;
	}

	public void setBasicPayment(double basicPayment) {
		this.basicPayment = basicPayment;
	}

	public Double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}
	
	public Double getTotalPayment() {
		return getBasicPayment() + getTax();
	}
	
}
