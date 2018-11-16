package logica;

import java.util.Scanner;

public class CalcRetPrincipal {

	public static void main(String[] args) {
		
		// Criar o Objeto da classe CalcRet
		CalcRet objCal = new CalcRet();
		
		Scanner lerDados = new Scanner(System.in);
		
		System.out.println("Digite o Comprimento da base: ");
		objCal.base = Float.parseFloat(lerDados.nextLine());
		
		System.out.println("Digite a Medida da altura: ");
		objCal.altura = Float.parseFloat(lerDados.nextLine());
		
		objCal.areaRet = objCal.altura * objCal.base;
		
		System.out.println("A área do retângulo é: " + objCal.areaRet);
		lerDados.close();
	}
}
