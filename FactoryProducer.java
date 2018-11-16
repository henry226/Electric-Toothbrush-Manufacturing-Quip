package NewAssignment3;

public class FactoryProducer {
	public static AbstractFactory getFactory(String choice) {
		if(choice.equalsIgnoreCase("HUMANRESOURCE")){
	         return new HumanResourceFactory();
	         
	      }else if(choice.equalsIgnoreCase("MARKETING")){
	         return new MarketingFactory();
	      }
	      
	      return null;
	}
}
