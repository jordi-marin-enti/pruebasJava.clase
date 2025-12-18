import java.util.ArrayList;
public class nodo {
    private String nombre;
    private ArrayList<nodo> vecinos;

    public nodo(String nombre){
        this.nombre = nombre;
        this.vecinos = new ArrayList<>();

    }

    public void conectar(nodo otro){
        this.vecinos = new ArrayList<>();
        if (!vecinos.contains(otro))
            vecinos.add(otro);
    }

    public String getNombre(){
        return nombre;
    }

    public String getVecinos(){
        String tmp = "";

        for (nodo v : vecinos) {
            tmp += "[" + v.getNombre() + "]";
        }
        return tmp;
    }

}
