public class usuario {

    private String nome;
    private String email;

    public usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String exibirdetalhes(){
        return "Nome:" + this.nome + "Email:" + this.email ;
    }
}
