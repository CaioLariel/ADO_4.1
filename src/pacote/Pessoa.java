/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pacote;

public class Pessoa {
    private String nome;
    private String rg;
    private String cpf;
    private String endereco;
    
    public String retornaDados(){
        String dados = "";
                
        dados += "Nome: " + getNome() + "\n";
        dados += "RG: " + getRg() + "\n";
        dados += "CPF: " + getCpf() + "\n";
        dados += "endereco: " + getEndereco() + "\n";

        return dados;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    
}

