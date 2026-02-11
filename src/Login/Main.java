package Login;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String login = "admin", senha = "admin";
        String loginUsuario, senhaUsuario;

        System.out.print("Login: ");
        loginUsuario = sc.nextLine();
        System.out.print("Senha: ");
        senhaUsuario = sc.nextLine();

        if (login.equals(loginUsuario) && senha.equals(senhaUsuario)) {
            System.out.println("Bem-vindo!");
        } else {
            System.out.println("Login ou senha incorretos!");
        }

        sc.close();
    }
}
