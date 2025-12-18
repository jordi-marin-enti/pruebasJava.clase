public class App {
    public static void main(String[] args) throws Exception {
        Red red = new Red();

        nodo a = new nodo("A");
        nodo b = new nodo("B");
        nodo c = new nodo("C");
        nodo d = new nodo("D");
        nodo e = new nodo("E");

        red.agregarNodo(a);
        red.agregarNodo(b);
        red.agregarNodo(c);
        red.agregarNodo(d);
        red.agregarNodo(e);


        red.conectar(a, b);
        
        red.conectar(b, c);
        red.conectar(b, d);

        red.conectar(c, e);
        red.conectar(d, e);

        red.mostrar();

    }
}
