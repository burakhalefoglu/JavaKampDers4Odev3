package Business.Concrete;

import java.util.List;

import Business.Abstract.IUserService;
import DataAccess.Abstract.IUserDal;
import Enitity.User;

public class UserManager implements IUserService {

	IUserDal _userDal;
	
	public UserManager(IUserDal _userDal) {
		
		this._userDal = _userDal;
	}

	@Override
	public void addUser(User user) {
		
		_userDal.add(user);
	}

	@Override
	public void deleteUser(User user) {

		_userDal.delete(user, (u->u.id==user.id));
	}

	@Override
	public void updateUser(User user) {
		
		_userDal.update(user, (u->u.id==user.id));
	}

	@Override
	public User getUser(int id) {
		
		return _userDal.getbyId((u->u.id==id));
	}

	@Override
	public List<User> getAll() {
		
		return _userDal.getAll();
	}

}
