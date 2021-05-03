package Business.Concrete;

import java.util.List;

import Business.Abstract.IProductService;
import DataAccess.Abstract.IProductDal;
import Enitity.Product;

public class ProductManager implements IProductService{

	IProductDal _productDal;

	
	public ProductManager(IProductDal _productDal) {
		
		this._productDal = _productDal;
	}

	@Override
	public void addProduct(Product product) {
		
		_productDal.add(product);

	}

	@Override
	public void deleteProduct(Product product) {

		_productDal.delete(product, (u->u.id==product.id));
		
	}

	@Override
	public void updateProduct(Product product) {
		
		_productDal.update(product, (u->u.id==product.id));
		
	}

	@Override
	public Product getProduct(int id) {
		
		return _productDal.getbyId((u->u.id==id));

	}


	@Override
	public List<Product> getAll() {
		
		return _productDal.getAll();

	}

}
