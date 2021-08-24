package springmvc.dao;

import java.util.List;

import springmvc.model.Product;

public interface ProductDao {
	public void createProduct(Product product);
	public void updateProduct(Product product);
	public void deleteProduct(int pid);
	public List<Product> getAllProduct();
	public Product getProductById(int pid);
	
}
