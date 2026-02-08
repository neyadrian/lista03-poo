package SistemaAlunos;

public class Aluno {

    public int matricula;
    public String nome;
    public char sexo;
    public int mesNascimento;
    public int anoNascimento;
    public int status;

    public double nota1;
    public double nota2;
    public double nota3;
    public double nota4;

    public Aluno (int matricula, String nome, char sexo, int mesNascimento, int anoNascimento, int status) {
        this.matricula = matricula;
        this.nome = nome;
        this.sexo = sexo;
        this.mesNascimento = mesNascimento;
        this.anoNascimento = anoNascimento;
        this.status = status;
    }

    public double mediaAluno (double nota1, double nota2, double nota3, double nota4) {
        return (nota1 + nota2 + nota3 + nota4) / 4.0;
    }
}
