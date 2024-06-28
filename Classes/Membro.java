package Classes;
public class Membro {
    private String matricula;
    private String nome;
    private String cidade_origem;
    private Bicicleta bicicleta;
    
    public Membro(String matricula, String nome, String cidade_origem, Bicicleta dados_bicicleta){
        this.matricula = matricula;
        this.nome = nome;
        this.cidade_origem = cidade_origem;
        this.bicicleta = bicicleta;
    }

    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade_origem() {
        return cidade_origem;
    }
    public void setCidade_origem(String cidade_origem) {
        this.cidade_origem = cidade_origem;
    }

    public Bicicleta getDados_bicicleta() {
        return bicicleta;
    }

    public void setDados_bicicleta(Bicicleta bicicleta) {
        this.bicicleta = bicicleta;
    }

    public void imprimir(){
        System.out.println("Matricula: " + this.matricula);
        System.out.println("Nome: " + this.nome);
        System.out.println("Cidade: " + this.cidade_origem);
        System.out.println("Dados: " + this.bicicleta);
    }
}