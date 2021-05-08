public class PilhaVetor {

    private int dados[];
    private int topo;
    private int capacidade;

    public PilhaVetor() {
       this(10);
    }

    public PilhaVetor(int capacidade) {
        dados = new int[capacidade];
        topo = 0;
        this.capacidade = capacidade;
    }

    public boolean estaCheio() {
       return this.topo == this.capacidade;
    }

    public boolean estaVazia() {
        return this.topo == 0;
    }

    public void push(int i) {
        this.dados[this.topo++] = i;
    }

    public int pull() {
        return this.dados[--topo];
    }

    public int tamanho() {
        return this.topo;
    }

    public int topo() {
        return this.dados[this.topo-1];
    }
}
