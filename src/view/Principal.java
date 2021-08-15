package view;

import controller.CalculaFatorial;

public class Principal {
	
	public static void main(String[] args) {
		CalculaFatorial op = new CalculaFatorial();
		
	// fatorial deverá ser abaixo de 12	
		int n = 5;
		if(n > 0 && n < 12 ) {
			int fat = op.recursividadeFat(n);
			System.out.println(fat);
		}else {
			System.out.println("Digite um número maior que 0 e menor que 12");
		}
		
	}
	
}
