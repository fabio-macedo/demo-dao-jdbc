package model.dao;

import db.DB;
import model.dao.Impl.SellerDaoJDBC;

//F�BRICA DE 'DAOs'
//ter� opera��es est�ticas para instanciar os DAOs

public class DaoFactory {

/*a classe vai expor um m�todo que retorna o tipo da interface mas internamente
mas internamente vai instanciar uma implementa��o, macete para n�o precisar expor a implementa��o, deixar somente a interface	
*/
	
	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC(DB.getConnection());
	}
}
