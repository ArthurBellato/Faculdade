package com.mycompany.funcionarioo;

import javax.swing.JOptionPane;

//Superclasse
public class FuncionarioSalario extends bonusfuncionario {
    
    //atributos genericos
    private int quantFuncionarios;
    private String nome;
    private double semana1;
    private double semana2;
    private double semana3;
    private double salario4;
    private double salario;
    private String situacao;
    
    //Criação dos métodos get e set
   

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSemana1() {
        return semana1;
    }

    public void setSemana1(double semana1) {
        this.semana1 = semana1;
    }

    public double getSemana2() {
        return semana2;
    }

    public void setSemana2(double semana2) {
        this.semana2 = semana2;
    }

    public double getSemana3() {
        return semana3;
    }

    public void setSemana3(double semana3) {
        this.semana3 = semana3;
    }

    public double getSalario4() {
        return salario4;
    }

    public void setSalario4(double salario4) {
        this.salario4 = salario4;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
    
    
                public void calcularsalario(){
     
                    
                
       this.nome = (JOptionPane.showInputDialog("Digite o nome do Funcionário:"));
       this.semana1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o pagamento recebido na primeira semana"));
       this.semana2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o pagamento recebido na segunda semana:"));
       this.semana3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o pagamento recebido na terceira semana:"));
       this.salario4 = Double.parseDouble(JOptionPane.showInputDialog("Digite o pagamento recebido na quarta semana:"));
       
        setSalario((getSemana1() + getSemana2() + getSemana3() + getSalario4())/4);
    
        JOptionPane.showMessageDialog(null, "O pagamento semanal médio de " + getNome() + " é: " + getSalario());
                
    }
                
                //polimorfismo e sobrescrita
                //Condicionais if e else
                
    @Override
                public void situacaoFuncionario(){
                    
                    
                   if (salario>300){
                    
                    setSituacao("Salario dentro da média!");
                        JOptionPane.showMessageDialog(null, "O Funcionário tem um "+ getSituacao());
                        
                        
                }else {
                    
                    setSituacao("Salario abaixo da média!");
                        JOptionPane.showMessageDialog(null, "O Funcionário tem um "+ getSituacao());        
               
                        
            }        
                    
        }
}

                    
                    

                    

                
                
    


