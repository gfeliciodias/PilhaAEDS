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
    //EXERCICIO 3
    public void imprimir() {
        Celula<E> aux = topo; // variavel auxiliar para percorrer a pilha

        while (aux != fundo) { //Para ao chegar no sentinela
            System.out.println(aux.getItem());
            aux = aux.getProximo(); //Decresce a celula

        }
    }

    //EXERCICIO 4
    public void ordenarOrdemIsercao(){ //publico do da a partida
            imprimirRec(topo); //começa pelo todo
    }

    private void imprimirRec(Celula<E> atual){//recebe a atual
        if(atual != fundo){
            aux = imprimirRec(atual.getProximo());//Primeiro desce ate o fundo depois imprime
            System.out.println(aux.getItem());
        }
    }

    //EXERCICIO 5
    public E empilharPilhas(Pilha<E> outra){
        Pilha<E> invertida = new Pilha<>();//Pilha nova que será devolvida

        Celula<E> aux = outra.topo; //Percorre a recebida do topo ao fundo

        while(aux != outra.fundo) {
            invertida.empilhar(aux.getItem()); //Empilha o topo do recebido na pilha invertida

            aux = aux.getProximo(); //Pega o proximo item da pilha
        }

        return invertida; //retorna a inversa e a Recebida está intacta
    }

    //EXERCICIO 6
    public E atualInvertido(Pilha <E> atual) {
        Pilha <E> invertida = new Pilha<>(); //Nova pilha
        Celula aux = atual.topo;

        while(aux != atual.fundo) {
            invertida.empilhar(aux.getItem()); //Insere o item topo da recebida

            aux = aux.getProximo();//Aux pega o proximo item
        }
        return invertida;
    }
    /*
        Outro modo de fazer
     *  public Pilha<E> obterInvertida(){
     *      return inverterPilha(this); //"This" = a propria pilha do exercicio 5
     */
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