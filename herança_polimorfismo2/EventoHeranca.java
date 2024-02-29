
package Atividade12;

public class EventoHeranca extends DataHora {
    private String nomeEvento;
    
    
    public EventoHeranca(int dia, int mes, int ano, int hora){
        super(dia,mes,ano,hora);
        
    }

    public String getNomeEvento() {
        nomeEvento = "aniversario";
        return nomeEvento;
    }

    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }
    
    @Override
    public void mostrarData(){
        String texto;
        
        texto = "nome evento:"+ this.getNomeEvento() + "\nhorario do evento:" + super.getHora() + "\ndata:" + super.getDia()+
                "/" + super.getMes() + "/" + super.getAno();
        
        System.out.println(texto);
    }
}
