
package Atividade4;


public class Ponto2D {

    private int coordenadax;
    private int coordenaday;

    public Ponto2D(int coordenadax, int coordenaday) {
        setCoordenadax(coordenadax);
        setCoordenaday(coordenaday);
    }

    public int getCoordenadax() {
        return coordenadax;
    }

    public void setCoordenadax(int coordenadax) {
        this.coordenadax = coordenadax;
    }

    public int getCoordenaday() {
        return coordenaday;
    }

    public void setCoordenaday(int coordenaday) {
        this.coordenaday = coordenaday;
    }
    
    public void exibirCoordenadas(){
        System.out.println("(" + getCoordenadax() + ";" + getCoordenaday()+ ")");
    }
    
}
