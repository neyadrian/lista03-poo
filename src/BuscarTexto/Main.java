package BuscarTexto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String texto = "Para quem deseja se tornar um desenvolvedor é importantíssimo planejar a carreira e mirar nos objetivos certos. "
                + "Então que caminho seguir? qual linguagem de programação devo aprender? "
                + "O índice da TIOBE deve auxiliar vocês sobre o que deve estudar. "
                + "As duas primeiras posições são das linguagens JAVA e C, seguidas por C++ e C# - "
                + "Fonte: http://sejalivre.org/ranking-das-linguagens-de-programacao/";

        int op;

        do {
            System.out.println("\n----- MENU -----");
            System.out.println("1 - Buscar palavra (palavra comum)");
            System.out.println("2 - Buscar palavra (ignorando maíusculas e minúsculas)");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            op = sc.nextInt();
            sc.nextLine();

            switch (op) {

                case 1:
                    System.out.print("Digite a palavra ou frase para buscar: ");
                    String busca1 = sc.nextLine();

                    if (texto.contains(busca1)) {
                        System.out.println("Texto contém o termo informado.");
                    } else {
                        System.out.println("Texto não contém o termo informado.");
                    }
                    break;

                case 2:
                    System.out.print("Digite a palavra ou frase para buscar: ");
                    String busca2 = sc.nextLine();

                    if (texto.toLowerCase().contains(busca2.toLowerCase())) {
                        System.out.println("Texto contém o termo informado.");
                    } else {
                        System.out.println("Texto não contém o termo informado.");
                    }
                    break;

                case 3:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (op != 3);

        sc.close();
    }
}
