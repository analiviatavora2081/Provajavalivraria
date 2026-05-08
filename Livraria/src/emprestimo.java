public class emprestimo {


    private String usuario;
    private String livro;
    private int diasematraso;

    public emprestimo(String usuario, String livro, int diasematraso) {
        this.usuario = usuario;
        this.livro = livro;
        this.diasematraso = diasematraso;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public int getDiasematraso() {
        return diasematraso;
    }

    public void setDiasematraso(int diasematraso) {
        this.diasematraso = diasematraso;
    }

    public String getLivro() {
        return livro;
    }

    public void setLivro(String livro) {
        this.livro = livro;
    }



    public String exibirdetalhes(){
        return "Nome do livro:" + this.livro + "Nome do usuario:" + this.usuario +"Dias em atraso:" + this.diasematraso ;
    }
}
