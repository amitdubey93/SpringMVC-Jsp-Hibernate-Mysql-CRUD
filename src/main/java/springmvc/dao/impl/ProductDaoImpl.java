package springmvc.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import springmvc.dao.ProductDao;
import springmvc.model.Product;

@Repository
public class ProductDaoImpl implements ProductDao{

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public void createProduct(Product product) {
		hibernateTemplate.save(product);
	}
	@Transactional
	public void updateProduct(Product product) {
		hibernateTemplate.update(product);
	}

	@Transactional
	public void deleteProduct(int pid) {
		Product product = getProductById(pid);
		hibernateTemplate.delete(product);
	}

	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		List<Product> list = hibernateTemplate.loadAll(Product.class);
		return list;
	}

	public Product getProductById(int pid) {
		Product product = hibernateTemplate.load(Product.class, pid);
		return product;
	}
		
}
