package Cuidandonos;

public class ParadaConDemora extends Parada {
    private double demora;

    public boolean tieneDemora(){return true;}

    @Override
    public double getDemora() {
        return demora;
    }
}
