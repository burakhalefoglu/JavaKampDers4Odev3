package Business.Concrete;

import java.util.List;

import Business.Abstract.IDiscountService;
import DataAccess.Abstract.IDiscountDal;
import Enitity.Discount;

public class DiscountManager implements IDiscountService{

	IDiscountDal _discountDal;
	
	public DiscountManager(IDiscountDal _discountDal) {

		this._discountDal = _discountDal;
	}

	@Override
	public void addProduct(Discount discount) {

		_discountDal.add(discount);
		
	}

	@Override
	public void deleteProduct(Discount discount) {

		_discountDal.delete(discount, (u->u.id==discount.id));
		
	}

	@Override
	public void updateProduct(Discount discount) {

		_discountDal.update(discount, (u->u.id==discount.id));
		
	}

	@Override
	public Discount getProduct(int id) {
		
		return _discountDal.getbyId((u->u.id==id));

	}

	@Override
	public List<Discount> getAll() {
		
		return _discountDal.getAll();

	}

}
