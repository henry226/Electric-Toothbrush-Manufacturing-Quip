package NewAssignment3;

public class Others implements Marketing{
	private int price;
	private double sale;
	private String launchDate;
	
	// Constructor
	public Others(int price, double sale, String launchDate) {
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
		System.out.printf("Other products\nPrice: $%d\nSale: no sale\nLaunch Date: %s\nFinal price: $%d\n", 
				getPrice(), getLaunchDate(), getPrice());
	}
}
