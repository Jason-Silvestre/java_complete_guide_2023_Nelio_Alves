package application;

import dominio.Pessoa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
        EntityManager em = emf.createEntityManager();

//        Pessoa p = em.find(Pessoa.class, 2);
//        System.out.println(p);

//        Pessoa p = new Pessoa(2, null, null); //nao funciona por nao ser montiorado e sim destacado
//        em.remove(p);

        Pessoa p = em.find(Pessoa.class, 2);//entidade monitorada,(acabou de ser inserido ou se nusco o objeto na bd e peço pra remover funciona)
        em.getTransaction().begin(); //toda operação que nao for apenas consulta precisa de transação para funcionar
        em.remove(p);
        em.getTransaction().commit();

        System.out.println("Pronto!");
        em.close();
        emf.close();
    }
}

