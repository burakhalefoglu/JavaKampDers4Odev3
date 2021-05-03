package DataAccess.Base;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

import Enitity.User;

public class InMemoryBaseDal<T> implements IEntityDal<T>{

	
List<T> entityList;
	
	
	
	public InMemoryBaseDal() {
		this.entityList =  new ArrayList<T>();
	}
	

	@Override
	public void add(T entity) {

		entityList.add(entity);
		System.out.printf("kullanýcý eklendi");
		
	}

	@Override
	public void delete(T entity, Predicate<? super T> predicateFilter) {

		if(entityList.contains(entity)) {
			
			T curentEntity = (T) entityList.stream().filter(predicateFilter);
			entityList.remove(curentEntity);
			System.out.printf("kullanýcý silindi!");

		}
		System.out.printf("kullanýcý kullanýcýsý bulunamadý!");
				
	}

	
	@Override
	public void update(T entity, Predicate<? super T> predicateFilter) {
		
		T curentEntity = (T) entityList.stream().filter(predicateFilter);
		int index = entityList.indexOf(curentEntity);
		entityList.set(index, entity);
	}
	

	@Override
	public T getbyId(Predicate<? super T> predicateFilter) {
		
		T curentEntity = (T) entityList.stream().filter(predicateFilter);
		return curentEntity;

	}

	@Override
	public List<T> getAll() {
		return entityList;
	}
}
