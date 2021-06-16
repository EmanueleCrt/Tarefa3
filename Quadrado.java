
public class Quadrado extends Quadriláteros{
    public Quadrado(double x){
        super(x, 0.0, 0.0, 0.0);
    }
    
    public double getX(){
        return super.getX();
    }
    
    public double area(){
        return getX() * 2.0;
    }
    
}
