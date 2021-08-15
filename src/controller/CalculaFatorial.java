package controller;

public class CalculaFatorial {
	
	public CalculaFatorial() {
		super();
	}
	
	public int recursividadeFat(int n) {
	
	//	5! = 5.4.3.2.1 = 120
	// fat(5) = 5*fatorial(5-1)
		
		//condi��o de parada = Quando o fatorial for igual a 0 retornar 1
		if (n == 0) {
			return 1;
		}else {
			return n * recursividadeFat(n-1);
		// retorno da multiplica��o do n�mero recebido vezes ele mesmo menos 1
		// A rela��o do n�mero 1 faz que ele subtraia o n�mero recebido e multiplique o resultado, chegando no fatorial
		// valor*(valor-1)	
		}
		
	}

}
