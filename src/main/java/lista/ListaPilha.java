package lista;

/**
 *
 * @author rafael.fgoulart1
 */
public class ListaPilha {
    private Elemento inicio, atual, aux;
    
    public void push(Object objeto) {
        if (empty()) {
            inicio = new Elemento(objeto, null, null);
            aux = inicio;
        } else {
            atual = new Elemento(objeto, null, aux);
            aux.setProx(atual);
            aux = atual;
        }
    }
    
    public void pop(){
        Elemento e = inicio;
        if (e != null) {
            inicio=e.getProx();
            e.setProx(null);
            inicio.setAnt(null);
        }
    }
    
    public boolean empty() {
        return inicio == null;
    }
    
    public void top() {
        Elemento e = inicio;
        Aluno a;
        if (!empty()) {
            a = (Aluno) e.getObj();
            System.out.println(a.toString());
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