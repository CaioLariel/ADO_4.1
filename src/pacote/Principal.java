/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pacote;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Aluno a1 = new Aluno();
        Professor p1 = new Professor();
        Funcionario f1 = new Funcionario();
        Scanner text = new Scanner(System.in);
        Scanner number = new Scanner(System.in);
        Scanner ender = new Scanner(System.in);

        ArrayList<String> lista = new ArrayList<String>();
        System.out.println("\t Bem vindo ao cadastro! \n");

        //inicio sistema
        System.out.println("Você deseja cadastrar um aluno?\n[0]- não\n[1] - sim");
        int escolhaAluno = number.nextInt();
        if (escolhaAluno == 1) {
            System.out.println("Quantos alunos você deseja cadastrar? :");
            int qntdAluno = number.nextInt();
            for (int i = 0; i < qntdAluno; i++) {
                System.out.println("digite o nome do aluno :\n");
                a1.setNome(text.nextLine());
                System.out.println("-----------------------------------------------------");

                System.out.println("digite o rg do aluno :\n");
                a1.setRg(text.nextLine());
                System.out.println("-----------------------------------------------------");

                System.out.println("digite o cpf do aluno :\n");
                a1.setCpf(text.nextLine());
                System.out.println("-----------------------------------------------------");

                System.out.println("digite o registro do aluno do aluno :\n");
                a1.setRegistroAluno(number.nextInt());
                System.out.println("-----------------------------------------------------");

                System.out.println("digite a nota do vestibular do aluno :\n");
                a1.setNotaVestibular(number.nextFloat());
                System.out.println("-----------------------------------------------------");

                System.out.println("digite o curso do aluno :\n");
                a1.setCurso(text.nextLine());
                System.out.println("-----------------------------------------------------");

                System.out.println("digite a data matricula do aluno :\n");
                a1.setDataMatricula(text.nextLine());

                System.out.println("-----------------------------------------------------");

                System.out.println("digite o endereço do aluno :\n");
                a1.setEndereco(ender.nextLine());

                lista.add(a1.retornaDadosAluno());
            }
        }
        System.out.println("Você deseja cadastrar um professor?\n[0]- não\n[1] - sim");
        int escolhaProfessor = number.nextInt();
        if (escolhaProfessor == 1) {
            System.out.println("Quantos professores você deseja cadastrar? :");
            int qntdProfessor = number.nextInt();
            for (int i = 0; i < qntdProfessor; i++) {
                System.out.println("digite o nome do professor :\n");
                p1.setNome(text.nextLine());
                System.out.println("-----------------------------------------------------");

                System.out.println("digite o rg do professor :\n");
                p1.setRg(text.nextLine());
                System.out.println("-----------------------------------------------------");

                System.out.println("digite o cpf do professor :\n");
                p1.setCpf(text.nextLine());
                System.out.println("-----------------------------------------------------");

                System.out.println("digite a matricula do professor :\n");
                p1.setMatriculaProfessor(number.nextInt());
                System.out.println("-----------------------------------------------------");

                System.out.println("digite a data admissao do professor :\n");
                p1.setDataAdmissao(text.nextLine());
                System.out.println("-----------------------------------------------------");

                System.out.println("digite o salario horista do professor :\n");
                p1.setSalarioHorista(number.nextDouble());

                System.out.println("-----------------------------------------------------");
                System.out.println("digite o endereço do professor :\n");
                p1.setEndereco(ender.nextLine());

                lista.add(p1.retornaDadosProfessor());
            }
        }
        System.out.println("Você deseja cadastrar um Funcionario?\n[0]- não\n[1] - sim");
        int escolhaFuncionario = number.nextInt();
        if (escolhaFuncionario == 1) {
            System.out.println("Quantos funcionarios você deseja cadastrar? :");
            int qntdFuncionario = number.nextInt();
            for (int i = 0; i < qntdFuncionario; i++) {
                System.out.println("digite o nome do funcionario :\n");
                f1.setNome(text.nextLine());
                System.out.println("-----------------------------------------------------");

                System.out.println("digite o rg do funcionario :\n");
                f1.setRg(text.nextLine());
                System.out.println("-----------------------------------------------------");

                System.out.println("digite o cpf do funcionario :\n");
                f1.setCpf(text.nextLine());
                System.out.println("-----------------------------------------------------");

                System.out.println("digite o endereço do funcionario :\n");
                f1.setEndereco(ender.nextLine());
                System.out.println("-----------------------------------------------------");

                System.out.println("digite a data da admissão do funcionario :\n");
                f1.setDataAdmissao(text.nextLine());
                System.out.println("-----------------------------------------------------");

                System.out.println("digite a matricula do funcionario do funcionario :\n");
                f1.setMatriculaFuncionario(text.nextInt());
                System.out.println("-----------------------------------------------------");

                System.out.println("digite o salario mensal do funcionario :\n");
                f1.setSalarioMensal(ender.nextDouble());
                System.out.println("-----------------------------------------------------");
            }
        }
        for(String i: lista){
        System.out.println(i);
    }
        text.close();
        number.close();
        ender.close();
    }

}
