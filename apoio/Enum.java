package apoio;

public enum Enum {
    JUNIOR(1),
    SENIOR(2),
    PLENO(3);

    private int valorNivel;
    private Enum(int valorNivel){
        setValorNivel(valorNivel);
    }

    public int getValorNivel() {
        return valorNivel;
    }

    public void setValorNivel(int valorNivel) {
        this.valorNivel = valorNivel;
    }

    public static void main(String[] args) {
        System.out.println(Enum.JUNIOR.valorNivel);
    }
}
