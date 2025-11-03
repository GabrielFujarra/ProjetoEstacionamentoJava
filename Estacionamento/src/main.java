import pacote.Carro;
import pacote.Estacionamento;

import java.util.Scanner ;

public class main {

    public static void main (String[] args) {
        Estacionamento es = new Estacionamento();
        Scanner sc = new Scanner(System.in) ;

        System.out.println("Bem vindo ao Estacionamento !");

        while(true){
            System.out.println("1 - entrada do veiculo");
            System.out.println("2 - Saida do veiculo");
            System.out.println("3 - Listar veiculos");
            System.out.println("4 - Sair");
            int opcao ;
            System.out.println("Escolha uma opcao : ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1 :
                    es.entradaVeiculo();
                    break ;
                case 2 :
                    es.saidaVeiculo();
                    break ;
                case 3 :
                    es.listarVeiculos();
                    break ;
                case 4 :
                    System.out.println("Saindo do sistema");
                    return;
                default:
            }
        }

    }
}
