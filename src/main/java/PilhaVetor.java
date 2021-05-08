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
        if (this.topo == this.capacidade) {
            return true;
        }

        return false;
    }
}
