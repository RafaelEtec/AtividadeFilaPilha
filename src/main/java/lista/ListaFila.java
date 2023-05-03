package lista;

/**
 *
 * @author rafael.fgoulart1
 */
public class ListaFila {
    private Elemento inicio, atual, aux;
    
    public boolean empty() {
        return inicio == null;
    }
    
    public void enqueue(Object objeto) {
        if (empty()) {
            inicio = new Elemento(objeto, null, null);
            aux = inicio;
        } else {
            atual = new Elemento(objeto, null, aux);
            aux.setProx(atual);
            aux = atual;
        }
    }
    
    public void front() {
        Elemento e = inicio;
        Aluno a;
        if (!empty()) {
            a = (Aluno) e.getObj();
            System.out.println(a.toString());
        }
    }
    
    public void dequeue(){
        Elemento e = atual;
        if (e != null) {
            aux=e.getAnt();
            atual=aux;
            e.setAnt(null);
            atual.setProx(null);
        }
    }
    
    public int size(){
        Elemento e = inicio;
        int cont = 0;
        while (e != null) {
            cont++;
            e = e.getProx();
        }
        return cont;
    }
}