
package Atividade12;

public class Teste {
    public static void main(String[] args) throws InterruptedException {
        EventoHeranca e1 = new EventoHeranca(04, 02, 2004, 11);
        System.out.println("--------------------------------------");
        e1.mostrarData();
        
        Diretor d = new Diretor("gabriel", "masculino", "04/02/2004");
        
        String info;
        info = d.getInfo();
        System.out.println("--------------------------------------");
        
        System.out.println(info);
        
        System.out.println("--------------------------------------");
        
        
        TrabalhadorAssalariado t1 = new TrabalhadorAssalariado("gabriel", "gerente", 1900.50);
        TrabalhadorHorista t2 = new TrabalhadorHorista("renato","auxiliar de producao");
        
        t2.setHorasTrabalhadas(9);
        t2.setSalarioPorHora(50.0);
        

        String info2;
        info2 = t1.calcularPagamentoSemanal();
        System.out.println(info2);
        
        String info3;
        info3 = t2.calcularPagamentoSemanal();
        System.out.println(info3);
        
        System.out.println("--------------------------------------");
        
        LinguaegmRomana romana = new LinguaegmRomana();
        LinguagemPortugues pt = new LinguagemPortugues();
        LinguagemPhyton py = new LinguagemPhyton();

        romana.mostrarIdioma();
        System.out.println("--------------------------------------");
        pt.mostrarIdioma();
        System.out.println("--------------------------------------");
        py.mostrarIdioma();
        
        
        MaquinaDeKaraoke karaoke = new MaquinaDeKaraoke();
        karaoke.menuKaraoke();
        
        
    }
}
