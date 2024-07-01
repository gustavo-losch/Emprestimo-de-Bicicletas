package Classes;
public class CadastroBicicleta {

    private Bicicleta[] bicicletas;
    private int proximaBicicleta;

    public CadastroBicicleta() {
        proximaBicicleta = 0;
        bicicletas = new Bicicleta[10];
    }

    //adiciona bicicleta no vetor de objetos e retorna se a operação foi realizada ou não
    //revisar cadastro do objeto
    public boolean adicionaBicicleta(Bicicleta bicicleta){
        if(proximaBicicleta < bicicletas.length){
            bicicletas[proximaBicicleta++] = bicicleta;
            System.out.println(" ");
            System.out.println("Bicicleta adicionada com sucesso!");
            return true;
        }
        else {
            System.out.println(" ");
            System.out.println("Cadastro de Bicicletas Cheio.");
            return false;
        }
    }

    //busca bicicleta no vetor de objetos e retorna o objeto referente à bicicleta
    //se não houver objeto, retorna objeto vazio
    public Bicicleta buscaBicicletaPeloCodigo(int codigo){
        Bicicleta vazio = new Bicicleta(0, null, 0);
        for (Bicicleta bicicleta : bicicletas) {
            if (bicicleta.getCodigo() == codigo) {
                return bicicleta;
            }
        }
        return vazio;
    }

    //imprime em tela as características das bicicletas presentes no vetor de objetos
    //para as bicicletas que não existirem, retorna null
    public void mostraBicicletas(){
        for(int i = 0; i<proximaBicicleta; i++){
            System.out.println(" ");
            System.out.println("--- Bicicleta "+(i+1)+" ---");
            System.out.println("Código: "+bicicletas[i].getCodigo());
            System.out.println("Modelo: "+bicicletas[i].getModelo());
            System.out.println("Quantidade: "+bicicletas[i].getQuantidade());
        }
    }

    public Bicicleta[] exportaVetor(){
        return bicicletas;
    }

}
