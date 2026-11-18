package finall;

public class Receipt {

    public static String create(Order order) {
        Customer customer = order.getCustomer();
        Pizza pizza = order.getPizza();

        StringBuilder receipt = new StringBuilder();

        receipt.append("--------------YOUR RECEIPT-------------\n");
        receipt.append("Welcome to Angela's Pizza!!\n");
        receipt.append("208 E 14th St\n");
        receipt.append("New York, NY 10003\n\n");

        receipt.append(customer.getFirstName())
                .append(" ")
                .append(customer.getLastName())
                .append(" your order is as follows:\n\n");

        receipt.append("Customer Information\n");
        receipt.append("Phone Number: ").append(customer.getPhone()).append("\n");

        if (order.isDelivery()) {
            receipt.append("Email: ").append(customer.getEmail()).append("\n");
            receipt.append("Delivery Option: Delivery ($4.00 flat fee)\n");
            receipt.append("Delivery Address: ")
                    .append(customer.getStreet()).append(", ")
                    .append(customer.getCity()).append(", ")
                    .append(customer.getState()).append(", ")
                    .append(customer.getZipCode()).append("\n");
        } else {
            receipt.append("Delivery Option: Pick Up\n");
        }

        receipt.append("\nPizza Order Information\n");
        receipt.append("Pizza Size: ").append(pizza.getSize()).append("\n");
        receipt.append("Crust Choice: ").append(pizza.getCrust()).append("\n");
        receipt.append("Toppings: ");

        if (pizza.getToppings().isEmpty()) {
            receipt.append("None");
        } else {
            receipt.append(String.join(", ", pizza.getToppings()));
        }

        receipt.append("\n");
        receipt.append(String.format("Subtotal: $%.2f\n", order.getSubtotal()));
        receipt.append(String.format("Tax(8.75%%): $%.2f\n", order.getTax()));

        if (order.isDelivery()) {
            receipt.append(String.format("Delivery cost: $%.2f\n", Order.DELIVERY_FEE));
        }

        receipt.append(String.format("Total: $%.2f\n\n", order.getTotal()));
        receipt.append("Thank you for choosing Angela's Pizzeria!\n");
        receipt.append("Your pizza will be ready in approximately 20 minutes.");

        return receipt.toString();
    }
}
