package ej3;

import java.util.Scanner;

public class Main {
	
	static Producto[] productos = new Producto[10];
	static int numProducto;
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int opcion;
		//COMMIT 3
		do {
			System.out.println("Gestion de inventario - Elija una opcion");
			System.out.println("1. Introducir datos nuevo inventario.");
			System.out.println("2. Nuevo producto.");
			System.out.println("3. Buscar producto y modificar información.");
			System.out.println("4. Eliminar producto.");
			System.out.println("5. Mostrar valor total del inventario.");
			System.out.println("6. Informe rotura de stock.");
			System.out.println("7. Salir.");
			opcion = sc.nextInt();
			
			switch(opcion) {
			case 1:
				nuevoInventario();
				break;
			case 2:
				ingresarProducto();
				break;
			case 3:
				modificacion();
				break;
			case 4:
				eliminar();
				break;
			case 5:
				mostrarInventario();				
				break;
			case 6:
				roturaStock();
				break;
			case 7:
				break;
			default:
				System.out.println("opcion no valida");
			}
			
			
			
			
		}while (opcion != 7);
		
		sc.close();

	}


	private static void nuevoInventario() {
		
		int fin;
		System.out.println("Ingresa productos hasta que escibas 'fin'");
		
		do {
			ingresarProducto();
			System.out.println("si has terminado escribe 0, sino escribe cualquier otro numero");
			fin = sc.nextInt();
		}while(fin != 0);
		
	}

	private static void ingresarProducto() {
		
		System.out.println("Ingresa nombre de producto");
		String producto = sc.next();
		System.out.println("Ingresa cantidad de producto");
		int cantidad = sc.nextInt();
		System.out.println("Ingresa precio de producto");
		double precio = sc.nextDouble();
			
		productos[numProducto] = new Producto(producto, cantidad, precio);
		numProducto++;
		
		}
		
	
	private static void mostrarInventario() {
		
		for(int i = 0;i <= numProducto; i++) {
				System.out.println(productos[i]);
		}
		return;
		
	}
	
	private static void modificacion() {
		
		System.out.println("Ingresa nombre de producto a modificar");
		String producto = sc.next();
		
		for(int i = 0;i < numProducto; i++) {
			if(productos[i].getNombre().equals(producto)) {
				
				System.out.println("Ingresa nueva cantidad de producto");
				int cantidad = sc.nextInt();
				productos[i].setCantidad(cantidad);
				
				System.out.println("Ingresa nuevo precio de producto");
				double precio = sc.nextDouble();
				productos[i].setPrecio(precio);
				
				
			}
		}
		
	}
	
	private static void eliminar() {
		
		System.out.println("Ingresa nombre de producto a eliminar");
		String producto = sc.next();
		
		for(int i = 0;i < numProducto; i++) {
			if(productos[i].getNombre().equals(producto)) {
				for(int j = 1;j < numProducto - i;j++) {
					productos[i].setNombre(productos[i + j].getNombre());
					productos[i].setCantidad(productos[i + j].getCantidad());
					productos[i].setPrecio(productos[i + j].getPrecio());
				}
				numProducto--;
			}
			
		}
		
	}
	
	private static void roturaStock() {
		
		System.out.println("estos son los productos que estan en rotura de stock");

		
		for(int i = 0;i < numProducto; i++) {
			if(productos[i].getCantidad() < 50) {
				 System.out.println(productos[i].getNombre() + " con stock de " + productos[i].getCantidad());
				 return;
			} 
			
	}
		
	}

}
