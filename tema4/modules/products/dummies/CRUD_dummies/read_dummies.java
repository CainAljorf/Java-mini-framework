package tema4.modules.products.dummies.CRUD_dummies;

import javax.swing.JOptionPane;

import tema4.modules.products.classes.singleton;
import tema4.modules.products.dummies.dummies_CRUD;
import tema4.modules.products.dummies.find_dummies;
import tema4.modules.products.utils.CRUD;

public class read_dummies {
	public static void laptop (){
		int opt = 0, location = -1;
		boolean validator = true;
		String str= "";
		String[]buttons={
				"Read All",
				"Read One",
				"Atrás"
				};
		if(singleton.dummieslaptop.isEmpty()){
			JOptionPane.showMessageDialog(null,"No hay datos, por favor crea un laptop.", "Error", JOptionPane.ERROR_MESSAGE);
		}else{
			do {
				opt=JOptionPane.showOptionDialog(
						null,
						"Elige la opción que quieras usar.",
						"READ",
						0,
						JOptionPane.QUESTION_MESSAGE,
						null,
						buttons,
						buttons[0]);
				switch (opt){
					case 0:
						for (int i = 0; i <singleton.dummieslaptop.size();i++){
							str = singleton.dummieslaptop.get(i).toString();
							JOptionPane.showMessageDialog(null, str,"Información",JOptionPane.INFORMATION_MESSAGE);
						}
						break;
					case 1:
						location = -1;
						singleton.DL = CRUD.new_laptop("Ingresa el ID de tu accesorio para leerlo."
								+ "\nRecuerda que debe usar la siguiente nomenclatura: ABC-123","Ingresar ID");
						location = find_dummies.find_product_dummies(singleton.DL);
						System.out.println(location);
						if (location != -1) {
							singleton.DL = singleton.dummieslaptop.get(location);
							dummies_CRUD.read_one();
						}else {
							JOptionPane.showMessageDialog(null, "El laptop que quieres leer no se ha encontrado.", "Error", JOptionPane.ERROR_MESSAGE);
						}
						break;
					case 2:
						validator=false;
						JOptionPane.showMessageDialog(null, "Volviendo al menú principal.","Información",JOptionPane.INFORMATION_MESSAGE);
						break;
					default:
						validator=false;
						JOptionPane.showMessageDialog(null, "Cerrando el programa.","Cerrar",JOptionPane.ERROR_MESSAGE);
						System.exit(0);
						break;
				}
			}while(validator==true);
		}
	}
	
	public static void smartphone (){
		int opt = 0, location = -1;
		boolean validator = true;
		String str= "";
		String[]buttons={
				"Read All",
				"Read One",
				"Atrás"
				};
		if(singleton.dummiessmartphone.isEmpty()){
			JOptionPane.showMessageDialog(null,"No hay datos, por favor crea un smartphone.", "Error", JOptionPane.ERROR_MESSAGE);
		}else{
			do {
				opt=JOptionPane.showOptionDialog(
						null,
						"Elige la opción que quieras usar.",
						"READ",
						0,
						JOptionPane.QUESTION_MESSAGE,
						null,
						buttons,
						buttons[0]);
				switch (opt){
					case 0:
						for (int i = 0; i <singleton.dummiessmartphone.size();i++){
							str = singleton.dummiessmartphone.get(i).toString();
							JOptionPane.showMessageDialog(null, str,"Información",JOptionPane.INFORMATION_MESSAGE);
						}
						break;
					case 1:
						location = -1;
						singleton.DS = CRUD.new_smartphone("Ingresa el ID de tu accesorio para leerlo."
								+ "\nRecuerda que debe usar la siguiente nomenclatura: ABC-123","Ingresar ID");
						location = find_dummies.find_product_dummies(singleton.DS);
						if (location != -1) {
							singleton.DS = singleton.dummiessmartphone.get(location);
							dummies_CRUD.read_one();
						}else {
							JOptionPane.showMessageDialog(null, "El smartphone que quieres leer no se ha encontrado.", "Error", JOptionPane.ERROR_MESSAGE);
						}
						break;
					case 2:
						validator=false;
						JOptionPane.showMessageDialog(null, "Volviendo al menú principal.","Información",JOptionPane.INFORMATION_MESSAGE);
						break;
					default:
						validator=false;
						JOptionPane.showMessageDialog(null, "Cerrando el programa.","Cerrar",JOptionPane.ERROR_MESSAGE);
						System.exit(0);
						break;
				}
			}while(validator==true);
		}
	}
	
	public static void accessory (){
		int opt = 0, location = -1;
		boolean validator = true;
		String str= "";
		String[]buttons={
				"Read All",
				"Read One",
				"Atrás"
				};
		if(singleton.dummiesaccessory.isEmpty()){
			JOptionPane.showMessageDialog(null,"No hay datos, por favor crea un accesorio.", "Error", JOptionPane.ERROR_MESSAGE);
		}else{
			do {
				opt=JOptionPane.showOptionDialog(
						null,
						"Elige la opción que quieras usar.",
						"READ",
						0,
						JOptionPane.QUESTION_MESSAGE,
						null,
						buttons,
						buttons[0]);
				switch (opt){
					case 0:
						for (int i = 0; i <singleton.dummiesaccessory.size();i++){
							str = singleton.dummiesaccessory.get(i).toString();
							JOptionPane.showMessageDialog(null, str,"Información",JOptionPane.INFORMATION_MESSAGE);
						}
						break;
					case 1:
						location = -1;
						singleton.DA = CRUD.new_accessory("Ingresa el ID de tu accesorio para leerlo."
								+ "\nRecuerda que debe usar la siguiente nomenclatura: ABC-123","Ingresar ID");
						location = find_dummies.find_product_dummies(singleton.DA);
						if (location != -1) {
							singleton.DA = singleton.productaccessory.get(location);
							dummies_CRUD.read_one();
						}else {
							JOptionPane.showMessageDialog(null, "El accesorio que quieres leer no se ha encontrado.", "Error", JOptionPane.ERROR_MESSAGE);
						}
						break;
					case 2:
						validator=false;
						JOptionPane.showMessageDialog(null, "Volviendo al menú principal.","Información",JOptionPane.INFORMATION_MESSAGE);
						break;
					default:
						validator=false;
						JOptionPane.showMessageDialog(null, "Cerrando el programa.","Cerrar",JOptionPane.ERROR_MESSAGE);
						System.exit(0);
						break;
				}
			}while(validator==true);
		}
	}
}