package Business.Abstract;

import java.util.List;

import Enitity.User;

public interface IUserService {

	void addUser(User user);
	void deleteUser(User user);
	void updateUser(User user);
	User getUser(int id);
	List<User> getAll();
	
	
}
