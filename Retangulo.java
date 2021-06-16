
public class Retangulo extends Quadriláteros{
    public Retangulo(double y, double z){
        super(y, z, 0.0, 0.0);
    }
    
    public double getY(){
        return super.getY();
    }
    
    public double getZ(){
        return super.getY();
    }
    
    public double area(){
        return getY() * getZ();
    }
    
}
