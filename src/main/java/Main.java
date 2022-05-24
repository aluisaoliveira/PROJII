import entity.Clientes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args){
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        try{
            transaction.begin();

            Clientes JOANA = new Clientes();
            JOANA.setCodpostal("4990-170");
            JOANA.setIdCliente(BigInteger.valueOf(123456));
            JOANA.setNif("123456789");
            JOANA.setNome("Joana Silva");
            JOANA.setNrporta(BigInteger.valueOf(5));
            JOANA.setNumtelefone("963852741");
            JOANA.setRua("rua das flores");
            transaction.commit();
        }finally {
            if(transaction.isActive()){
                transaction.rollback();
            }
            entityManager.close();
            entityManagerFactory.close();

        }

    }
}
