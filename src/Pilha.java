public class Pilha <E> {
    Celula<E> topo;
    Celula<E> fundo;

    public Pilha (){

    }

    //EXERCICIO 1
    public Pilha (E[] elementos){
        if(elementos==null || elementos.length==0){
            return;
        }

        for(int i = 0; i < elementos.length; i++){
            Pilha.getProx = elementos[i];

        }

    }

    //EXERCICIO 2
    public void empilhaPilha (E[] elementos){

    }

    public boolean vazia(){
        return topo == null;
    }

    public void empilhar(E item){
        if(item==null){
            return;
        }

        Celula <E> temp = new Celula<>();// Cria uma celula temporaria

        temp.setItem(item); //Coloca o item passado dentro da celula
        temp.setProximo(topo); //Coloca na posição (atual -1) o topo antigo
        topo = temp; //O novo topo recebe o item passado no metodo


    }

    public E desempilhar(){

    }

    public E consultarTopo(){
        if (topo == null){
            return null;
        }

        Celula<E> temp = new Celula<>();

        temp = topo;

        return temp;
    }


}
