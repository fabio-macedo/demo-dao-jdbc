package model.dao;

import model.dao.Impl.SellerDaoJDBC;

//FÁBRICA DE 'DAOs'
//terá operações estáticas para instanciar os DAOs

public class DaoFactory {

/*a classe vai expor um método que retorna o tipo da interface mas internamente
mas internamente vai instanciar uma implementação, macete para não precisar expor a implementação, deixar somente a interface	
*/
	
	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC();
	}
}
