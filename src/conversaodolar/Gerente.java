package conversaodolar;
public class Gerente {
    protected aInterface umaI;
    protected Conversor conversor;
    
    
    public void faca(){
        double cotacao = this.umaI.pegueCotacao();
        while(true){
            this.conversor = new Conversor(cotacao); //para criar objeto
            double real = this.umaI.pegueValorReal();
            //this.conversor.converterDolar(real); passando no parametro o que precisa pra fazer a conversão pode ser apagado depois
            double dolar = this.conversor.converterDolar(real);
            if(real == 0){
            this.umaI.mostrarSaida(0);
            break;
            }
            if(real == real) {
            this.umaI.mostrarDolar(dolar);
            }
        }
    }
            
    public Gerente(){
    this.umaI = new aInterface();
    }
}

