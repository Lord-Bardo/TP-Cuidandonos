package Cuidandonos;

public abstract class Parada {
    Ubicacion ubicacion;

    public abstract boolean tieneDemora();

    public double getDemora() {
        return 0;
    }
}
