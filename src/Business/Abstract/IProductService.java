package Business.Abstract;

import java.util.List;

import Enitity.Product;

public interface IProductService {
	
	void addProduct(Product product);
	void deleteProduct(Product product);
	void updateProduct(Product product);
	Product getProduct(int id);
	List<Product> getAll();

}