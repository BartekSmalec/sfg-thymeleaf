package com.bartek.sfgthymeleaf.service;

import com.bartek.sfgthymeleaf.domain.Product;
import java.util.List;

public interface ProductService {
    Product getProduct(Integer id);
    List<Product> listProducts();
}
