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

        for (int i = 0; i < vetorAlunos.length; i++) {

            System.out.println("-- DIGITE OS DADOS DO ALUNO " + (i + 1) + " --");

            vetorAlunos[i] = new Aluno(); // cria o objeto

            System.out.print("Matrícula: ");
            vetorAlunos[i].matricula = sc.nextInt();
            sc.nextLine();

            System.out.print("Nome: ");
            vetorAlunos[i].nome = sc.nextLine();

            System.out.print("Sexo (M/F): ");
            vetorAlunos[i].sexo = sc.next().charAt(0);

            System.out.print("Mês de Nascimento: ");
            vetorAlunos[i].mesNascimento = sc.nextInt();

            System.out.print("Ano de Nascimento: ");
            vetorAlunos[i].anoNascimento = sc.nextInt();
        }

        sc.close();
    }
}

