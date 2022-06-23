package br.edu.iftm.javaempresax.testes;

import br.edu.iftm.javaempresax.classes.empregado;
import br.edu.iftm.javaempresax.classes.Departamento;
import br.edu.iftm.javaempresax.classes.Projeto;

import java.util.Date;
import java.util.Scanner;

public class principal {

    public static void main(String[] args) {

        /*empregado empregado01 = new empregado();
        empregado01.setCodEmp(1);
        empregado01.setNome("Mariana");
        empregado01.setSexo('F');

        Date dataInicio = new Date();

        Departamento d = new Departamento(1, "Pesquisa", 1, dataInicio);

        empregado01.setDepartamento(d);

        Projeto p = new Projeto(1, "Transmogrifador", d);

        System.out.println(empregado01);
        System.out.println(p);*/

        Scanner teclado = new Scanner(System.in);

        Projeto[] vetorDeProjeto = new Projeto[5];
        empregado[] vetorDeEmpregado = new empregado[10];
        Departamento[] vetorDeDepartamento = new Departamento[5];
        int countProjetos = 0;
        int countDepartamento = 0;
        int countempregado = 0;
        int cadastrar;

        int opcao = 0;
        do {
            System.out.println("""
                    
                    Menu
                    1 - Projeto
                    2 - Empregado
                    3 - Departamento
                    0 - Encerrar o programa
                    """);
            System.out.print("O que deseja visualizar ?");
            cadastrar = teclado.nextInt();

            switch (cadastrar) {

                // --- Projeto ---//
                case 1 -> {
                    System.out.println("""
                            
                            1 - Cadastrar Projetos
                            2 - Cadastrar Todos os Projetos
                            3 - Procurar Projeto por Código
                            """);
                    System.out.print("Digite uma opção:");
                    opcao = teclado.nextInt();
                    switch (opcao) {
                        case 1:
                            if (countProjetos < 5){
                                System.out.print("Digite o código do Projeto: ");
                                int codigo = teclado.nextInt();
                                System.out.print("Digite o nome do Proejto: ");
                                teclado.nextLine();
                                String nome = teclado.nextLine();
                                vetorDeProjeto[countProjetos] = new Projeto(codigo, nome, null);
                                countProjetos++;
                            }else {
                                System.out.println("Lista de projetos cheio.");
                            }
                            break;
                        case 2:
                            for (Projeto projeto : vetorDeProjeto) {
                                if (projeto != null){
                                    System.out.println(projeto);
                                }
                            }
                            break;
                        case 3:
                            System.out.print("Qual o código do proejto");
                            int cod = teclado.nextInt();
                            for (int i = 0; i < vetorDeProjeto.length; i++) {
                                if (vetorDeProjeto[i] != null) {
                                    if (vetorDeProjeto[i].getCodigo() == cod) {
                                        System.out.println(vetorDeProjeto[i]);
                                        i = vetorDeProjeto.length;
                                    }
                                }  else if (i == vetorDeProjeto.length - 1){
                                    System.out.println("Não há projetos com esse código. ");
                                }
                            }
                            break;
                    }
                }case 2 -> {
                    System.out.println("""
                            
                            1 - Cadastrar Empregado
                            2 - Imprimir todos os Empregados
                            """);
                    System.out.print("Digite uma opção: ");
                    opcao = teclado.nextInt();
                    switch (opcao) {
                        case 1:
                            if(countempregado < 10) {
                                System.out.print("Digite o código do Empregado: ");
                                int codigo = teclado.nextInt();
                                System.out.print("Digite o nome do Empregado: ");
                                teclado.nextLine();
                                String nome = teclado.nextLine();
                                System.out.print("Digite o endereço do Empregado: ");
                                String endereco = teclado.nextLine();
                                System.out.print("Digite o sexo do Empregado: ");
                                char sexo = teclado.next().charAt(0);
                                System.out.print("Digite o salário do Empregado: ");
                                double salario = teclado.nextDouble();
                                vetorDeEmpregado[countempregado] = new empregado(codigo, nome, new Date(), endereco, sexo, salario,countempregado + 1,countempregado + 1,null);
                                countempregado++;
                            }else {
                                System.out.print("A Lista de Empregados está cheia.");
                            }
                            break;
                        case 2:
                            for (empregado empregado : vetorDeEmpregado) {
                                if (empregado != null) {
                                    System.out.print(empregado);
                                }
                            }
                            break;

                    }
                }
                case 3 -> {
                    System.out.print("""
                            
                            1 - Cadastrar Departamento
                            2 - Imprimir todos os Departamentos
                            """);
                    System.out.print("Digite uma opção: ");
                    opcao = teclado.nextInt();
                    switch (opcao) {
                        case 1:
                            if (countDepartamento < 5){
                                System.out.print("Digite o código do Departamento: ");
                                int codigo = teclado.nextInt();
                                System.out.print("Digite o nome do Departamento: ");
                                teclado.nextLine();
                                String nome = teclado.nextLine();
                                System.out.print("Digite o código do departamento do Empregado: ");
                                int codDepto = teclado.nextInt();
                                vetorDeDepartamento[countDepartamento] = new Departamento(codigo, nome, codDepto, new Date());
                                countDepartamento++;
                            }else {
                                System.out.print("Lista de Departamentos está cheia. ");
                            }
                            break;
                        case 2:
                            for (Departamento departamento : vetorDeDepartamento){
                                if (departamento != null){
                                    System.out.print(departamento);
                                }
                            }
                            break;
                    }
                }
            }
        }while (opcao != 0);

        teclado.close();
    }
}