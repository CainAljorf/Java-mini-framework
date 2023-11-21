package tema4.modules.products.utils.CRUD_functions;

import javax.swing.JOptionPane;

import tema4.modules.products.classes.singleton;
import tema4.modules.products.utils.CRUD;
import tema4.modules.products.utils.find;
import tema4.utils.menu;

public class read {
	public static void read_laptop (){
		int opt = 0, location = -1;
		boolean validator = true;
		String str= "";
		String[]buttons={
				"Read One",
				"Read All",
				"Atrás"
				};
		if(singleton.productlaptop.isEmpty()){
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
						for (int i = 0; i <singleton.productlaptop.size();i++){
							str = singleton.productlaptop.get(i).toString();
							JOptionPane.showMessageDialog(null, str,"Información",JOptionPane.INFORMATION_MESSAGE);
						}
						break;
					case 1:
						location = -1;
						menu.L = CRUD.new_laptop("Ingresa el ID de tu laptop para leerlo."
								+ "\nRecuerda que debe usar la siguiente nomenclatura: ABC-123","Ingresar ID");
						location = find.find_laptop(menu.L);
						if (location != -1) {
							menu.L = singleton.productlaptop.get(location);
							JOptionPane.showMessageDialog(null, menu.L.toString());
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
	
	public static void read_smartphone (){
		int opt = 0, location = -1;
		boolean validator = true;
		String str= "";
		String[]buttons={
				"Read One",
				"Read All",
				"Atrás"
				};
		if(singleton.productsmartphone.isEmpty()){
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
						for (int i = 0; i <singleton.productsmartphone.size();i++){
							str = str + (singleton.productsmartphone.get(i).toString());
							JOptionPane.showMessageDialog(null, str,"Información",JOptionPane.INFORMATION_MESSAGE);
						}
						break;
					case 1:
						location = -1;
						menu.S = CRUD.new_smartphone("Ingresa el ID de tu smartphone para leerlo."
								+ "\nRecuerda que debe usar la siguiente nomenclatura: ABC-123","Ingresar ID");
						location = find.find_smartphone(menu.S);
						if (location != -1) {
							menu.S = singleton.productsmartphone.get(location);
							JOptionPane.showMessageDialog(null, menu.S.toString());
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
	
	public static void read_accessory (){
		int opt = 0, location = -1;
		boolean validator = true;
		String str= "";
		String[]buttons={
				"Read One",
				"Read All",
				"Atrás"
				};
		if(singleton.productaccessory.isEmpty()){
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
						for (int i = 0; i <singleton.productaccessory.size();i++){
							str = str + (singleton.productaccessory.get(i).toString());
							JOptionPane.showMessageDialog(null, str,"Información",JOptionPane.INFORMATION_MESSAGE);
						}
						break;
					case 1:
						location = -1;
						menu.A = CRUD.new_accessory("Ingresa el ID de tu accesorio para leerlo."
								+ "\nRecuerda que debe usar la siguiente nomenclatura: ABC-123","Ingresar ID");
						location = find.find_accessory(menu.A);
						if (location != -1) {
							menu.A = singleton.productaccessory.get(location);
							JOptionPane.showMessageDialog(null, menu.A.toString());
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