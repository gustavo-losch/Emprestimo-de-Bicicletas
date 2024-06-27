package Classes;
public class CadastroBicicleta {
    
    public CadastroBicicleta() {
        Bicicleta[] bicicletas = new Bicicleta[10];
    }

    //adiciona bicicleta no vetor de objetos e retorna se a operação foi realizada ou não
    //revisar cadastro do objeto
    public static boolean adicionaBicicleta(Bicicleta[] bicicletas){
        boolean operacao = false;
        for (int i = 0; i<bicicletas.length; i++){
            if(bicicletas[i]==null){
                bicicletas[i] = new Bicicleta(0, null, 0);
                operacao = true;
            }
        }
        return operacao;
    }

    //busca bicicleta no vetor de objetos e retorna o objeto referente à bicicleta
    //se não houver objeto, retorna objeto vazio
    public static Bicicleta buscaMembroPeloNome(int codigo, Bicicleta[] bicicletas){
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
    public static void mostraBicicletas(Bicicleta[] bicicletas){
        for(int i = 0; i<bicicletas.length; i++){
            System.out.println(" ");
            System.out.println("--- Membro "+i+" ---");
            System.out.println("Código: "+bicicletas[i].getCodigo());
            System.out.println("Modelo: "+bicicletas[i].getModelo());
            System.out.println("Quantidade: "+bicicletas[i].getQuantidade());
        }
    }

}
