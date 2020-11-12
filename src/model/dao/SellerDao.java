package model.dao;

import java.util.List;

import model.entities.Seller;
import model.entities.*;
public interface SellerDao {
	void insert(Seller obj);
	void update(Seller obj);
	void deleteById(Integer id);
	Seller findById(Integer id);
	List<Seller> findByDepartment(Department dep);
	List<Seller> findAll();
}
