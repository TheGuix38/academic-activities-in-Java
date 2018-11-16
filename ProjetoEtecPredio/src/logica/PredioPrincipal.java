package logica;

import java.util.Scanner;

public class PredioPrincipal {

	public static void main(String[] args) {
		
		EtecPredio objPredio = new EtecPredio();
		
		Scanner lerDados = new Scanner(System.in);
		
		System.out.println("Selecione o Curso: \n1. Ensino Médio \n2. Informática \n3. Desenvolvimento de Sistemas \n4. Logística \n5. Administração");
		objPredio.curso = Integer.parseInt(lerDados.nextLine());
		
		System.out.println("Agora Informe o módulo/ano");
		objPredio.modulo = Integer.parseInt(lerDados.nextLine());
		
		if(objPredio.curso == 1 && objPredio.modulo == 1){
			System.out.println("Prédio A, 1º Andar");
		}else 
			if(objPredio.curso == 1 && objPredio.modulo == 2){
			System.out.println("Prédio A, 2º Andar");
		}else 
			if(objPredio.curso == 1 && objPredio.modulo == 3){
			System.out.println("Prédio A, 3º Andar");
		}else 
			if(objPredio.curso == 2 && objPredio.modulo == 1){
			System.out.println("Curso e/ou módulo Inválido");
		}else 
			if(objPredio.curso == 2 && objPredio.modulo == 2){
			System.out.println("Prédio B, 2º Andar");
		}else 
			if(objPredio.curso == 2 && objPredio.modulo == 3){
			System.out.println("Prédio B, 3º Andar");
		}else 
			if(objPredio.curso == 3 && objPredio.modulo == 1){
			System.out.println("Prédio B, 1º Andar");
		}else 
			if(objPredio.curso == 3 && objPredio.modulo == 2){
			System.out.println("Curso e/ou módulo Inválido");
		}else 
			if(objPredio.curso == 3 && objPredio.modulo == 3){
			System.out.println("Curso e/ou módulo Inválido");
		}else 
			if(objPredio.curso == 4 && objPredio.modulo == 1){
			System.out.println("Prédio D, 1º Andar");
		}else 
			if(objPredio.curso == 4 && objPredio.modulo == 2){
			System.out.println("Prédio D, 2º Andar");
		}else 
			if(objPredio.curso == 4 && objPredio.modulo == 3){
			System.out.println("Prédio D, 3º Andar");
		}else 
			if(objPredio.curso == 5 && objPredio.modulo == 1){
			System.out.println("Prédio E, 1º Andar");
		}else 
			if(objPredio.curso == 5 && objPredio.modulo == 2){
			System.out.println("Prédio E, 2º Andar");
		}else 
			if(objPredio.curso == 5 && objPredio.modulo == 3){
			System.out.println("Prédio E, 3º Andar");
		}else {
			System.out.println("Curso e/ou módulo Inválido");
		}
		
		lerDados.close();

	}

}
