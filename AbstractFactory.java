package NewAssignment3;

public abstract class AbstractFactory {
	abstract HumanResource getInfo(String Type);
	abstract Marketing getProduct(String Type);
	abstract Marketing changeProduct(String Type, int price);
}
