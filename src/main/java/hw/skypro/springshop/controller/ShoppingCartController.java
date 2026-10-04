package hw.skypro.springshop.controller;

import hw.skypro.springshop.service.ShoppingCartServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/store/order")
public class ShoppingCartController {

    private final ShoppingCartServiceImpl shoppingCartServiceImpl;

    @Autowired
    public ShoppingCartController(final ShoppingCartServiceImpl shoppingCartServiceImpl) {
        this.shoppingCartServiceImpl = shoppingCartServiceImpl;
    }

    @PostMapping(path = "/add")
    @ResponseStatus(HttpStatus.CREATED)
    public String addProducts(@RequestParam(value="products") List<Integer> products) {
        this.shoppingCartServiceImpl.addProducts(products);
        return "Вы успешно добавили предметы!";
    }

    @GetMapping(path = "/get")
    public List<Integer> getProducts() {
        return shoppingCartServiceImpl.getProducts();
    }

}
