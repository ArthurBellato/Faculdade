/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.funcionarioo;

//Classe Média

import javax.swing.JOptionPane;

public class Funcionarioo {

    public static void main(String[] args) {
        
        int i = 1;
        int quantFuncionarios;
        
        
        
        FuncionarioSalario n = new FuncionarioSalario();
        bonusfuncionario f = new bonusfuncionario();
       
        
        quantFuncionarios = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de Funcionários"));
        
        //Estrutura de repetição
        do{
                    
                  n.calcularsalario();
                  n.situacaoFuncionario();
                  f.bonus();
                  f.situacaoFuncionario();
            
                  i++;
                          
                    }while (i<=quantFuncionarios);
                        
                    
    
    
    }
}
