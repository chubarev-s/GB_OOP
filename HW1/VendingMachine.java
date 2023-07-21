package HW1;

import java.util.List;

public interface VendingMachine {
    Product getProduct(String name) throws IllegalStateException;
    boolean addProduct(List<Product> products);
}
