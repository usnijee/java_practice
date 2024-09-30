package pack.helloshop.order;

import pack.helloshop.product.Product;
import pack.helloshop.user.User;

public class Order {

    User user;
    Product product;

    public Order(User user, Product product){
        this.user = user;
        this.product = product;
    }
}
