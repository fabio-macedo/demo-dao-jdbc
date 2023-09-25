package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
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
	}

}
