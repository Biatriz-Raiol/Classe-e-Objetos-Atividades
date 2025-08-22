public class ProjetoAluno {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Bia Raiol", 20030, 9.0, 8.5);
        Aluno aluno2 = new Aluno("Isaura Silva", 20033, 7.0, 4.5);

        aluno1.mostrarDados();
        aluno2.mostrarDados();

        aluno2.setNotaAv2(7.0);

        aluno2.mostrarDados();
    }
}
