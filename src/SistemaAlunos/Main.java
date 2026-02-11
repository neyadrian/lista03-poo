package SistemaAlunos;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Aluno[] vetorAlunos = new Aluno[5];
        double vetorNotas[] = new double[5];

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
            double nota1 = sc.nextDouble();
            System.out.print("Nota 02: ");
            double nota2 = sc.nextDouble();
            System.out.print("Nota 03: ");
            double nota3 = sc.nextDouble();
            System.out.print("Nota 04: ");
            double nota4 = sc.nextDouble();

            vetorNotas[i] = vetorAlunos[i].mediaAluno(nota1, nota2, nota3, nota4);

            if (status == 1) {
                quantAtivos = quantAtivos + 1;
            } else {
                quantInativos = quantInativos + 1;
            }
        }


        System.out.println("------------------------------------------------");
        System.out.println("ALUNOS ATIVOS: " + quantAtivos);
        System.out.println("ALUNOS INATIVOS: " + quantInativos);


        for (int i = 0; i < vetorAlunos.length; i++) {
            System.out.println("------------------------------------------------");
            System.out.println("-- NOTAS DO ALUNO " + (i + 1) + " --");

            System.out.printf("%s com média: %.2f\n", vetorAlunos[i].nome, vetorNotas[i]);
        }

        sc.close();
    }
}

