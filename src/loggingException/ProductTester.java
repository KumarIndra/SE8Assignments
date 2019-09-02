package loggingException;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class ProductTester {
	public static Logger log = Logger.getLogger(ProductTester.class);
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BasicConfigurator.configure();
		Product tshirt = new Product(1,"T-shirt",3);
		log.info("Product Object is created");
		
		for(int i=1;i<=4;i++) {
			log.info("Ordering "+i+" t-shirt");
			if(tshirt.getStock()>0) {
			tshirt.orderProduct(tshirt);	
			stock(tshirt.getStock(),tshirt.getProductName());
			log.info(tshirt.getStock()+" Stock Remaining");
			}else if(tshirt.getStock()<0){
				stock(0,tshirt.getProductName());
				log.info(tshirt.getStock()+" Stock Remaining");
			}
		}
		
	}
	public static void stock(int stock,String pName) throws Exception {
		try{
				if(stock==1) {
					log.warn("Only 1 "+pName+" left");
				}else if(stock == 0) {
					throw new Exception();
				}
			}
		catch(Exception e) {
			log.info(pName+" Out of Stock");
		}
	}

}
