package Classes;
public class CadastroMembro {

    private Membro[] membros;
    private int proximoMembro;

    public CadastroMembro(){
        proximoMembro = 0;
        membros = new Membro[10];
    }

    //adiciona membro no vetor de objetos e retorna se a operação foi realizada ou não
    //revisar cadastro do objeto
    public boolean adicionaMembro(Membro membro){
        boolean operacao = false;
        if(proximoMembro < membros.length){
            membros[proximoMembro++] = membro;
            System.out.println(" ");
            System.out.println("Membro adicionado com sucesso!");
            return true;
        }
        else {
            System.out.println(" ");
            System.out.println("Cadastro de Membros Cheio.");
            return false;
        }
    }

    //busca membro no vetor de objetos e retorna o objeto referente ao membro
    //se não houver objeto, retorna objeto null
    public Membro buscaMembroPeloNome(String nome){
        for (Membro membro : membros) {
            if (membro.getNome().equalsIgnoreCase(nome)) {
                return membro;
            }
        }
        return null;
    }

    //busca membro no vetor de objetos pela matrícula e retorna o objeto referente ao membro
    public Membro buscaMembroPelaMatricula(String matricula){
        for (Membro membro : membros) {
            if (membro.getMatricula().equals(matricula)) {
                return membro;
            }
        }
        return null;
    }

    //imprime em tela as características dos membros presentes no vetor de objetos
    //para os membros que não existirem, retorna null
    public void mostraMembros(){
        for (int i = 0; i<proximoMembro; i++){
            if(proximoMembro < membros.length) {
                System.out.println(" ");
                System.out.println("--- Membro " + (i + 1) + " ---");
                System.out.println("Matricula: " + membros[i].getMatricula());
                System.out.println("Nome: " + membros[i].getNome());
                System.out.println("Cidade: " + membros[i].getCidade_origem());
                if (membros[i].getDados_bicicleta()!=null) {
                    System.out.println("Código da Bicicleta alugada: " + membros[i].getDados_bicicleta().getCodigo());
                }
                else {
                    System.out.println("O membro não possui bicicletas alugadas.");
                }
            }
        }
    }

    //exporta vetor para realizar operações fora da classe
    public Membro[] exportaVetor() {
        return membros;
    }
}
