public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        Calcular calcular = new Calcular();

        int[] notasAprovado = {7, 7, 7, 7, 7};

        int[] notasRecuperacao = {6, 6, 4, 5, 5};

        int[] notasReprovado = {4, 3, 2, 1, 0};

        aluno.setNome("Carlos");
        aluno.setNota(notasAprovado);

        int media = calcular.calcularMedia(aluno.getNota());


        if (media >= 7) {
            System.out.println("O aluno " + aluno.getNome() + " está aprovado");
        }else if (media >= 5) {
            System.out.println("O aluno " + aluno.getNome() + " está de recuperação");
        }else {
            System.out.println("O aluno " + aluno.getNome() + " está reprovado");
        }


    }
}