package NewAssignment3;

public class Accessories implements Marketing{
	private int price;
	private double sale;
	private String launchDate; 
	
	// Constructor
	public Accessories(int price, double sale, String launchDate) {
		this.price = price;
		this.sale = sale;
		this.launchDate = launchDate;
	}
	
	
	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public double getSale() {
		return sale;
	}


	public void setSale(double sale) {
		this.sale = sale;
	}


	public String getLaunchDate() {
		return launchDate;
	}


	public void setLaunchDate(String launchDate) {
		this.launchDate = launchDate;
	}

	@Override
	public void makeProduct() {
		System.out.printf("Product: Quip accessories\nPrice: $%d\nSale: %.0f precent off\nLaunch Date: %s\nFinal price: $%.2f\n", 
				getPrice(), (10-getSale())*10, getLaunchDate(), getPrice()*(getSale()/10));
	}
}
