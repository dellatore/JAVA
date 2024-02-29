 
package Atividade9;

public class ArrayDeFloats {

        private int tamanho;
        private int constante;
        private float[] arr;
        

    public ArrayDeFloats(int tamanho, int constante) {
        setTamanho(tamanho);
        setConstante(constante);
        arr = new float[getTamanho()];
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public int getConstante() {
        return constante;
    }

    public void setConstante(int constante) {
        this.constante = constante;
    }

    
    public void montarArray(){
        
        for(int i = 0; i<=tamanho;i++){
            arr[i] = getConstante();
            System.out.println("valor da posicao" + i + ": " + arr[i] );
        }      
    }
      
    //10.13
    public void eIgual(ArrayDeFloats arr2){
        
        
        if(arr.length != arr2.tamanho){
            System.out.println("Nao é igual!");
        }
        for( int i= 0;i< arr.length;i++){
            if( arr[i]!= arr2.arr[i]){
                System.out.println("é igual!");
            }
        }

    }
 
    //10.14
    public void soma(float num){
        for(int i = 0; i < arr.length; i++){
            arr[i] += num;
            System.out.println(arr[i]);
        }
    }
    
    //10.15
    public void total(){
        int total = 0;
        for(int i = 0; i<=arr.length;i++){
            total += arr[i];
        }
        System.out.println(total);
    }
    
    
    //10.17
    public void existe(float num){
        int averiguar = 0;
        for(int i = 0; i < arr.length;i++){
            if(arr[i] == num){
                System.out.println("existe");
            }
            averiguar++;
            
            if(averiguar == arr.length){
                System.out.println("nao existe");
            }
        }
    }

}
