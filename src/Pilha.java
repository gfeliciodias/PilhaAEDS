public class Pilha <E> {
    Celula<E> topo;
    Celula<E> fundo;

    public Pilha (){

    }

    //EXERCICIO 1
    public Pilha (E elementos[]){
        if(elementos==null || elementos.length==0){
            return;
        }

        for(int i = 0; i < elementos.length; i++){
            Pilha.getProx = elementos[i];
            fundo = elementos.getProx();
        }

    }

    //EXERCICIO 2
    public E empilhaPilha (E elementos[]){
        if(elementos==null || elementos.length==0)return Pilha<E>;


    }

    public boolean vazia(){

    }

    public void empilhar(E item){

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
