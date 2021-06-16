public class Circulo extends Quadriláteros{
    double idQuadriláteros;
    
    public Circulo() {
        super.setRaio(0);
    }
    
    public Circulo(double addRaio){
        super.setRaio(addRaio);
    }
    
    public double getX(){
        return super.getX();
    }
    
    public double area(){
        return Math.PI * getX() * 2.0;
    }
}