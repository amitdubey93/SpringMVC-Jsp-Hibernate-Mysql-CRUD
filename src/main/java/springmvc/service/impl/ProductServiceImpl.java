package springmvc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Service;

import springmvc.dao.ProductDao;
import springmvc.model.Product;
import springmvc.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductDao productDao;

	public void createProduct(Product product) {
		// TODO Auto-generated method stub
		productDao.createProduct(product);
	}

	public void updateProduct(Product product) {
		// TODO Auto-generated method stub
		productDao.updateProduct(product);
	}

	public void deleteProduct(int pid) {
		// TODO Auto-generated method stub
		productDao.deleteProduct(pid);
		
	}

	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		return productDao.getAllProduct();
	}

	public Product getProductById(int id) {
		return productDao.getProductById(id);
	}


	

}
