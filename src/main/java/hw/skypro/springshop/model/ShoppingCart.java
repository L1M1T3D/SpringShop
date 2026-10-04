package hw.skypro.springshop.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@Component
@SessionScope
public class ShoppingCart {

    private final List<Integer> products;

    public ShoppingCart() {
        this.products = new ArrayList<>();
    }

    public void addProducts(List<Integer> productID) {
        this.products.addAll(productID);
    }

    public List<Integer> getProducts() {
        return List.copyOf(products);
    }
}
