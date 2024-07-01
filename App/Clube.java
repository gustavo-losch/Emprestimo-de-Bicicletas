package App;
import Classes.Bicicleta;
import Classes.CadastroBicicleta;
import Classes.CadastroMembro;
import Classes.Membro;

import java.util.Scanner;
public class Clube {
    public static void main(String[] args) {
        //criação dos vetores de objetos nos objetos CadastroMembro e CadastroBicicleta
        CadastroMembro cadastroMembro = new CadastroMembro();
        CadastroBicicleta cadastroBicicleta = new CadastroBicicleta();

        Menu(cadastroMembro, cadastroBicicleta);
    }

    //método de menu de opções com estrutura de repetição
    public static void Menu(CadastroMembro cadastroMembro, CadastroBicicleta cadastroBicicleta){
        Scanner t = new Scanner(System.in);
        boolean stop = false;
        do {
            System.out.println(" ");
            System.out.println("--- EMPRÉSTIMO DE BICICLETAS ---");
            System.out.println("    Digite o valor da opção:");
            System.out.println(" 1 - Incluir membro.");
            System.out.println(" 2 - Mostrar membros.");
            System.out.println(" 3 - Buscar membro por nome.");
            System.out.println(" 4 - Inserir bicicleta.");
            System.out.println(" 5 - Mostrar bicicletas.");
            System.out.println(" 6 - Buscar bicicleta por código.");
            System.out.println(" 7 - Emprestar bicicleta.");
            System.out.println(" 8 - Devolver bicicleta.");
            System.out.println(" 9 - Quantidade de bicicletas disponíveis.");
            System.out.println(" 10 - Encerrar.");

            int opt = t.nextInt();
            switch (opt) {
                //insere membro e indexa um objeto Bicicleta ao Membro
                case 1:
                    t.nextLine(); //linhas utilizadas para limpar o scanner (tivemos esse erro várias vezes)
                    System.out.println(" ");
                    System.out.println("__ Dados do Membro __ ");
                    System.out.print("Digite a matrícula: ");
                    String matricula = t.nextLine();
                    System.out.print("Digite o nome: ");
                    String nome = t.nextLine();
                    System.out.print("Digite a cidade de origem: ");
                    String cidade_origem = t.nextLine();

                    Membro membro = new Membro(matricula, nome, cidade_origem, null);
                    cadastroMembro.adicionaMembro(membro);
                break;

                //imprime os membros presentes em cadastroMembro
                case 2:
                    cadastroMembro.mostraMembros();
                break;

                //busca o membro com base no nome indicado
                case 3:
                    t.nextLine();
                    System.out.println(" ");
                    System.out.println("__ Busca Membro (nome) __ ");
                    System.out.print("Digite o nome do membro: ");
                    System.out.println(" ");
                    String buscar_nome = t.nextLine();
                    try {
                        cadastroMembro.buscaMembroPeloNome(buscar_nome).imprimir();
                    }
                    catch (NullPointerException e) {
                        System.out.println("Não existem membros cadastrados com esse nome.");
                    }

                break;

                //insere bicicleta no vetor de objetos bicicletas
                case 4:
                    System.out.println(" ");
                    System.out.println("__ Dados da Bicicleta __ ");
                    System.out.print("Digite o codigo: ");
                    int codigo = t.nextInt();
                    t.nextLine();
                    System.out.print("Digite o modelo: ");
                    String modelo = t.nextLine();
                    System.out.print("Digite a quantidade: ");
                    int quantidade = t.nextInt();
                    t.nextLine();
                    System.out.println(" ");

                    Bicicleta bicicleta = new Bicicleta(codigo, modelo, quantidade);
                    cadastroBicicleta.adicionaBicicleta(bicicleta);
                break;

                //imprime bicicletas presentes no vetor de cadastroBicicleta
                case 5:
                    cadastroBicicleta.mostraBicicletas();
                break;

                //busca bicicleta com base no código indicado
                case 6:
                    t.nextLine();
                    System.out.println(" ");
                    System.out.println("__ Busca Bicicleta (modelo) __ ");
                    System.out.print("Digite o código da bicicleta: ");
                    System.out.println(" ");
                    int buscar_codigo = t.nextInt();
                    try {
                        cadastroBicicleta.buscaBicicletaPeloCodigo(buscar_codigo).imprimir();
                    }
                    catch (NullPointerException e) {
                        System.out.println("Não existem bicicletas cadastradas com esse código.");
                    }
                break;

                //empresta a bicicleta com base nas bicicletas cadastradas
                case 7:
                    t.nextLine();
                    System.out.println(" ");
                    System.out.println("__ Empréstimo de Bicicletas __ ");
                    if(contadorBicicletasDisponiveis(cadastroBicicleta,cadastroMembro)>0) {
                        System.out.print("Matrícula do Membro: ");
                        String matricula_emprestimo = t.nextLine();
                        System.out.print("Código da Bicicleta: ");
                        int codigo_emprestimo = t.nextInt();

                        Bicicleta bicicleta_emprestada = cadastroBicicleta.buscaBicicletaPeloCodigo(codigo_emprestimo);
                        cadastroMembro.buscaMembroPelaMatricula(matricula_emprestimo).setDados_bicicleta(bicicleta_emprestada);

                        System.out.println(" ");
                        System.out.println("Bicicleta emprestada com sucesso!");
                    }
                    else {
                        System.out.println(" ");
                        System.out.println("Não há bicicletas disponíveis.");
                    }
                break;

                //remove a bicicleta do usuário, sobreescrevendo a bicicleta existente como null
                case 8:
                    t.nextLine();
                    System.out.println(" ");
                    System.out.println("__ Devolução de Bicicletas __ ");
                    System.out.print("Matrícula do Membro: ");
                    String matricula_devolucao = t.nextLine();

                    cadastroMembro.buscaMembroPelaMatricula(matricula_devolucao).setDados_bicicleta(null);

                    System.out.println(" ");
                    System.out.println("Bicicleta devolvida com sucesso!");
                break;

                //mostra a quantidade de bicicletas disponíveis para empréstimo (não vinculadas a membros)
                case 9:
                    System.out.println(" ");
                    System.out.println("__ Bicicletas Disponíveis __ ");
                    //método para calcular a quantidade de bicicletas disponíveis
                    System.out.println("Existem "+contadorBicicletasDisponiveis(cadastroBicicleta, cadastroMembro)+" bicicletas disponíveis.");
                break;

                //encerramento do sistema
                case 10:
                    System.out.println(" ");
                    System.out.println("Encerrando... Até a próxima :)");
                    stop = true;
                break;
            }
        } while(stop==false);
    }

