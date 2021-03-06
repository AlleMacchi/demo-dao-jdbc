package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
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
		
		System.out.println();
		
		System.out.println("=== TEST 4: insert ===");
		Seller sellerInsert = new Seller(null,"prossimo","p@gmail.com",new Date(),5100.0,department); 
		sellerDao.insert(sellerInsert);
		System.out.println(sellerInsert);
		
		System.out.println();
		
		System.out.println("=== TEST 5: update ===");
		seller = sellerDao.findById(3);
		System.out.println(seller);
		seller.setName("Alessandro");
		sellerDao.update(seller);
		seller = sellerDao.findById(3);
		System.out.println(seller);
		System.out.println("Update Complete");
		
		System.out.println();
		
		System.out.println("=== TEST 6: delete ===");
		System.out.print("Enter number id to delete: ");
		int idToDelete = sc.nextInt();
		sellerDao.deleteById(idToDelete);
		sc.close();
		System.out.println();
	}
}
