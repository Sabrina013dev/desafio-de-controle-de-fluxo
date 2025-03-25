
import java.util.Scanner;
/***
 * @author Sabrina Santos
 * @version 1
 * @since 25/03/2025
 */

/*So, to resolve this challenge...  
 * Steps:  
 * 1. I need to review the content: if-else, switch-case, for, while, do-while, try-catch-finally, and throw.  
 * 2. I will use Scanner to read two integer numbers.  
 * 3. The first number cannot be bigger than the second; for example, 12 - 30 = 18. I need an "if" condition to check this.  
 * 4. If the first number is greater, I need to throw an exception called ParametrosInvalidosException.  
 * 5. sooo, I don’t need to use while or do-while, but they could be alternatives for iteration.  
 * 6.   
 */

public class Contador {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o primeiro parâmetro");
		int parametroUm = scan.nextInt();

		System.out.println("Digite o segundo parâmetro");
		int parametroDois = scan.nextInt();
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException exception) {
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            System.out.println("O segundo parametro deve ser maior que o primeiro");
		}finally{
            scan.close();
        }
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		if(parametroUm > parametroDois){
            System.out.println("O segundo parametro é maior que o primeiro");
        }
		    for (int i=1; i <= (parametroDois - parametroUm); i++){
            System.out.println("Imprimindo o número "+i);
            }
		//realizar o for para imprimir os números com base na variável contagem
	}
}

    class ParametrosInvalidosException extends Exception {
        public ParametrosInvalidosException(String mensagem){
            super(mensagem);
        }
    }





























































































































