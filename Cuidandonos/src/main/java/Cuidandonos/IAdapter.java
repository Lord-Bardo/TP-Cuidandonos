package Cuidandonos;

import java.util.List;

public interface IAdapter {
    double calcularDistanciaViajeTramo(Ubicacion origen, Ubicacion destino);
    double calcularDistanciaViajeTotal(Ubicacion origen,List<Parada> paradas);
}
