package Business.Abstract;

import java.util.List;

import Enitity.Order;

public interface IOrderService {

	void addProduct(Order order);
	void deleteProduct(Order order);
	void updateProduct(Order order);
	Order getProduct(int id);
	List<Order> getAll();
}
