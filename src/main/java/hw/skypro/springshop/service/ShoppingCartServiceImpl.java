package hw.skypro.springshop.service;

import hw.skypro.springshop.model.ShoppingCart;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShoppingCartServiceImpl implements ShoppingCartService {
    private final ShoppingCart shoppingCart;

    public ShoppingCartServiceImpl(ShoppingCart shoppingCart) {
            this.shoppingCart = shoppingCart;
    }

    @Override
    public void addProducts(List<Integer> productID) {
            this.shoppingCart.addProducts(productID);
    }

    @Override
    public List<Integer> getProducts() {
        return this.shoppingCart.getProducts();
    }

}
