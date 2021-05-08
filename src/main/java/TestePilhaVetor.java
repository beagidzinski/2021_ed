import javax.swing.JOptionPane;

public class TestePilhaVetor {

    public static void main(String[] args) {
        PilhaVetor pv1 = new PilhaVetor();

        int c = Integer.parseInt(JOptionPane.showInputDialog("digite a capacidade da pilha"));

        PilhaVetor pv2 = new PilhaVetor(c);
    }

}
