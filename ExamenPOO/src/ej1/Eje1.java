package ej1;

import java.util.Scanner;

public class Eje1 {

	public static void main(String[] args) {
		
		int contador = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe un texto");
		String texto = sc.next();
		
		for(int i = 1;i < texto.length();i++) {
			
			if(Character.isSpaceChar(texto.charAt(i)) == true) {
				contador++;
			}
			
		}
		
		System.out.println(contador);
		
		

	}

}
