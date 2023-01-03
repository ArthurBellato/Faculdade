import java.sql.SQLIntegrityConstraintViolationException;
import java.util.Scanner;
import java.util.Set;

import javax.sound.midi.Synthesizer;
import javax.swing.*;
    
public class calculadora {    
    public static void main (String []args) {

	} 

		public void initialize() {
			setTitle("Calcular Nota");
			setSize(500, 600);
			setMinimumSize(new Dimension(300, 400));
			setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
			setVisible(true);

		
	
        
        // TODO Auto-generated method stub
   

		/* Nesse trabalho, o código foi feito usando aquilo que foi aprendido sobre Java no primeiro e no segundo semestre, e além
		 * disso foram usados também vídeos sobre Programação orientada a objetos.
		 */

        short operacao;
        double num1, num2;    
        Scanner input = new Scanner(System.in);
        
        do {
			 System.out.println("Trabalho Projeto Integrador II-B");
             System.out.println("Digite a operação desejada:");
             System.out.println("  1- adição");      
             System.out.println("  2- subtração");      
             System.out.println("  3- multiplicação");      
             System.out.println("  4- divisão");      
             System.out.println("  0- finalizar");
             System.out.print("Operação: ");
             operacao = input.nextShort();
             
             if (operacao == 0) {
            	 System.out.println("Obrigado por usar a calculadora!");
            	 break;
             }

			 /* O comando "break" já é implementado desde o começo do código, para a finalização voluntária do mesmo
			  * pelo usuário.
			  */
             
             if (!OperacaoExiste(operacao)) {
            	 continue;
             }
             
             System.out.print("Primeiro valor: ");
             num1 = input.nextDouble();
             
             System.out.print("Segundo valor: ");
             num2 = input.nextDouble();
             
             if (!ValidaDadosDeEntrada(operacao, num1, num2)) {
            	 continue;
             }
        
             System.out.println("Resultado: O resultado calculado da " + getNomeOperacao(operacao) + " é: " + Calcular(operacao, num1, num2) + "\n");
        } while (operacao != 0);
    }

		/* No código acima usamos condicionais para que o usuário escolha quais valores ele vai usar nas suas
		 * operações.
		*/
    
    private void setMinimumSize(Dimension dimension) {
		}

	private void setSize(int i, int j) {
		}

	private void setDefaultCloseOperation(int exitOnClose) {
		}

	private void setVisible(boolean b) {
		}

	private static void setTitle(String string) {
	}

	static double Calcular (short operacao, double num1, double num2) {
    	double resultado = 0;
    	switch (operacao) {
    		case 1: //adição
    			resultado = num1 + num2;
    			break;
    		case 2: //substração
    			resultado = num1 - num2;
    			break;
    		case 3: //multiplicação
    			resultado = num1 * num2;
    			break;
    		case 4: //divisão
    			resultado = num1 / num2;
    			break;
    	}
    	return resultado;
    }
    
		/* A parte acima do código é a mais importante, ele define o funcionamento da calculadora, atribuindo a cada uma das
		 * variáveis a sua devida função.
		 */

    static boolean OperacaoExiste (short operacao) {
       	boolean retorno = true;
    	if (operacao > 4) {
       		System.out.println("ERRO: Operacao escolhida é inválida.\n");
       		retorno = false;
       	}
    	return retorno;
    }
    
    static boolean ValidaDadosDeEntrada (short operacao, double num1, double num2) {
    	boolean retorno = true; 
    	if (operacao == 4 & num2 == 0) {
        	 System.out.println("ERRO!!!: O Divisor não pode ser zero, por favor selecione outro número.\n");
        	 retorno = false;
        }
    	return retorno;
    }
    
		/* No código acima definimos algumas operações impossíveis para que a calculadora tenha uma margem de erro
		 * menor, e para evitar bugs no funcionamento dela.
		 */

    static String getNomeOperacao (short operacao) {
    	
    	switch (operacao) {
		case 1:
			return "adição";
		case 2:
			return "subtração";
		case 3: 
			return "multiplicação";
		case 4: 
			return "divisão";
    	default:
    		return "undefined";
    	}
    	
    }

	

}