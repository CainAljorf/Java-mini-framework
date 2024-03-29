package tema4.modules.users.menu;

import javax.swing.JOptionPane;

import tema4.modules.products.classes.singleton;
import tema4.modules.products.dummies.CRUD_dummies.create_dummies;
import tema4.modules.products.dummies.CRUD_dummies.delete_dummies;
import tema4.modules.products.dummies.CRUD_dummies.read_dummies;
import tema4.modules.products.dummies.CRUD_dummies.update_dummies;
import tema4.modules.products.utils.CRUD_functions.create;
import tema4.modules.products.utils.CRUD_functions.delete;
import tema4.modules.products.utils.CRUD_functions.read;
import tema4.modules.products.utils.CRUD_functions.update;
import tema4.modules.users.classes.singleton_users;
import tema4.modules.users.utils.CRUD;
import tema4.modules.users.utils.find;
import tema4.modules.users.utils_array.readUsers;
import tema4.modules.users.utils_array.register;
import tema4.modules.users.utils_array.update_users;
import tema4.utils.validators;

public class menu_admin {
	public static void admin() {
		singleton_users.A.setActive(true);
		JOptionPane.showMessageDialog(null, "Eres administrador.","Acceso Correcto",JOptionPane.INFORMATION_MESSAGE);
		String[]buttons_main_menu={
				"Users",
				"Products",
				"Logout"};
		String[]buttons_dummies={
				"Manual",
				"Dummies",
				"Atrás"};
		String[]buttons_main={
				"Laptop",
				"Smartphone",
				"Accesorio",
				"PCGaming",
				"Atrás"};
		String[]buttons_users={
				"Client",
				"Admin",
				"Employee",
				"Atrás"};
		String[]buttons_sec={
				"Create",
				"Read",
				"Update",
				"Delete",
				"Atrás"};
		int menu_main_p=0;
		int menu_dummies=0;
		int menu_main=0;
		int menu_sec=0;
		int menu_users=0;
		boolean validator=true;
		boolean validator2=true;
		boolean validator3=true;
		boolean validator4=true;
		do {
			menu_main_p=JOptionPane.showOptionDialog(
					null,
					"Elige una opción",
					"Tipo de CRUD",
					0,
					JOptionPane.QUESTION_MESSAGE,
					null,
					buttons_main_menu,
					buttons_main_menu[0]);
			switch(menu_main_p) {
				case 0:
					do {
						menu_users=JOptionPane.showOptionDialog(
								null,
								"Elige una opción",
								"Usuarios",
								0,
								JOptionPane.QUESTION_MESSAGE,
								null,
								buttons_users,
								buttons_users[0]);
						switch(menu_users) {
						case 0:
//							Read Cliente
							do {
								menu_sec=JOptionPane.showOptionDialog(
										null,
										"Elige una opción",
										"Cliente",
										0,
										JOptionPane.QUESTION_MESSAGE,
										null,
										buttons_sec,
										buttons_sec[0]);
								switch(menu_sec) {
								case 0:
									register.client();
									validator2=true;
									break;
								case 1:
									readUsers.read_client();
									validator2=true;
									break;
								case 2:
									update_users.update_client();
									validator2=true;
									break;
								case 3:
									int location = -1;
									singleton_users.C = CRUD.new_client("Ingresa el nombre de usuario que quieras borrar.","Ingresar Nombre de usuario");
									location = find.find_username(singleton_users.C);
									if (location != -1) {
										singleton_users.C.setActive(false);
										JOptionPane.showMessageDialog(null, "Cliente desactivado.","Información",JOptionPane.INFORMATION_MESSAGE);
									} else {
										JOptionPane.showMessageDialog(null, "No se ha encontrado al usuario.","Error",JOptionPane.ERROR_MESSAGE);
									}
									validator2=false;
									break;
								case 4:
									JOptionPane.showMessageDialog(null, "Volviendo al menú anterior.","Información",JOptionPane.INFORMATION_MESSAGE);
									validator2=false;
									break;
								default:
									JOptionPane.showMessageDialog(null, "Cerrando el programa.","Cerrar",JOptionPane.INFORMATION_MESSAGE);
									System.exit(0);
									break;
								}
							}while(validator2==true);
							validator=true;
							break;
						case 1:
//							CRUD Admin
							do {
								menu_sec=JOptionPane.showOptionDialog(
										null,
										"Elige una opción",
										"Administrador",
										0,
										JOptionPane.QUESTION_MESSAGE,
										null,
										buttons_sec,
										buttons_sec[0]);
								switch(menu_sec) {
								case 0:
									register.admin();
									validator2=true;
									break;
								case 1:
									readUsers.read_admin();
									validator2=true;
									break;
								case 2:
									update_users.update_admin();
									validator2=true;
									break;
								case 3:
									int location = -1;
									singleton_users.A = CRUD.new_admin("Ingresa el nombre de usuario que quieras borrar.","Ingresar Nombre de usuario");
									location = find.find_username(singleton_users.A);
									if (location != -1) {
										singleton_users.A.setActive(false);
										JOptionPane.showMessageDialog(null, "Administrador desactivado.","Información",JOptionPane.INFORMATION_MESSAGE);
									} else {
										JOptionPane.showMessageDialog(null, "No se ha encontrado al usuario.","Error",JOptionPane.ERROR_MESSAGE);
									}
									validator2=false;
									break;
								case 4:
									JOptionPane.showMessageDialog(null, "Volviendo al menú anterior.","Información",JOptionPane.INFORMATION_MESSAGE);
									validator2=false;
									break;
								default:
									JOptionPane.showMessageDialog(null, "Cerrando el programa.","Cerrar",JOptionPane.INFORMATION_MESSAGE);
									System.exit(0);
									break;
								}
							}while(validator2==true);
							validator=true;
							break;
						case 2:
//							Read Update Employee
							do {
								menu_sec=JOptionPane.showOptionDialog(
										null,
										"Elige una opción",
										"Empleado",
										0,
										JOptionPane.QUESTION_MESSAGE,
										null,
										buttons_sec,
										buttons_sec[0]);
								switch(menu_sec) {
								case 0:
									register.employee();
									validator2=true;
									break;
								case 1:
									readUsers.read_employee();
									validator2=true;
									break;
								case 2:
									update_users.update_employee();
									validator2=true;
									break;
								case 3:
									int location = -1;
									singleton_users.E = CRUD.new_employee("Ingresa el nombre de usuario que quieras borrar.","Ingresar Nombre de usuario");
									location = find.find_username(singleton_users.E);
									if (location != -1) {
										singleton_users.E.setActive(false);
										JOptionPane.showMessageDialog(null, "Empleado desactivado.","Información",JOptionPane.INFORMATION_MESSAGE);
									} else {
										JOptionPane.showMessageDialog(null, "No se ha encontrado al usuario.","Error",JOptionPane.ERROR_MESSAGE);
									}
									validator2=false;
									break;
								case 4:
									JOptionPane.showMessageDialog(null, "Volviendo al menú anterior.","Información",JOptionPane.INFORMATION_MESSAGE);
									validator2=false;
									break;
								default:
									JOptionPane.showMessageDialog(null, "Cerrando el programa.","Cerrar",JOptionPane.INFORMATION_MESSAGE);
									System.exit(0);
									break;
								}
							}while(validator2==true);
							validator=true;
							break;
						case 3:
							JOptionPane.showMessageDialog(null, "Volviendo al menú anterior.","Información",JOptionPane.INFORMATION_MESSAGE);
							validator=false;
							break;
						default:
							JOptionPane.showMessageDialog(null, "Cerrando el programa.","Cerrar",JOptionPane.INFORMATION_MESSAGE);
							System.exit(0);
							break;
						}
					}while(validator==true);
					break;
				case 1:
					do {
						menu_dummies=JOptionPane.showOptionDialog(
								null,
								"Elige una opción",
								"Tipo de Producto",
								0,
								JOptionPane.QUESTION_MESSAGE,
								null,
								buttons_dummies,
								buttons_dummies[0]);
						switch(menu_dummies) {
							case 0:
								do {
									menu_main=JOptionPane.showOptionDialog(
											null,
											"¿Con cuál producto quieres trabajar?",
											"Productos",
											0,
											JOptionPane.QUESTION_MESSAGE,
											null,
											buttons_main,
											buttons_main[0]);
									switch(menu_main){
										case 0:
											do {
												menu_sec=JOptionPane.showOptionDialog(
														null,
														"Elige la opción que quieras usar.",
														"CRUD",
														0,
														JOptionPane.QUESTION_MESSAGE,
														null,
														buttons_sec,
														buttons_sec[0]);
												switch(menu_sec) {
													case 0:
														create.laptop();;
														validator2=true;
														break;
													case 1:
														if(singleton.L!=null) {
															read.read_laptop();;
														}else {
															JOptionPane.showMessageDialog(null,"No se ha podido encontrar el laptop.","Error",JOptionPane.ERROR_MESSAGE);
														}//end if
														validator2=true;
														break;
													case 2:
														if(singleton.L!=null){
															update.update_laptop();
														}else {
															JOptionPane.showMessageDialog(null,"No se ha podido encontrar el laptop que quieres actualizar.","Error",JOptionPane.ERROR_MESSAGE);
														}//end if
														validator2=true;
														break;
													case 3:
														if(singleton.L!=null){
															delete.delete_laptop();;
														}else {
															JOptionPane.showMessageDialog(null,"No se ha podido encontrar el laptop que quieres eliminar.","Error",JOptionPane.ERROR_MESSAGE);
														}//end if
														validator2=true;
														break;
													case 4:
														validator2=false;
														JOptionPane.showMessageDialog(null, "Volviendo al menú anterior.","Información",JOptionPane.INFORMATION_MESSAGE);
														break;
													default:
														validator2=false;
														JOptionPane.showMessageDialog(null, "Cerrando el programa.","Cerrar",JOptionPane.ERROR_MESSAGE);
														System.exit(0);
														break;
												}//end switch
											}while(validator2==true);
											break;
										case 1:
											do {
												menu_sec=JOptionPane.showOptionDialog(
														null,
														"Elige la opción que quieras usar.",
														"CRUD",
														0,
														JOptionPane.QUESTION_MESSAGE,
														null,
														buttons_sec,
														buttons_sec[0]);
												switch(menu_sec) {
													case 0:
														create.smartphone();
														validator2=true;
														break;
													case 1:
														if(singleton.S!=null) {
															read.read_smartphone();
														}else {
															JOptionPane.showMessageDialog(null,"No se ha podido encontrar el smartphone.","Error",JOptionPane.ERROR_MESSAGE);
														}//end if
														validator2=true;
														break;
													case 2:
														if(singleton.S!=null){
															update.update_smartphone();;
														}else {
															JOptionPane.showMessageDialog(null,"No se ha podido encontrar el smartphone que quieres actualizar.","Error",JOptionPane.ERROR_MESSAGE);
														}//end if
														validator2=true;
														break;
													case 3:
														if(singleton.S!=null){
															delete.delete_smartphone();
														}else {
															JOptionPane.showMessageDialog(null,"No se ha podido encontrar el smartphone que quieres eliminar.","Error",JOptionPane.ERROR_MESSAGE);
														}//end if
														validator2=true;
														break;
													case 4:
														validator2=false;
														JOptionPane.showMessageDialog(null, "Volviendo al menú anterior.","Información",JOptionPane.INFORMATION_MESSAGE);
														break;
													default:
														validator2=false;
														JOptionPane.showMessageDialog(null, "Cerrando el programa.","Cerrar",JOptionPane.INFORMATION_MESSAGE);
														System.exit(0);
														break;
												}//end switch
											}while(validator2==true);
											break;
										case 2:
											do {
												menu_sec=JOptionPane.showOptionDialog(
														null,
														"Elige la opción que quieras usar.",
														"CRUD",
														0,
														JOptionPane.QUESTION_MESSAGE,
														null,
														buttons_sec,
														buttons_sec[0]);
												switch(menu_sec) {
													case 0:
														create.accessory();
														validator2=true;
														break;
													case 1:
														if(singleton.A!=null) {
															read.read_accessory();
														}else {
															JOptionPane.showMessageDialog(null,"No se ha podido encontrar el accesorio.","Error",JOptionPane.ERROR_MESSAGE);
														}//end if
														validator2=true;
														break;
													case 2:
														if(singleton.A!=null){
															update.update_accessory();
														}else {
															JOptionPane.showMessageDialog(null,"No se ha podido encontrar el accesorio que quieres actualizar.","Error",JOptionPane.ERROR_MESSAGE);
														}//end if
														validator2=true;
														break;
													case 3:
														if(singleton.A!=null){
															delete.delete_accessory();
														}else {
															JOptionPane.showMessageDialog(null,"No se ha podido encontrar el Accesorio que quieres eliminar.","Error",JOptionPane.ERROR_MESSAGE);
														}//end if
														validator2=true;
														break;
													case 4:
														validator2=false;
														JOptionPane.showMessageDialog(null, "Volviendo al menú anterior.","Información",JOptionPane.INFORMATION_MESSAGE);
														break;
													default:
														validator2=false;
														JOptionPane.showMessageDialog(null, "Cerrando el programa.","Cerrar",JOptionPane.INFORMATION_MESSAGE);
														System.exit(0);
														break;
												}//end switch
											}while(validator2==true);
											break;
										case 3:
											do {
												menu_sec=JOptionPane.showOptionDialog(
														null,
														"Elige la opción que quieras usar.",
														"CRUD",
														0,
														JOptionPane.QUESTION_MESSAGE,
														null,
														buttons_sec,
														buttons_sec[0]);
												switch(menu_sec) {
													case 0:
														create.pcgaming();
														validator2=true;
														break;
													case 1:
														if(singleton.PC!=null) {
															read.read_pcgaming();
														}else {
															JOptionPane.showMessageDialog(null,"No se ha podido encontrar el pcgaming.","Error",JOptionPane.ERROR_MESSAGE);
														}//end if
														validator2=true;
														break;
													case 2:
														if(singleton.PC!=null){
															update.update_pcgaming();
														}else {
															JOptionPane.showMessageDialog(null,"No se ha podido encontrar el pcgaming que quieres actualizar.","Error",JOptionPane.ERROR_MESSAGE);
														}//end if
														validator2=true;
														break;
													case 3:
														if(singleton.PC!=null){
															delete.delete_pcgaming();
														}else {
															JOptionPane.showMessageDialog(null,"No se ha podido encontrar el pcgaming que quieres eliminar.","Error",JOptionPane.ERROR_MESSAGE);
														}//end if
														validator2=true;
														break;
													case 4:
														validator2=false;
														JOptionPane.showMessageDialog(null, "Volviendo al menú anterior.","Información",JOptionPane.INFORMATION_MESSAGE);
														break;
													default:
														validator2=false;
														JOptionPane.showMessageDialog(null, "Cerrando el programa.","Cerrar",JOptionPane.INFORMATION_MESSAGE);
														System.exit(0);
														break;
												}//end switch
											}while(validator2==true);
											break;
										case 4:
											validator=false;
											JOptionPane.showMessageDialog(null, "Volviendo al menú anterior.","Cerrar",JOptionPane.INFORMATION_MESSAGE);
											break;
										default:	
											validator=false;
											JOptionPane.showMessageDialog(null, "Cerrando el programa.","Cerrar",JOptionPane.INFORMATION_MESSAGE);
											System.exit(0);
											break;
									}//end switch
								}while(validator==true);
								break;
						case 1:
							int num = validators.validator_int("Cuantos objetos quieres crear en el array?","Introduce un número");
							do {
								menu_main=JOptionPane.showOptionDialog(
										null,
										"¿Con cuál producto quieres trabajar?",
										"Productos",
										0,
										JOptionPane.QUESTION_MESSAGE,
										null,
										buttons_main,
										buttons_main[0]);
								switch(menu_main){
									case 0:
										do {
											menu_sec=JOptionPane.showOptionDialog(
													null,
													"Elige la opción que quieras usar.",
													"CRUD",
													0,
													JOptionPane.QUESTION_MESSAGE,
													null,
													buttons_sec,
													buttons_sec[0]);
											switch(menu_sec) {
												case 0:
													for (int i = 0; i < num; i++) {
														create_dummies.laptop();
													}											
													validator2=true;
													break;
												case 1:
													if(singleton.L!=null) {
														read_dummies.laptop();;
													}else {
														JOptionPane.showMessageDialog(null,"No se ha podido encontrar el laptop.","Error",JOptionPane.ERROR_MESSAGE);
													}//end if
													validator2=true;
													break;
												case 2:
													if(singleton.L!=null){
														update_dummies.laptop();
													}else {
														JOptionPane.showMessageDialog(null,"No se ha podido encontrar el laptop que quieres actualizar.","Error",JOptionPane.ERROR_MESSAGE);
													}//end if
													validator2=true;
													break;
												case 3:
													if(singleton.L!=null){
														delete_dummies.delete_dummies_laptop();;
													}else {
														JOptionPane.showMessageDialog(null,"No se ha podido encontrar el laptop que quieres eliminar.","Error",JOptionPane.ERROR_MESSAGE);
													}//end if
													validator2=true;
													break;
												case 4:
													validator2=false;
													validator=true;
													JOptionPane.showMessageDialog(null, "Volviendo al menú anterior.","Información",JOptionPane.INFORMATION_MESSAGE);
													break;
												default:
													validator2=false;
													JOptionPane.showMessageDialog(null, "Cerrando el programa.","Cerrar",JOptionPane.ERROR_MESSAGE);
													System.exit(0);
													break;
											}//end switch
										}while(validator2==true);
										break;
									case 1:
										do {
											menu_sec=JOptionPane.showOptionDialog(
													null,
													"Elige la opción que quieras usar.",
													"CRUD",
													0,
													JOptionPane.QUESTION_MESSAGE,
													null,
													buttons_sec,
													buttons_sec[0]);
											switch(menu_sec) {
												case 0:
													for (int i = 0; i < num; i++) {
														create_dummies.smartphone();
											        }
													validator2=true;
													break;
												case 1:
													if(singleton.S!=null) {
														read_dummies.smartphone();
													}else {
														JOptionPane.showMessageDialog(null,"No se ha podido encontrar el smartphone.","Error",JOptionPane.ERROR_MESSAGE);
													}//end if
													validator2=true;
													break;
												case 2:
													if(singleton.S!=null){
														update_dummies.smartphone();;
													}else {
														JOptionPane.showMessageDialog(null,"No se ha podido encontrar el smartphone que quieres actualizar.","Error",JOptionPane.ERROR_MESSAGE);
													}//end if
													validator2=true;
													break;
												case 3:
													if(singleton.S!=null){
														delete_dummies.delete_dummies_smartphone();
													}else {
														JOptionPane.showMessageDialog(null,"No se ha podido encontrar el smartphone que quieres eliminar.","Error",JOptionPane.ERROR_MESSAGE);
													}//end if
													validator2=true;
													break;
												case 4:
													validator2=false;
													validator=true;
													JOptionPane.showMessageDialog(null, "Volviendo al menú anterior.","Información",JOptionPane.INFORMATION_MESSAGE);
													break;
												default:
													validator2=false;
													JOptionPane.showMessageDialog(null, "Cerrando el programa.","Cerrar",JOptionPane.INFORMATION_MESSAGE);
													System.exit(0);
													break;
											}//end switch
										}while(validator2==true);
										break;
									case 2:
										do {
											menu_sec=JOptionPane.showOptionDialog(
													null,
													"Elige la opción que quieras usar.",
													"CRUD",
													0,
													JOptionPane.QUESTION_MESSAGE,
													null,
													buttons_sec,
													buttons_sec[0]);
											switch(menu_sec) {
												case 0:
													for (int i = 0; i < num; i++) {
														create_dummies.accessory();
											        }
													validator2=true;
													break;
												case 1:
													if(singleton.A!=null) {
														read_dummies.accessory();
													}else {
														JOptionPane.showMessageDialog(null,"No se ha podido encontrar el accesorio.","Error",JOptionPane.ERROR_MESSAGE);
													}//end if
													validator2=true;
													break;
												case 2:
													if(singleton.A!=null){
														update_dummies.accessory();
													}else {
														JOptionPane.showMessageDialog(null,"No se ha podido encontrar el accesorio que quieres actualizar.","Error",JOptionPane.ERROR_MESSAGE);
													}//end if
													validator2=true;
													break;
												case 3:
													if(singleton.A!=null){
														delete_dummies.delete_dummies_accessory();
													}else {
														JOptionPane.showMessageDialog(null,"No se ha podido encontrar el Accesorio que quieres eliminar.","Error",JOptionPane.ERROR_MESSAGE);
													}//end if
													validator2=true;
													break;
												case 4:
													validator2=false;
													validator=true;
													JOptionPane.showMessageDialog(null, "Volviendo al menú anterior.","Información",JOptionPane.INFORMATION_MESSAGE);
													break;
												default:
													validator2=false;
													JOptionPane.showMessageDialog(null, "Cerrando el programa.","Cerrar",JOptionPane.INFORMATION_MESSAGE);
													System.exit(0);
													break;
											}//end switch
										}while(validator2==true);
										break;
									case 3:
										do {
											menu_sec=JOptionPane.showOptionDialog(
													null,
													"Elige la opción que quieras usar.",
													"CRUD",
													0,
													JOptionPane.QUESTION_MESSAGE,
													null,
													buttons_sec,
													buttons_sec[0]);
											switch(menu_sec) {
												case 0:
													for (int i = 0; i < num; i++) {
														create_dummies.pcgaming();
													}
													validator2=true;
													break;
												case 1:
													if(singleton.PC!=null) {
														read_dummies.pcgaming();
													}else {
														JOptionPane.showMessageDialog(null,"No se ha podido encontrar el pcgaming.","Error",JOptionPane.ERROR_MESSAGE);
													}//end if
													validator2=true;
													break;
												case 2:
													if(singleton.PC!=null){
														update_dummies.pcgaming();
													}else {
														JOptionPane.showMessageDialog(null,"No se ha podido encontrar el pcgaming que quieres actualizar.","Error",JOptionPane.ERROR_MESSAGE);
													}//end if
													validator2=true;
													break;
												case 3:
													if(singleton.PC!=null){
														delete_dummies.delete_dummies_pcgaming();
													}else {
														JOptionPane.showMessageDialog(null,"No se ha podido encontrar el pcgaming que quieres eliminar.","Error",JOptionPane.ERROR_MESSAGE);
													}//end if
													validator2=true;
													break;
												case 4:
													validator2=false;
													validator=true;
													JOptionPane.showMessageDialog(null, "Volviendo al menú anterior.","Información",JOptionPane.INFORMATION_MESSAGE);
													break;
												default:
													validator2=false;
													JOptionPane.showMessageDialog(null, "Cerrando el programa.","Cerrar",JOptionPane.INFORMATION_MESSAGE);
													System.exit(0);
													break;
											}//end switch
										}while(validator2==true);
										break;
									case 4:
										validator=false;
										JOptionPane.showMessageDialog(null, "Volviendo al menú anterior.","Información",JOptionPane.INFORMATION_MESSAGE);
										break;
									default:	
										validator=false;
										JOptionPane.showMessageDialog(null, "Cerrando el programa.","Cerrar",JOptionPane.INFORMATION_MESSAGE);
										System.exit(0);
										break;
								}//end switch
							}while(validator==true);
							break;
						case 2:
							validator3=false;
							JOptionPane.showMessageDialog(null, "Volviendo al menú anterior.","Información",JOptionPane.INFORMATION_MESSAGE);
							break;
						default:
							validator3=false;
							JOptionPane.showMessageDialog(null, "Cerrando el programa.","Cerrar",JOptionPane.INFORMATION_MESSAGE);
							System.exit(0);
							break;
					}
				}while(validator3==true);
				validator4=true;
				break;
			case 2:
				validator4=false;
				JOptionPane.showMessageDialog(null, "Cerrando sesión.","Saliendo",JOptionPane.INFORMATION_MESSAGE);
				break;
			default:
				validator4=false;
				JOptionPane.showMessageDialog(null, "Saliendo del programa.","Cerrando",JOptionPane.CLOSED_OPTION);
				System.exit(0);
				break;
			}
			
		}while(validator4==true);
	}
}
