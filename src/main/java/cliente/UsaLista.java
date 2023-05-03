package cliente;
import lista.*;

/**
 *
 * @author rafael.fgoulart1
 */
public class UsaLista {
    public static void main(String[] args) {
        String nomesF[] = {"Ana Maria", "Ana Clara", "Ana Letícia", "Ana Lúcia"};
        String nomesP[] = {"Renato Aragão", "Renato Goulart", "Renato Augusto", "Renato Carlos"};
        String materia = "TADS";
        int notasF[] = {9, 5, 4, 1};
        int notasP[] = {2, 1, 10, 3};
        ListaFila listaF = new ListaFila();
        ListaPilha listaP = new ListaPilha();
            
        for (int i = 0; i < 4; i++) {
            listaF.enqueue(new Aluno(nomesF[i], materia, notasF[i]));
            listaP.push(new Aluno(nomesP[i], materia, notasP[i]));
        }
        
        listaF.front();
        System.out.println(listaF.size());
        listaF.dequeue();
        listaF.front();
        System.out.println(listaF.size());
        System.out.println("\n");
        
        listaP.top();
        System.out.println(listaP.size());
        listaP.pop();
        listaP.top();
        System.out.println(listaP.size());
        System.out.println("\n");
    }
}