package hw.skypro.springshop.service;

import java.util.List;

public interface ShoppingCartService {
    void addProducts(List<Integer> ID);

    List<Integer> getProducts();
}
