public class Circulo {
    float raio;
    float circunferencia;
    float area; 
    float pi = 3.14159f;
    
    
    
    public Circulo(float raio){
        this.raio = raio;
        this.area = this.raio*pi;
    }

    public float getRaio(){
        return this.raio;
    }

    public void setRaio(float raio){
        this.raio = raio;
    }


    public float getArea(){
        return this.area;
    }

    public float getCircunferencia(){
        return this.circunferencia;
    }


}
