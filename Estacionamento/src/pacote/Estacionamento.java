package pacote;

import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Estacionamento{
    Scanner sc = new Scanner(System.in) ;
    public final double precoInicial = 10 ;
    public final int quantidadeVagas = 15 ;
    Duration carencia = Duration.ofMinutes(1);
    public final double precoMinuto = 0.50 ;

    List<Carro> carros ;

    public Estacionamento(){
        this.carros = new ArrayList<>();

    }

    public void entradaVeiculo () {
        if (carros.size()>= quantidadeVagas){
            System.out.println("Sem vagas no momento");
        }else {
            System.out.println("Digite a placa do seu carro");
            String placa = sc.next() ;
            carros.add(new Carro(placa)) ;
        }
    }

    public double calcularPagamento (LocalTime entrada, LocalTime saida) {
        Duration tempoPermanencia = Duration.between(entrada , saida);
        long minutosTotais = tempoPermanencia.toMinutes();
        Duration tempoCobravel = tempoPermanencia.minus(carencia) ;

        if (tempoCobravel.isNegative() || tempoCobravel.isZero()){
            System.out.println("Saida Gratuita : Você permaneceu " + tempoPermanencia.toMinutes());
            return 0.0 ;
        }else {
            long minutosCobravel = tempoCobravel.toMinutes();
            double custoMinuto = ((double)minutosCobravel)*precoMinuto;
            double cobranca = precoInicial + custoMinuto ;
            return cobranca ;
        }

    }

    public void saidaVeiculo () {

        System.out.println("Digite a placa do carro : ");
        String placaDigitada = sc.next();

        if (carros.size() == 0){
            System.out.println("Não contem carros cadastrados");
            return ;
        }
         for (int i = 0 ; i<carros.size() ; i++){
             var carroEncontrado = carros.get(i);

             if (carroEncontrado.getPlaca().equals(placaDigitada)){
                 carroEncontrado.saida = LocalTime.now();
                 double valorPagar = calcularPagamento(carroEncontrado.entrada,carroEncontrado.saida);
                 System.out.println("Valor a pagar : " + valorPagar);
                 carros.remove(i);
                 return;
             }
         }

    }

    public void listarVeiculos () {

        if (carros.size() == 0){
            System.out.println("Nenhum carro cadastrado");
        }else {
            for (int i = 0 ; i< carros.size() ; i++){
                System.out.println(carros.get(i));
            }
        }
    }
}
