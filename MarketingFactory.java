package NewAssignment3;

public class MarketingFactory extends AbstractFactory{
	@Override
	HumanResource getInfo(String Type) {
		// TODO Auto-generated method stub
		return null;
	}
	
	// use getInfo method to get object of type HumnanResource
	@Override
	Marketing getProduct(String Type) {
		
		// return objects depends on type
		if(Type.equalsIgnoreCase("TOOTHBRUSH")) {
			return new ToothBrush(300, 9, "December 1, 2018");
		}
	
		if(Type.equalsIgnoreCase("ACCESSORIES")) {
			return new Accessories(100, 8, "Novermber 1, 2018");
		}
		
		if(Type.equalsIgnoreCase("OTHERS")) {
			return new Others(10, 0, "Today");
		}
		
		return null;
	}
	
	@Override
	Marketing changeProduct(String Type, int price) {
		
		// return objects depends on type
		if(Type.equalsIgnoreCase("TOOTHBRUSH")) {
			return new ToothBrush(price, 9, "December 1, 2018");
		}
	
		if(Type.equalsIgnoreCase("ACCESSORIES")) {
			return new Accessories(price, 8, "Novermber 1, 2018");
		}
		
		if(Type.equalsIgnoreCase("OTHERS")) {
			return new Others(price, 0, "Today");
		}
		
		return null;
	}

}
