package tema4.modules.products.dummies.CRUD_dummies;

import javax.swing.JOptionPane;

import tema4.modules.products.classes.singleton;
import tema4.modules.products.utils.CRUD;
import tema4.modules.products.utils.find;

public class update_dummies {
	public static void laptop () {
		int location1 = -1;
		if(singleton.productlaptop.isEmpty()){
			JOptionPane.showMessageDialog(null, "No se ha podido acceder al array de laptop porque está vacía.","Error",JOptionPane.ERROR_MESSAGE);
		}else{
			location1 = -1;
			location1 = find.find_product(singleton.L);
			if (location1 != -1) {
				singleton.L = singleton.productlaptop.get(location1);
				CRUD.update();
				singleton.productlaptop.set(location1, singleton.L);
			}else {
				JOptionPane.showMessageDialog(null, "No se ha encontrado el laptop.","Error",JOptionPane.ERROR_MESSAGE);
			}
		}
	}
	public static void smartphone () {
		int location1 = -1;
		if(singleton.productsmartphone.isEmpty()){
			JOptionPane.showMessageDialog(null, "No se ha podido acceder al array de smartphone porque está vacía.","Error",JOptionPane.ERROR_MESSAGE);		}else{
			location1 = -1;
			location1 = find.find_product(singleton.S);
			if (location1 != -1) {
				singleton.S = singleton.productsmartphone.get(location1);
				CRUD.update();
				singleton.productsmartphone.set(location1, singleton.S);
			}else {
				JOptionPane.showMessageDialog(null, "No se ha encontrado el smartphone.","Error",JOptionPane.ERROR_MESSAGE);
			}
		}
	}
	public static void accessory () {
		int location1 = -1;
		if(singleton.productaccessory.isEmpty()){
			JOptionPane.showMessageDialog(null, "No se ha podido acceder al array de accesorio porque está vacía.","Error",JOptionPane.ERROR_MESSAGE);		}else{
			location1 = find.find_product(singleton.A);
			if (location1 != -1) {
				singleton.A = singleton.productaccessory.get(location1);
				CRUD.update();
				singleton.productaccessory.set(location1, singleton.A);
			}else {
				JOptionPane.showMessageDialog(null, "No se ha encontrado el accesorio.","Error",JOptionPane.ERROR_MESSAGE);	
			}
		}
	}
}
