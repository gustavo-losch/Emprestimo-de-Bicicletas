package App;
import Classes.Bicicleta;
import Classes.CadastroBicicleta;
import Classes.CadastroMembro;
import Classes.Membro;

import java.util.Scanner;
public class Clube {
    public static void main(String[] args) {
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
            System.out.println(" 10 - Encerrar.");

            int opt = t.nextInt();
            switch (opt) {
                //indexar a objeto da bicicleta
                case 1:
                    System.out.println("__ Dados do Membro __ ");
                    t.nextLine();
                    System.out.printf("Digite a matrícula: ");
                    String matricula = t.nextLine();
                    System.out.printf("Digite o nome: ");
                    String nome = t.nextLine();
                    System.out.printf("Digite a cidade de origem: ");
                    String cidade_origem = t.nextLine();

                    System.out.printf("Digite o código da bicicleta: ");
                    int codigo_bicicleta = t.nextInt();
                    
                    Membro membro = new Membro(matricula, nome, cidade_origem, cadastroBicicleta.buscaBicicletaPeloModelo(codigo_bicicleta));
                    cadastroMembro.adicionaMembro(membro);
                break;
                case 2:
                    cadastroMembro.mostraMembros();
                break;

                //erro
                case 3:
                    System.out.printf("Digite o nome do membro: ");
                    System.out.println(" ");
                    String buscar_nome = t.nextLine();
                    cadastroMembro.buscaMembroPeloNome(buscar_nome).imprimir();

                break;

                case 4:
                    System.out.println("__ Dados da Bicicleta __ ");
                    System.out.printf("Digite o codigo: ");
                    int codigo = t.nextInt();
                    t.nextLine();
                    System.out.printf("Digite o modelo: ");
                    String modelo = t.nextLine();
                    System.out.printf("Digite a quantidade: ");
                    int quantidade = t.nextInt();
                    t.nextLine();
                    System.out.println(" ");

                    Bicicleta bicicleta = new Bicicleta(codigo, modelo, quantidade);
                    cadastroBicicleta.adicionaBicicleta(bicicleta);
                break;

                case 10:
                    System.out.println(" ");
                    System.out.println("Encerrando... Até a próxima :)");
                    stop = true;
                break;
            }
        } while(stop==false);
    }
}
