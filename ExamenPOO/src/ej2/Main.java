package ej2;

import java.util.Scanner;

public class Main {
	
	static Scanner sc = new Scanner(System.in);
	static Entradas entradas = new Entradas(1000,200,25);

	public static void main(String[] args) {
		
		
		int opcion;
		
		do {
			System.out.println("Gestion de inventario - Elija una opcion");
			System.out.println("1. Mostrar numero entradas libres");
			System.out.println("2. Vender entradas");
			System.out.println("3. Salir");
			opcion = sc.nextInt();
			
			switch(opcion) {
			case 1:
				Mostrar();
				break;
			case 2:
				vender();
				break;
			case 3:
				System.out.println("Saliendo...");
			default:
				System.out.println("opcion no valida");
		}
			
			
		}while (opcion != 3);
		
		sc.close();
	}

	private static void Mostrar() {
		
		System.out.println("Hay " + entradas.getZonaPrincipal() + " Entradas en la zona principal");
		System.out.println("Hay " + entradas.getZonaPlateada() + " Entradas en la zona plateada");
		System.out.println("Hay " + entradas.getZonaVip() + " Entradas en la zona vip");
		
	}

	private static void vender() {
		
		System.out.println("Cuantas entradas Principales quieres?");
		int principal = sc.nextInt();
		
		if(entradas.getZonaPrincipal() - principal < 0) {
			System.out.println("No hay suficientes entradas");
			return;
		}else {
			entradas.setZonaPrincipal(entradas.getZonaPrincipal() - principal);
		}
	
		System.out.println("Cuantas entradas plateadas quieres?");
		int plateada = sc.nextInt();
		
		if(entradas.getZonaPlateada() - plateada < 0) {
			System.out.println("No hay suficientes entradas");
			return;
		}else {
			entradas.setZonaPlateada(entradas.getZonaPlateada() - plateada);
		}
		
		System.out.println("Cuantas entradas vip quieres?");
		int vip = sc.nextInt();
		
		if(entradas.getZonaVip() - vip < 0) {
			System.out.println("No hay suficientes entradas");
		}else {
			entradas.setZonaVip(entradas.getZonaVip() - vip);
		}
		
		
		
	}
}
