package Classes;
public class Bicicleta {
    private int codigo;
    private String modelo;
    private int quantidade;

    //construtor do objeto Bicicleta
    public Bicicleta(int codigo, String modelo, int quantidade){
        this.codigo = codigo;
        this.modelo = modelo;
        this.quantidade = quantidade;
    }

    //getters e setters
    public int getCodigo() { return codigo; }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
