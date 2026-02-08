package SistemaAlunos;

import java.util.Locale;
import java.util.Scanner;

//Crie um sistema capaz de cadastrar 5 alunos com os seguintes dados:
//matricula, nome, sexo, ano de nascimento, mês de nascimento, status
//        (ativo ou inativo), nota01, nota02, nota03 e nota04. No final
//o sistema deve ser capaz de informar quantos alunos estão ativos e
//quantos estão inativos, bem como quantos passaram por média e
//quantos reprovaram. Imprima os dados dos alunos, calcule a idade, mostre
//a média de cada um. Faça algo completo.

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Aluno[] vetorAlunos = new Aluno[5];
        int status, quantAtivos = 0, quantInativos = 0;

        for (int i = 0; i < vetorAlunos.length; i++) {

            System.out.println("------------------------------------------------");
            System.out.println("-- DIGITE OS DADOS DO ALUNO " + (i + 1) + " --");

            System.out.print("Matrícula: ");
            int matricula = sc.nextInt();
            sc.nextLine();

            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Sexo (M/F): ");
            char sexo = sc.next().charAt(0);

            System.out.print("Mês de Nascimento: ");
            int mes = sc.nextInt();

            System.out.print("Ano de Nascimento: ");
            int ano = sc.nextInt();

            System.out.print("Status (1-Ativo/2-Inativo): ");
            status = sc.nextInt();

            vetorAlunos[i] = new Aluno(matricula, nome, sexo, mes, ano);

            System.out.println("------------------------------------------------");
            System.out.println("-- DIGITE AS NOTAS DO ALUNO " + (i + 1) + " --");
            System.out.print("Nota 01: ");
            vetorAlunos[i].nota1 = sc.nextDouble();
            System.out.print("Nota 02: ");
            vetorAlunos[i].nota2 = sc.nextDouble();
            System.out.print("Nota 03: ");
            vetorAlunos[i].nota3 = sc.nextDouble();
            System.out.print("Nota 04: ");
            vetorAlunos[i].nota4 = sc.nextDouble();

            if (status == 1) {
                quantAtivos = quantAtivostivos + 1;
            } else {
                quantInativos = quantInativos + 1;
            }
        }

        sc.close();
    }
}

