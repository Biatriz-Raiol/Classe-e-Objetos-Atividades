public class Aluno {
     String nome;
     int matricula;
     double nota1ava;
     double nota2ava;

    public Aluno(String nome, int matricula, double nota1ava, double notaAv2) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota1ava = nota1ava;
        this.nota2ava = nota2ava;
    }

    public void mostrarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nota AV1: " + nota1ava);
        System.out.println("Nota AV2: " + nota2ava);
        System.out.println("Média: " + calcularMedia());
        System.out.println("Situação: " + verificarAprovacao());
    }

    public double calcularMedia() {
        return (nota1ava + nota2ava) / 2.0;
    }

    public String verificarAprovacao() {
        if (calcularMedia() >= 7) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }

    public void setNotaAv1(double nota1ava) {
        this.nota1ava = nota1ava;
    }

    public void setNotaAv2(double nota2ava) {
        this.nota2ava = nota2ava;
    }
}
