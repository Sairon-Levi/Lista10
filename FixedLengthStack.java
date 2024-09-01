public class FixedLengthStack implements ISimpleStack {

    private char[] dadosDaPilha;
    private int topo;

    public FixedLengthStack(int tamanho) {
        this.dadosDaPilha = new char[tamanho];
        this.topo = 0;
    }

    public void push(char dado) {
        if (isFull()) {
            System.out.println("Pilha Cheia");
            return;
        }
        this.dadosDaPilha[topo++] = dado;
    }

    public char pop() {
        if (isEmpty()) {
            System.out.println("Pilha Vazia");
            return (char) 0;
        }
        return this.dadosDaPilha[--topo];
    }

    public boolean isEmpty() {
        return this.topo == 0;
    }

    public boolean isFull() {
        return this.topo == this.dadosDaPilha.length;
    }
}
