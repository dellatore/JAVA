package testejpa;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Programa {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa( null,"Gabriel Dellatore", "dellatoregabriel8@gmail.com");
        Pessoa p2 = new Pessoa(null,"Tubarao", "tubarao@gmail.com");
        Pessoa p3 = new Pessoa(null,"Dellatore", "dellatore@gmail.com");

        //criando a ligação com o banco de dados
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
        //o parametro passado é o apelido do persistence-unit declarado no "name ="
        EntityManager em = emf.createEntityManager();

        //MANDANDO DADOS PARA O BANCO DE DADOS

        em.getTransaction().begin(); //inicializa a transação
        em.persist(p1);
        em.persist(p2);
        em.persist(p3);
        em.getTransaction().commit(); //termina a transação
        em.close(); //fecha o EntityManager
        emf.close(); // fecha o EntityManagerFactory

        System.out.println("O transporte de dados foi feito com sucesso!");



        //BUSCANDO DADOS NO BANCO DE DADOS
        //Pessoa p = em.find(Pessoa.class, 2);
        //System.out.println(p);

        //APAGANDO DADOS DO BANCO

        em.getTransaction().begin();
        em.remove(p2);
        em.getTransaction().commit();

        System.out.println("dado apagado!");
        em.close();
        emf.close();



        em.getTransaction().begin(); //inicializa a transação
        em.persist(p2);
        em.getTransaction().commit(); //termina a transação
        em.close(); //fecha o EntityManager
        emf.close(); // fecha o EntityManagerFactory


    }
}
