public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");


        usuario Usuario = new usuario("Ana Lívia Távora", "analiviatavora1081@gmail.com");

        livro Livro = new livro(50, "Ellie Morgan", "love in the dark");

        System.out.println("Usuario: "+usuario.getNome());
        System.out.println("Livro: "+usuario.getLivro());
        System.out.println("Emprestimo: "+usuario.getDiasematraso());
        System.out.println("Resumo: "+usuario.getresumo());
        System.out.println("total" +(emprestimo.getValordamulta));
    }
}