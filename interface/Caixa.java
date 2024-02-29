
package Atividade13;

public class Caixa {
    public static void main(String[] args) {
        
        Assalariado emp1 = new Assalariado("Maria", "852.963.741-85", 2000.00);
        
        Horista emp2 = new Horista("Carlos", "456.789.631-45", 5.0);
        
        Comissionado emp3 = new Comissionado("Carlos", "456.789.631-45", 0.10);
        
        AssalariadoComissionado emp4 = new AssalariadoComissionado("Mario", "741.582.159-15", 2000.0, 0.10);
        
        emp2.setHorasTrabalhadas(40.0);
        emp2.setHorasExtrasTrabalhadas(5.0);        
        emp3.setVendas(5000.0);        
        emp4.setVendas(1000.0);
        
         
        
        Boleto blt1 = new Boleto("CPFL", 17, 11, 2023, 5500.0, 0.1);
        Boleto blt2 = new Boleto("Internet ClaroFibra+", 10, 11, 2023, 1000.0, 0.1);
        
        Pagar[] credito = new Pagar[6];
        
        credito[0] = emp1;
        credito[1] = emp1;
        credito[2] = emp2;
        credito[3] = emp3;
        credito[4] = blt1;
        credito[5] = blt2;
        
        Data hoje = new Data(16, 11, 2023);
        
        System.out.println( "EXECUÇÃO DE CAIXA SEMANAL " + hoje );
        
        for( int i = 0; i < credito.length; i++ ) {
            
            if( credito[ i ] instanceof Boleto ) {
                
                Boleto aux = (Boleto) credito[ i ];
                
                double valor = aux.getValor();
                                
                if( aux.getVencimento().vemAntes( hoje ) ) {
                    
                    valor = valor + valor * aux.getJuros();
                    
                }
                
                System.out.printf("%s : R$ -%f.\n", aux.getDescricao(), valor );
                
                
            } else {
                System.out.printf("%s : R$ -%f.\n", credito[ i ].getDescricao(), credito[ i ].getValorAPagar() );
            }
            
        }
        
        
        VendaAPrazo aPrazo = new VendaAPrazo(1000.0, 2, 4);
        VendaAVista aVista = new VendaAVista(1000.0,4);
        PrestacaoServico p1 = new PrestacaoServico("eletricista", 500.0);
        PrestacaoServico p2 = new PrestacaoServico("pedreiro", 1500.0);
        
        
        Receber[] debito = new Receber[4];
        
        debito[0] = aPrazo;
        debito[1] = aVista;
        debito[2] = p1;
        debito[3] = p2;
        
        for(int i = 0; i < debito.length;i++){
            if(debito[i] instanceof PrestacaoServico){
                System.out.printf("%s : R$ %f.\n", debito[ i ].descricao(), debito[i].valorAReceber()); 
            }else{
                if(debito[i] instanceof VendaAPrazo){
                //VendaAPrazo aux = (VendaAPrazo) debito[ i ];
                System.out.printf(" A prazo: R$ %f.\n ",debito[i].valorAReceber());
                }else{
                    //VendaAVista aux2 = (VendaAVista) debito[i];
                    System.out.printf("A vista : R$ %f.\n ",debito[i].valorAReceber());
                }
            }
        }

        
    }
}
