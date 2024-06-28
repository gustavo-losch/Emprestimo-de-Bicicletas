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
                case 1:
                    Bicicleta bicicleta = new Bicicleta(123, "Caloi", 1);

                    Membro membro = new Membro("123","Gustavo", "Porto Alegre", bicicleta);
                    cadastroMembro.adicionaMembro(membro);
                break;
                case 2:

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
