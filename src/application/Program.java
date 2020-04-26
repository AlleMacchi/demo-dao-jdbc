package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createDao();
		
		System.out.println("=== TEST 1: find By id ===");
		Seller seller = sellerDao.findById(3);	
		System.out.println(seller);
		
		System.out.println();
		
		System.out.println("=== TEST 2: find By Department ===");
		Department department = new Department(2,null);
		List<Seller> list = sellerDao.findByDepartment(department);
		
		for(Seller l:list) {
			System.out.println(l);
		}
		
		System.out.println();
		
		System.out.println("=== TEST 3: find All ===");
		List<Seller> listAll = sellerDao.findAll();
		
		for(Seller l:listAll) {
			System.out.println(l);
		}
		
	}
}
