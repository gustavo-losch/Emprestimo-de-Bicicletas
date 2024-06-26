package Classes;
public class CadastroMembro {
    
    public CadastroMembro(){
        Membro[] membros = new Membro[10];
    }

    //adiciona membro no vetor de objetos e retorna se a operação foi realizada ou não
    //revisar cadastro do objeto
    public static boolean adicionaMembro(Membro[] membros){
        boolean operacao = false;
        for (int i = 0; i<membros.length; i++){
            if(membros[i]==null){
                membros[i] = new Membro(null, null, null, null);
                operacao = true;
            }
        }
        if(operacao==true) return true;
        else return false;
    }

    //busca membro no vetor de objetos e retorna o objeto referente ao membro
    //se não houver objeto, retorna objeto null
    public static Membro buscaMembroPeloNome(String nome, Membro[] membros){
        Membro vazio = new Membro(null, null, null, null);
        for (int i = 0; i<membros.length; i++){
            if (membros[i].getNome().equalsIgnoreCase(nome)){
                return membros[i];
            }
        }
        return vazio;
    }

    //imprime em tela as características dos membros presentes no vetor de objetos
    //para os membros que não existirem, retorna null
    public static void mostraMembros(Membro[] membros){
        for(int i = 0; i<membros.length; i++){
            System.out.println(" ");
            System.out.println("--- Membro "+i+" ---");
            System.out.println("Matricula: "+membros[i].getMatricula());
            System.out.println("Nome: "+membros[i].getNome());
            System.out.println("Cidade: "+membros[i].getCidade_origem());
            System.out.println("Dados Bicicleta: "+membros[i].getDados_bicicleta());
        }
    }
}
