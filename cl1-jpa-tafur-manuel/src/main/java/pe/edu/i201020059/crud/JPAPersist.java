package pe.edu.i201020059.crud;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import pe.edu.i201020059.entity.City;
import pe.edu.i201020059.entity.Country;
import pe.edu.i201020059.entity.CountryLanguage;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class JPAPersist {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("world");
        EntityManager em = emf.createEntityManager();
        Country country = new Country(
                "CIB",
                "Cibertec",
                "Oceania",
                1812,
                8972156,
                "ARegion",
                451234,
                90.5f,
                12345.0f,
                54320.0f,
                "Cibertec",
                "ReyCiberiano",
                "LaureteWins",
                500,
                "CB",
                null,
                null
        );
        City city1 = new City("CB 1", country, "Independecia", 900000);
        City city2 = new City("CB 2", country, "Arequipa", 800000);
        City city3 = new City("CB 3", country, "Trujillo", 750000);

        CountryLanguage lang1 = new CountryLanguage(country, "Español", "T", 75.5f);
        CountryLanguage lang2 = new CountryLanguage(country, "Aleman", "F", 24.5f);

        city1.setCountry(country);
        city2.setCountry(country);
        city3.setCountry(country);
        List<City> cities = Arrays.asList(city1, city2, city3);

        country.setCities(cities);

        Set<CountryLanguage> languages = new HashSet<>(Arrays.asList(lang1, lang2));
        country.setLanguages(languages);

        em.getTransaction().begin();
        em.persist(country);
        em.getTransaction().commit();
        System.out.println("Somos Parte de Laurete");
        em.close();
        emf.close();
    }
}
