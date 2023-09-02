public class PuntoTest {
    public static final int SUPERIOR_IZQUIERDO = 1;
    public static final int SUPERIOR_DERECHO = 2;
    public static final int INFERIOR_IZQUIERDO = 3;
    public static final int INFERIOR_DERECHO = 4;

    public static void main(String[] args) {
        Punto p1 = new Punto(5,10);
        Punto p2 = new Punto(3,4);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println("----------------------");
        p2.trasladaA(-3,-4);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println("------------------------");
        System.out.println(p1.getDistanciaA(p2));
        System.out.println("--------------------");
        System.out.println("Distancia a origen de p1: "+p1.getR());
        System.out.println("Distancia a origen de p2: "+p2.getR());
        System.out.println("------------------------");
        System.out.println("p1 en polares: "+"("+p1.getR()+","+p1.getRo()+")");
        System.out.println("p2 en polares: "+"("+p2.getR()+","+p2.getRo()+")");
        System.out.println("---------------------");
        p1.trasladaA(-10,5);
        System.out.println(p1.getCuadrante());
        System.out.println(p1);
        System.out.println("p1 en polares: "+"("+p1.getR()+","+p1.getRo()+")");
        System.out.println(p1.getR());
        System.out.println(p1.getDistanciaA(p2));

    }
}
