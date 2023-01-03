
package com.mycompany.funcionarioo;

import javax.swing.JOptionPane;



//Conceito de herança = subclasse
public class bonusfuncionario{
    
    
    //atributos específicos
    private int quantobonus;

    
    //Criação dos métodos get e set
    
    public int getQuantobonus() {
        return quantobonus;
    }

    public void setQuantobonus(int quantobonus) {
        this.quantobonus = quantobonus;
    }
    
    
    public void bonus(){
    
     this.quantobonus = (Integer.parseInt(JOptionPane.showInputDialog("Digite o bônus por horas extras no mês: ")));
        
    }
   
    public void situacaoFuncionario() {
        if (getQuantobonus()>=300){
                        JOptionPane.showMessageDialog(null, "O Funcionário tem um bônus mensal alto");
                        
                        
                }else {
                        JOptionPane.showMessageDialog(null, "O Funcionário tem um bônus mensal baixo!");        
               
                        
            }        
        
    } 
            
}
