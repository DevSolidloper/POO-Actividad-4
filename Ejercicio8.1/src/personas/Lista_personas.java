package personas;
import java.util.*;

public class Lista_personas {
    Vector lista_personas;
    public Lista_personas(){
        lista_personas = new Vector();
    }

    public void añadirPersona(Persona p) {
        lista_personas.add(p);
    }

    public void eliminarPersona(int i) {
        lista_personas.removeElementAt(i);
    }

    public void borrarLista() {
        lista_personas.removeAllElements();
    }
    
}
