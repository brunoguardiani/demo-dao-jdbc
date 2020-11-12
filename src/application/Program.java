package application;
import java.util.Date;
import java.util.Scanner;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;
public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*Department obj = new Department (1, "Books");
		System.out.println(obj);
		Seller seller = new Seller (21, "Pierre", "pierre@gmail.com", new Date(), 3000.0, obj); TESTANDO AS CLASSES*/
		SellerDao sellerDao = DaoFactory.createSellerDao();
		System.out.println("=== TEST 1: seller findById ===");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		System.out.println("\n=== TEST 2: seller findByDepartment ===");
		Department dep = new Department(2, null);
		List<Seller>list = sellerDao.findByDepartment(dep);
		for (Seller obj : list) {
			System.out.println(obj);
		}
		System.out.println("\n=== TEST 3: seller findAll ===");
		list = sellerDao.findAll();
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== TEST 4: seller Insert ===");
		Seller newSeller = new Seller(null, "Yuri", "yuri.mello@ufba.br", new Date(), 4000.0, dep);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! New id = " + newSeller.getId());
		
		System.out.println("\n=== TEST 5: seller Update ===");
		seller = sellerDao.findById(1);
		seller.setName("Bob Brown");
		sellerDao.update(seller);
		System.out.println("Seller updated!");
		
		System.out.println("\n=== TEST 6: seller Delete ===");
		System.out.println("Enter id for delete teste: ");
		int id = sc.nextInt();
		sellerDao.deleteById(id);
		System.out.println("Seller deleted!");
		sc.close();
	}

}
