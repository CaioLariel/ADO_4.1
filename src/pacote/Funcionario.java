/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pacote;

/**
 *
 * @author clima
 */
public class Funcionario extends Pessoa {

    private String dataAdmissao;
    private int matriculaFuncionario;
    private double salarioMensal;
    
    public String retornaDadosFuncionario(){
        String dados ;
        
        dados = super.retornaDados();
                
        dados += "Data da admissao.: " + getDataAdmissao() + "\n";
        dados += "Matricula do Funcionario: " + getMatriculaFuncionario() + "\n";
        dados += "Salario mensal: " + getSalarioMensal() + "\n";
        return dados;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public int getMatriculaFuncionario() {
        return matriculaFuncionario;
    }

    public void setMatriculaFuncionario(int matriculaFuncionario) {
        this.matriculaFuncionario = matriculaFuncionario;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }

}
