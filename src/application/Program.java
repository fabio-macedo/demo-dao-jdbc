package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
/*está chamando a fábrica, o programa não conhece a implementação conhece somente a interface
uma forma também de criar uma injeção de dependência, sem explicitar a implementação
*/
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("==== TEST 1: seller findById =====");
		
		Seller seller = sellerDao.findById(3);
		
		System.out.println(seller);
	}

}
