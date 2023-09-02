public class Punto {
    private float x;
    private float y;

    public Punto(float x,float y){
        this.x=x;
        this.y=y;
    }
    public float getX(){
        return x;
    }
    public float getY(){
        return y;
    }
    public float getR(){
        return (float) (Math.sqrt((x*x)+(y*y)));
    }
    public float getRo(){
        return (float) (Math.atan(y/x));
    }
    public String getCuadrante(){
        if (x>0 && y>0){
            return "Cuadrante superior derecho";
        }else if (x>0 && y<0){
            return "Cuadrante inferior derecho";
        }else if (x<0 && y>0){
            return "Cuadrante superior izquierdo";
        }else if (x<0 && y<0){
            return "Cuadrante inferior izquierdo";
        }
        return "Se encuentra en los ejes del plano";
    }
    public void trasladaA(float x, float y){
        this.x=x;
        this.y=y;
    }
    public String toString(){
        return "("+x+","+y+")";
    }
    public float getDistanciaA(Punto punto){
        return (float) (Math.sqrt(((x-punto.getX())*(x-punto.getX()))+((y-punto.getY())*(y-punto.getY()))));
    }
}
