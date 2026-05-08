public class livro {

    private String titulo;
    private String autor;
    private int valordamulta;

    public livro(String titulo, int valordamulta, String autor) {
        this.titulo = titulo;
        this.valordamulta = valordamulta;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getValordamulta() {
        return valordamulta;
    }

    public void setValordamulta(int valordamulta) {
        this.valordamulta = valordamulta;
    }

    public String exibirdetalhes() {
        return "titulo:" + this.titulo + "Autor:" + this.autor + "Multa:" + this.valordamulta;
    }

    public String aplicarmulta(double percentual) {
        valor = valor - (percentual * valordamulta());
    }


}
