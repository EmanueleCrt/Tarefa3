public abstract class Quadriláteros implements Forma{
    private double x;
    private double y;
    private double z;
    private double w;
    
    public Quadriláteros (double x, double y, double z, double w){
        this.x = x;
        this.y = y;
        this.z = z;
        this.w = w;
    }
    
    protected double getX(){
        return x;
    }
    
    protected double getY(){
        return y;
    }
    
    protected double getZ(){
        return z;
    }
    
    protected double getW(){
        return w;
    }
    
    public double perimetro(){
        return getX() + getY() + getZ() + getW();
    }
}

