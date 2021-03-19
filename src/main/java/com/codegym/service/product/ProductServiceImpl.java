//package com.codegym.service.product;
//
//import com.codegym.model.Product;
//import com.codegym.service.product.ProductService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class ProductServiceImpl implements ProductService {
//
//    @Autowired
//    private ProductService productRepository;
//
//    @Override
//    public List<Product> findAll() {
//        return null;
//    }
//
//    @Override
//    public Product findByCode(String productCode) {
//        return null;
//    }
//
//    @Override
//    public Product save(Product product) {
//        return productRepository.save(product);
//    }
//
//    @Override
//    public void remove(Product productCode) {
//
//    }
//
//    @Override
//    public Optional<Product> findById(Long id) {
//        return Optional.empty();
//    }
//
//    @Override
//    public void remove(Long id) {
//        productRepository.remove(id);
//    }
//}
