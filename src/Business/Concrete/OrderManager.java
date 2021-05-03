package Business.Concrete;

import java.util.List;

import Business.Abstract.IOrderService;
import DataAccess.Abstract.IOrderDal;
import Enitity.Order;

public class OrderManager implements IOrderService {

	IOrderDal _orderDal;
	
	public OrderManager(IOrderDal _orderDal) {
		super();
		this._orderDal = _orderDal;
	}

	@Override
	public void addProduct(Order order) {

		_orderDal.add(order);
		
	}

	@Override
	public void deleteProduct(Order order) {

		_orderDal.delete(order, (u->u.id==order.id));
		
	}

	@Override
	public void updateProduct(Order order) {

		_orderDal.update(order, (u->u.id==order.id));
		
	}

	@Override
	public Order getProduct(int id) {
		
		return _orderDal.getbyId((u->u.id==id));

	}

	@Override
	public List<Order> getAll() {
		
		return _orderDal.getAll();

	}


}
