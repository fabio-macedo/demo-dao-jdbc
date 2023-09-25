package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
/*est� chamando a f�brica, o programa n�o conhece a implementa��o conhece somente a interface
uma forma tamb�m de criar uma inje��o de depend�ncia, sem explicitar a implementa��o
*/
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("==== TEST 1: seller findById =====");
		
		Seller seller = sellerDao.findById(3);
		
		System.out.println(seller);
		
		System.out.println("\n==== TEST 2: seller findByDepartment =====");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		
		for(Seller obj : list) {
			System.out.println(obj);
		}
	
		
		System.out.println("\n==== TEST 3: seller findByAll =====");
		list = sellerDao.findAll();
		
		for(Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n==== TEST 4: seller insert =====");
//est� aproveitando  o 'department' que foi instanciado anteriormente		
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com",new Date(), 4000.0, department);
		sellerDao.insert(newSeller);
		System.out.println("Inserted new id = " + newSeller.getId());
	}

}
