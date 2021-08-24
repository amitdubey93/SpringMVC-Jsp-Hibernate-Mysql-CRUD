package springmvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springmvc.model.Product;
import springmvc.service.ProductService;

@Controller
@RequestMapping("/")
public class ProductController {

	@Autowired
	private ProductService productService;
	
	
	@RequestMapping(path="/product", method= RequestMethod.GET)
	public String product(){
		System.out.println("hello from product path");
		return "product";
	}
	@RequestMapping(path="/addproduct", method= RequestMethod.POST)
	public String addProduct(@ModelAttribute Product product, Model model){
		System.out.println(product);
		productService.createProduct(product);
		return "redirect:/productlist";
	}
	@RequestMapping(path="/productlist", method= RequestMethod.GET)
	public String getAllProducts(@ModelAttribute Product product, Model model){
		List<Product> list =productService.getAllProduct();
		for(Product p: list)
		System.out.println(p);
		model.addAttribute("allProducts", list);
		//System.out.println(product);
		
		return "productlist";
	}
	@RequestMapping(path="/deleteproduct/{id}", method= RequestMethod.GET)
	public String deleteProduct(@PathVariable int id){
		System.out.println("id: from delete :  "+id);
		productService.deleteProduct(id);
		return "redirect:/productlist";
	}
	
	@RequestMapping(path="/updateproduct/{id}", method= RequestMethod.GET)
	public String updataProduct(@PathVariable int id, Model model){
		System.out.println("id: from update:  "+id);
		Product product = productService.getProductById(id);
		System.out.println("from update product:"+product);
		productService.updateProduct(product);
		model.addAttribute("product", product);
		return "productupdate";
	}
	@RequestMapping(path="/updateproduct", method= RequestMethod.POST)
	public String saveUpdatedProduct(@ModelAttribute Product product,Model model){
		productService.updateProduct(product);
		return "redirect:/productlist";
	}
}
