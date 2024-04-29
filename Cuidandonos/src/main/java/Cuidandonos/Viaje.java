package Cuidandonos;

import java.util.List;

public class Viaje {
    private Ubicacion direccionOrigen;
    private List<Parada> paradas;
    private double tiempoEstimado;
    private IAdapter calculador;

    public double calcularTiempoViajeTotal(){
        double demoras = this.calcularDemora();
        double distanciaTotal = calculador.calcularDistanciaViajeTotal(direccionOrigen,paradas);
        return (distanciaTotal / 72)+ demoras;   //72 metros x min es la velocidad promedio persona caminando
    }
    private double calcularDemora(){
        return 0 + paradas.stream().filter(parada->parada.tieneDemora())
                .mapToDouble(parada->parada.getDemora())
                .sum();
    }
}

