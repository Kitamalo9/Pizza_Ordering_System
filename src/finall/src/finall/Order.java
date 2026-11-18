package finall;

public class Order {
    public static final double DELIVERY_FEE = 4.00;
    public static final double TAX_RATE = 0.0875;

    private final Customer customer;
    private final Pizza pizza;
    private final boolean delivery;

    public Order(Customer customer, Pizza pizza, boolean delivery) {
        this.customer = customer;
        this.pizza = pizza;
        this.delivery = delivery;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Pizza getPizza() {
        return pizza;
    }

    public boolean isDelivery() {
        return delivery;
    }

    public double getSubtotal() {
        double subtotal = pizza.getBasePrice() + pizza.getToppingCost();

        if (delivery) {
            subtotal += DELIVERY_FEE;
        }

        return subtotal;
    }

    public double getTax() {
        return getSubtotal() * TAX_RATE;
    }

    public double getTotal() {
        return getSubtotal() + getTax();
    }
}
