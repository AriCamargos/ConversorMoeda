package conversaodolar;

public class Conversor {
    protected double cotacaoDolar;

    public Conversor(double cotacaoDolar) {
        this.cotacaoDolar = cotacaoDolar;
    }

    public double converterDolar(double valorReal){
        double valorConvertido = valorReal/this.cotacaoDolar;
        return valorConvertido;
    }
}
