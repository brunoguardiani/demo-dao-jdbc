package application;
import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Department obj = new Department (1, "Books");
		System.out.println(obj);
		Seller seller = new Seller (21, "Pierre", "pierre@gmail.com", new Date(), 3000.0, obj); TESTANDO AS CLASSES*/
		SellerDao sellerDao = DaoFactory.createSellerDao();
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
	}

}
