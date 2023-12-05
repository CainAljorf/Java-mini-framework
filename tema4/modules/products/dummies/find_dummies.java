package tema4.modules.products.dummies;

import tema4.modules.products.classes.product;
import tema4.modules.products.classes.singleton;

public class find_dummies {
	public static int find_product_dummies(product P){
		for (int i = 0; i<=(singleton.productlaptop.size()-1); i++){
			if((singleton.productlaptop.get(i)).equals(P))
				return i;
		}
		for (int j = 0; j<=(singleton.productsmartphone.size()-1); j++){
			if((singleton.productsmartphone.get(j)).equals(P))
				return j;
		}
		for (int k = 0; k<=(singleton.productaccessory.size()-1); k++){
			if((singleton.productaccessory.get(k)).equals(P))
				return k;
		}
		return -1;
	}
	public static String find_product_type(product P){
		for (int i = 0; i<=(singleton.productlaptop.size()-1); i++){
			if((singleton.productlaptop.get(i)).equals(P))
				return "Laptop";
		}
		for (int j = 0; j<=(singleton.productsmartphone.size()-1); j++){
			if((singleton.productsmartphone.get(j)).equals(P))
				return "Smartphone";
		}
		for (int k = 0; k<=(singleton.productaccessory.size()-1); k++){
			if((singleton.productaccessory.get(k)).equals(P))
				return "Accessory";
		}
		return "null";
	}
}
