import java.util.Scanner;

public class TrabalhoTopicosEspeciais {
    
    public static void main(String[] args) throws Exception{


        System.out.println("Trabalho Topicos Especiais"); {
            System.out.println("Digite o nome do aluno ou exit para sair: ");
            Scanner leitor = new Scanner(System.in);
            String nomealuno;
            leitor.useDelimiter("[\r\n]+");
            nomealuno = leitor.nextLine();
            while (! nomealuno.equals("exit")) {    



/* Nessa parte do código, o elemento de repetição: "while" foi usado de forma básica na intenção de
 executar um ciclo, usando as variáveis de String para a obtenção de valores  */


                     System.out.println("Insira a nota do primeiro trimestre de:" +nomealuno); {
                
                    Float notaumFloat;
                    Scanner leitorum = new Scanner(System.in);
                    leitor.useDelimiter("[\r\n]+");{
                    notaumFloat = leitor.nextFloat();
                    }
        
        
                    if (notaumFloat < 0 || notaumFloat > 10 ) {
        
                        System.out.println("Valor inválido!");
                        break;
                    } else {
                        System.out.format("A primeira nota de %s no trimestre foi:", nomealuno);{
                            System.out.println(+notaumFloat);
                     
                            System.out.println("Insira a segunda nota do trimestre de " +nomealuno);
                        }
                    }                



 /* Nessa parte do código, o comando "break" foi usado junto com o "while" para finalizar
         a execução caso o valor fosse inválido*/



                        Float notadoisFloat;
                        Scanner leitordois = new Scanner(System.in); {
                        notadoisFloat = leitordois.nextFloat();
            
                        if (notadoisFloat < 0 || notadoisFloat > 10 ) {
                            System.out.println("Valor inválido!");
                            break;
                        } else {
                            System.out.format("A segunda nota de %s no trimestre de foi:", nomealuno);
                            System.out.println(notadoisFloat);
                        }
                        


        /* Os valores inseridos pelo usuário são guardados no sistema */


                        
                        System.out.println("Insira a terceira nota no trimestre de " +nomealuno);
                    
                    Float notatresFloat;
                    Scanner leitortres = new Scanner(System.in); {
                    notatresFloat = leitortres.nextFloat();
        
                    if (notatresFloat < 0 || notatresFloat > 10 ) {
                        System.out.println("Valor inválido!");
                        break;
                    } else {
                        System.out.format("A terceira nota de %s no trimestre foi:", nomealuno);
                        System.out.println(notatresFloat);
                    }
        
        
                        System.out.format("A nota final de %s foi:", nomealuno);
                        Float notafinFloat = (notatresFloat + notadoisFloat + notaumFloat);
                        System.out.println(notafinFloat);
        


        /* Os valores armazenados são usados em uma soma, onde é feita uma média com as tês notas
          do aluno para ver se ele conseguiu passar de ano pelas notas*/

                        

                     if (notafinFloat < 15 ) {
                        System.out.format("%s está reprovado!\n", nomealuno);
                     } else if (notafinFloat > 18 ) {
                        System.out.format("%s está aprovado!\n", nomealuno);
                     } else if (notafinFloat >= 15 || notafinFloat <= 18 ) 
                            System.out.format("%s está de recuperação final!\n", nomealuno);               
                    }
                        System.out.format("Insira a quantidade de faltas de %s no trimestre:\n", nomealuno);
                        Float faltas;
                    Scanner faltScanner = new Scanner(System.in);
                    leitor.useDelimiter("[\r\n]+");{
                    faltas = leitor.nextFloat();
                    System.out.format("As faltas de %s no trimestre foram de:", nomealuno);{
                        System.out.println(+faltas);
                        if (faltas > 5) {
                            System.out.println("O aluno está reprovado por faltas!\n");
                        }else if (faltas <= 5)
                            System.out.println("O aluno está com a presença em dia!");                   
                            break;


        /* O sistema de if e else if também foi ultilizado na contagem de faltas para a aprovação
         do aluno no ano letivo */ 



            } 
        } 
        
} 
            } 
            
        } System.out.println("Fim da execução");
            
    }
}
    }