    public static int contadorBicicletasDisponiveis(CadastroBicicleta cadastroBicicleta, CadastroMembro cadastroMembro){
        int qtd_bicicletas_utilizadas = 0;
        int qtd_bicicletas_existentes = 0;

        //recebe os vetores de membors e bicicletas
        Bicicleta bicicletas_existentes[] = cadastroBicicleta.exportaVetor();
        Membro membros_existentes[] = cadastroMembro.exportaVetor();

        //contadores de bicicletas utilizadas e bicicletas existentes
        //estrutura de repetição encadeada para que todos os elementos dos dois vetores sejam comparados se não forem nulos
        for (int i=0; i<10; i++){
            for(int j=0; j<10; j++){
                if(bicicletas_existentes[j]!=null && membros_existentes[i]!=null && membros_existentes[i].getDados_bicicleta()!=null) {
                    if (bicicletas_existentes[j].getCodigo() == membros_existentes[i].getDados_bicicleta().getCodigo()) {
                        qtd_bicicletas_utilizadas++;
                    }
                }
            }
            if(bicicletas_existentes[i]!=null){
                qtd_bicicletas_existentes++;
            }
        }

        //cálculo de bicicletas disponíveis
        int qtd_bicicletas_disponiveis = qtd_bicicletas_existentes - qtd_bicicletas_utilizadas;
        return qtd_bicicletas_disponiveis;
    }
}
