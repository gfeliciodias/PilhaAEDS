public class Pilha <E> {
    Celula<E> topo;
    Celula<E> fundo;

    public Pilha (){

    }

    //EXERCICIO 1
    public Pilha (E[] elementos){
        if(elementos==null || elementos.length==0){ //Verifica se é nulo e retorna
            return;
        }
        for(E elemento: elementos){ /*
                                     Percorre o vetor ate o fim fazendo o FILO
                                     */
            empilhar(elemento);
        }

        }

    }

    //EXERCICIO 2
    public void empilhaPilha (E[] elementos) {
        if (elementos == null || elementos.length == 0) {
            throw new RuntimeException(); //Verifica se o vetor é nulo
        }
        for (int i = 0; i < elementos.length; i++) { //percorre o vetor
            empilhar(elementos[i]); //chama a função para empilhar o item

        }
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

    public void imprimir(){
        Celula <E> aux = topo; // variavel auxiliar para percorrer a pilha

        while(aux != fundo){ //Para ao chegar no sentinela
            System.out.println(aux.getItem());
            aux = aux.getProximo(); //Decresce a celula

        }

    public void ordenarOrdemIsercao(){ //publico do da a partida
            imprimirRec(topo); //começa pelo todo
        }

    private void imprimirRec(Celula<E> atual){//recebe a atual
        if(atual != fundo){
            aux = imprimirRec(atual.getProximo());//Primeiro desce ate o fundo depois imprime
            System.out.println(aux.getItem());
        }


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

void main() {
}
