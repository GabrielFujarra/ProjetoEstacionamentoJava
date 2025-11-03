package pacote;
import java.time.LocalTime ;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner ;
import java.time.Duration ;


public class Carro {
    private String placa ;

    public String getPlaca() {
        return placa;
    }

    public LocalTime entrada ;
    public LocalTime saida ;

    public Carro(String placa){
        this.placa = placa ;
        this.entrada = LocalTime.now();
    }

    @Override
    public String toString() {
        return "Carro - Placa: " + this.placa + ", Entrada: " + this.entrada.toString();
    }

}

