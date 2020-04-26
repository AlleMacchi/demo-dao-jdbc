package model.dao;

import db.DB;
import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {
	
	public static SellerDao createDao() {		
		SellerDaoJDBC obj = new SellerDaoJDBC(DB.getConnection());
		return obj;
	};

}
