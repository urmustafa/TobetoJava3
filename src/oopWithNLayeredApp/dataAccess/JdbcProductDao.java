package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class JdbcProductDao implements ProductDao {

	public void add(Product product) {
		//sadece db erişim kodu yazılır
		System.out.println("JDBCile veri tabına eklendi");
	}
	
}


