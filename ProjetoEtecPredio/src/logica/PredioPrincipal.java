package logica;

import java.util.Scanner;

public class PredioPrincipal {

	public static void main(String[] args) {
		
		EtecPredio objPredio = new EtecPredio();
		
		Scanner lerDados = new Scanner(System.in);
		
		System.out.println("Selecione o Curso: \n1. Ensino M�dio \n2. Inform�tica \n3. Desenvolvimento de Sistemas \n4. Log�stica \n5. Administra��o");
		objPredio.curso = Integer.parseInt(lerDados.nextLine());
		
		System.out.println("Agora Informe o m�dulo/ano");
		objPredio.modulo = Integer.parseInt(lerDados.nextLine());
		
		if(objPredio.curso == 1 && objPredio.modulo == 1){
			System.out.println("Pr�dio A, 1� Andar");
		}else 
			if(objPredio.curso == 1 && objPredio.modulo == 2){
			System.out.println("Pr�dio A, 2� Andar");
		}else 
			if(objPredio.curso == 1 && objPredio.modulo == 3){
			System.out.println("Pr�dio A, 3� Andar");
		}else 
			if(objPredio.curso == 2 && objPredio.modulo == 1){
			System.out.println("Curso e/ou m�dulo Inv�lido");
		}else 
			if(objPredio.curso == 2 && objPredio.modulo == 2){
			System.out.println("Pr�dio B, 2� Andar");
		}else 
			if(objPredio.curso == 2 && objPredio.modulo == 3){
			System.out.println("Pr�dio B, 3� Andar");
		}else 
			if(objPredio.curso == 3 && objPredio.modulo == 1){
			System.out.println("Pr�dio B, 1� Andar");
		}else 
			if(objPredio.curso == 3 && objPredio.modulo == 2){
			System.out.println("Curso e/ou m�dulo Inv�lido");
		}else 
			if(objPredio.curso == 3 && objPredio.modulo == 3){
			System.out.println("Curso e/ou m�dulo Inv�lido");
		}else 
			if(objPredio.curso == 4 && objPredio.modulo == 1){
			System.out.println("Pr�dio D, 1� Andar");
		}else 
			if(objPredio.curso == 4 && objPredio.modulo == 2){
			System.out.println("Pr�dio D, 2� Andar");
		}else 
			if(objPredio.curso == 4 && objPredio.modulo == 3){
			System.out.println("Pr�dio D, 3� Andar");
		}else 
			if(objPredio.curso == 5 && objPredio.modulo == 1){
			System.out.println("Pr�dio E, 1� Andar");
		}else 
			if(objPredio.curso == 5 && objPredio.modulo == 2){
			System.out.println("Pr�dio E, 2� Andar");
		}else 
			if(objPredio.curso == 5 && objPredio.modulo == 3){
			System.out.println("Pr�dio E, 3� Andar");
		}else {
			System.out.println("Curso e/ou m�dulo Inv�lido");
		}
		
		lerDados.close();

	}

}
