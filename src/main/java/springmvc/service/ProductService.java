package springmvc.service;

import java.util.List;

import springmvc.model.Product;

public interface ProductService {
	void createProduct(Product product);
	void updateProduct(Product product);
	void deleteProduct(int pid);
	List<Product> getAllProduct();
	Product getProductById(int id);
	
}
