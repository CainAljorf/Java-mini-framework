package tema4.modules.products.dummies;

import tema4.modules.products.classes.product;
import tema4.modules.products.classes.singleton;

public class find_dummies {
	public static int find_product_dummies(product P){
		for (int i = 0; i<=(singleton.dummieslaptop.size()-1); i++){
			if((singleton.dummieslaptop.get(i)).equals(P))
				return i;
		}
		for (int j = 0; j<=(singleton.dummiessmartphone.size()-1); j++){
			if((singleton.dummiessmartphone.get(j)).equals(P))
				return j;
		}
		for (int k = 0; k<=(singleton.dummiesaccessory.size()-1); k++){
			if((singleton.dummiesaccessory.get(k)).equals(P))
				return k;
		}
		return -1;
	}
}