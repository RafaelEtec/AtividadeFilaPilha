package lista;

/**
 *
 * @author rafael.fgoulart1
 */
public class Elemento {
    private Object obj;
    private Elemento prox, ant;

    public Elemento(Object obj, Elemento prox, Elemento ant) {
        this.obj = obj;
        this.prox = prox;
        this.ant = ant;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    public Elemento getProx() {
        return prox;
    }

    public void setProx(Elemento prox) {
        this.prox = prox;
    }

    public Elemento getAnt() {
        return ant;
    }

    public void setAnt(Elemento ant) {
        this.ant = ant;
    }
}