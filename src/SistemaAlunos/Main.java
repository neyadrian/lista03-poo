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

        String vetorAlunos[] = new String[5];

        for (int i = 0; i < vetorAlunos.length; i++) {


            System.out.println("-- DIGITE OS DADOS DO ALUNO " + i + 1 + " --");
            System.out.print("Matrícula: ");
            int matricula = sc.nextInt();
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Sexo (M/F): ");
            char sexo = sc.next().charAt(0);
            System.out.print("Mes de Nascimento: ");
            int mesNascimento = sc.nextInt();
            System.out.print("Ano de Nascimento: ");
            int anoNascimento = sc.nextInt();

            Aluno[] aluno = new Aluno[5];
        }




        sc.close();
    }
}
