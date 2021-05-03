package DataAccess.Base;

import java.util.List;
import java.util.function.Predicate;

public interface IEntityDal<T> {
	
	void add(T entity);
	void delete(T entity, Predicate<? super T> predicateFilter);
	void update(T entity, Predicate<? super T> predicateFilter);
	List<T> getAll();
	T getbyId(Predicate<? super T> predicateFilter);
}
