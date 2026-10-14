public class Celula <E>{
    private E item;
    private E proximo;

    public Celula(E item, E proximo){
        this.item = item;
        this.proximo = proximo;
    }

    public Celula(){

    }

    public E getItem() {
        return item;
    }

    public void setItem(E item) {
        this.item = item;
    }

    public E getProximo() {
        return proximo;
    }

    public void setProximo(E proximo) {
        this.proximo = proximo;
    }
}
