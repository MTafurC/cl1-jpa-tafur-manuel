package pe.edu.i201020059.crud;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import pe.edu.i201020059.entity.Country;

public class JPARemove {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("world");
        EntityManager em = emf.createEntityManager();

        String countryCode = "CIB";
        Country country = em.find(Country.class, countryCode);
        em.getTransaction().begin();
        em.remove(country);
        em.getTransaction().commit();
        System.out.println("Se ah eliminado pais CIB");

        em.close();
        emf.close();
    }
}
