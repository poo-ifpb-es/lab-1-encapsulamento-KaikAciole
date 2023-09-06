public class CarroAluguel {

    float valorPorKm;
    int distanciaPercorrida;
    boolean carro = true;
    boolean sinistro = false;
    float debito = 0;

    public CarroAluguel(float valorPorKm){
        this.valorPorKm = valorPorKm;
    }

    public void setValorPorKm(float valor){
        this.valorPorKm = valor;
    }

    public float getValorPorKm(){
        return valorPorKm;
    }

    public void setDistanciaPercorrida(int distancia){
        this.distanciaPercorrida = distancia;
    }

    public float getDistanciaPercorrida(){
        return distanciaPercorrida;
    } 

    public void alugar(){
        if(isDisponivel())
            carro = false;
        else
            throw new CarroIndisponivelException("O carro está indisponível.");
    } 

    public void devolver(){
        if (!isDisponivel()){
            carro = true;
        }else{   
            throw new CarroDisponivelException("O carro está disponível.");
        }
    }

    public boolean isDisponivel(){
        return carro;
    } 
    
    public boolean hasSinistro(){
        return sinistro;
    } 

    public void setSinistro(boolean sinistro){
        this.sinistro = sinistro;
    }
    
    public float getDebito(){
        if (sinistro){
            return (valorPorKm*distanciaPercorrida)*(1.06f);
        }
        else{ 
            return valorPorKm*distanciaPercorrida;
        }
    }

    public void pagar(){

    }




}