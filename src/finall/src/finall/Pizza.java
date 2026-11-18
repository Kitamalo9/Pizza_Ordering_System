package finall;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String size;
    private String crust;
    private final List<String> toppings = new ArrayList<>();

    public Pizza(String size, String crust) {
        this.size = size;
        this.crust = crust;
    }

    public String getSize() {
        return size;
    }

    public String getCrust() {
        return crust;
    }

    public List<String> getToppings() {
        return toppings;
    }

    public void addTopping(String topping) {
        toppings.add(topping);
    }

    public double getBasePrice() {
        int dollarIndex = size.indexOf("$");
        if (dollarIndex < 0) {
            return 0.0;
        }
        return Double.parseDouble(size.substring(dollarIndex + 1));
    }

    public double getToppingCost() {
        return toppings.size() * 1.25;
    }
}
