
package Atividade4;

public class PoligonoRegular {
    private int qtdadeLados;
    private int medidaLado;

    public PoligonoRegular(int qtdadeLados, int medidaLado) {
        setQtdadeLados(qtdadeLados);
        setMedidaLado(medidaLado);
    }

    public int getQtdadeLados() {
        return qtdadeLados;
    }

    public void setQtdadeLados(int qtdadeLados) {
        this.qtdadeLados = qtdadeLados;
    }

    public int getMedidaLado() {
        return medidaLado;
    }

    public void setMedidaLado(int medidaLado) {
        this.medidaLado = medidaLado;
    }
    
    public void nomePoligono(){
        if(this.getQtdadeLados() == 3){
            System.out.println("Triangulo");
        }else if(this.getQtdadeLados() == 4){
            System.out.println("Quadrado");
        }else if(this.getQtdadeLados() == 5){
            System.out.println("Pentagono");
        }else if(this.getQtdadeLados() == 6){
            System.out.println("Hexagono");
        }else if(this.getQtdadeLados() == 7){
            System.out.println("Heptagono");
        }
    }
}
