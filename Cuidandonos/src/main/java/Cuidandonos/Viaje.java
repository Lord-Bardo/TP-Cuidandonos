package Cuidandonos;

import java.util.List;

public class Viaje {
    private Ubicacion direccionOrigen;
    private List<Parada> paradas;
    private IAdapter calculador;

    public double calcularTiempoViajeTotal(){
        double demoras = this.calcularDemora();
        double distanciaTotal = calculador.calcularDistanciaViajeTotal(direccionOrigen,paradas);
        return (distanciaTotal / 72) + demoras;   //72 metros x min es la velocidad promedio de una persona caminando, consideramos "distanciaTotal/72" como la demora de las paradas que no tienen una demora especificada (tiempo que se tarda en llegar de una a la otra)
    }
    private double calcularDemora(){
        return 0 + paradas.stream().filter(parada->parada.tieneDemora())
                .mapToDouble(parada->parada.getDemora())
                .sum();
    }
}

