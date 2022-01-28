package com.example.StoreProductManagementSystem.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
 
import com.example.StoreProductManagementSystem.model.Product;
import org.springframework.stereotype.Repository;
 
@Repository
public class ProductDAO {
 
    private static final Map<String, Product> proMap = new HashMap<String, Product>();
 
    static {
        initpros();
    }
 
    private static void initpros() {
        Product pro1 = new Product("P01", "Rice", 2.00, 10);
        Product pro2 = new Product("P02", "Sugar", 1.00, 20);
        Product pro3 = new Product("P03", "Salt", 0.50, 15);
 
        proMap.put(pro1.getProNo(), pro1);
        proMap.put(pro2.getProNo(), pro2);
        proMap.put(pro3.getProNo(), pro3);
    }
 
    public Product getProduct(String proNo) {
        return proMap.get(proNo);
    }
 
    public Product addProduct(Product pro) {
        proMap.put(pro.getProNo(), pro);
        return pro;
    }
 
    public Product updateProduct(Product pro) {
        proMap.put(pro.getProNo(), pro);
        return pro;
    }
 
    public void deleteProduct(String proNo) {
        proMap.remove(proNo);
    }
 
    public List<Product> getAllProducts() {
        Collection<Product> c = proMap.values();
        List<Product> list = new ArrayList<Product>();
        list.addAll(c);
        return list;
    }
 
}
