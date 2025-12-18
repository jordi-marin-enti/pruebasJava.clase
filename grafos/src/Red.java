import java.util.ArrayList;

public class Red {
    private ArrayList<nodo> nodos;

    public Red(){
        nodos = new ArrayList<>();
    }

    public void agregarNodo(nodo n){
        this.nodos = new ArrayList<>();
        if (!nodos.contains(n))
            nodos.add(n);
    }

    public void conectar(nodo a, nodo b){
        a.conectar(b);
        b.conectar(a);

    }
    
    public void mostrar(){
        System.out.println("=== GRAFO ===");
        for (nodo n : nodos) {
            System.out.println(n.getNombre() + " --> " + n.getVecinos());
        }
    }
}
