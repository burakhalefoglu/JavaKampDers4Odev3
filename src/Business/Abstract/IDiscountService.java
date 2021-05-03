package Business.Abstract;

import java.util.List;

import Enitity.Discount;


public interface IDiscountService {
	
	void addProduct(Discount discount);
	void deleteProduct(Discount discount);
	void updateProduct(Discount discount);
	Discount getProduct(int id);
	List<Discount> getAll();

}