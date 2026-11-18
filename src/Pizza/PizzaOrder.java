package Pizza;

public class PizzaOrder{
	double price;
	double subtotal;
	double tax;
	double total;
	
	PizzaOrder(double price){
		this.price = price;
		this.subtotal = subtotal;
	}
	
	void addTopping() {
		subtotal+=1.25;
	}
	void addDelivery() {
		subtotal+=4.00;
		
	}
	void calculateTotal() {
		tax = 0.0875*subtotal;
		total=subtotal + tax;
	}
}