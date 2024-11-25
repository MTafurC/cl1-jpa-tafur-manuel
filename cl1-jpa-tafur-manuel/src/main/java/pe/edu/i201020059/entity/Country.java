package pe.edu.i201020059.entity;

import jakarta.persistence.*;

import java.util.List;
import java.util.Set;
@Entity
public class Country {
    @Id
    private String code;
    private String name;
    private String continent;
    private String region;
    private float surfaceArea;
    private Integer indepYear;
    private Integer population;
    private float lifeExpectancy;
    private float gnp;
    private float gnpOld;
    private String localName;
    private String governmentForm;
    private String headOfState;
    private Integer capital;
    private String code2;

    @OneToMany(mappedBy = "country", cascade = CascadeType.ALL)
    private List<City> cities;

    @OneToMany(mappedBy = "country", cascade = CascadeType.ALL)
    private Set<CountryLanguage> languages;

    public Country() {
    }

    public Country(String code, String name, String continent, Integer indepYear, float surfaceArea, String region, Integer population, float lifeExpectancy, float gnp, float gnpOld, String localName, String headOfState, String governmentForm, Integer capital, String code2, List<City> cities, Set<CountryLanguage> languages) {
        this.code = code;
        this.name = name;
        this.continent = continent;
        this.indepYear = indepYear;
        this.surfaceArea = surfaceArea;
        this.region = region;
        this.population = population;
        this.lifeExpectancy = lifeExpectancy;
        this.gnp = gnp;
        this.gnpOld = gnpOld;
        this.localName = localName;
        this.headOfState = headOfState;
        this.governmentForm = governmentForm;
        this.capital = capital;
        this.code2 = code2;
        this.cities = cities;
        this.languages = languages;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public float getSurfaceArea() {
        return surfaceArea;
    }

    public void setSurfaceArea(float surfaceArea) {
        this.surfaceArea = surfaceArea;
    }

    public Integer getIndepYear() {
        return indepYear;
    }

    public void setIndepYear(Integer indepYear) {
        this.indepYear = indepYear;
    }

    public Integer getPopulation() {
        return population;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }

    public float getLifeExpectancy() {
        return lifeExpectancy;
    }

    public void setLifeExpectancy(float lifeExpectancy) {
        this.lifeExpectancy = lifeExpectancy;
    }

    public float getGnp() {
        return gnp;
    }

    public void setGnp(float gnp) {
        this.gnp = gnp;
    }

    public float getGnpOld() {
        return gnpOld;
    }

    public void setGnpOld(float gnpOld) {
        this.gnpOld = gnpOld;
    }

    public String getLocalName() {
        return localName;
    }

    public void setLocalName(String localName) {
        this.localName = localName;
    }

    public String getGovernmentForm() {
        return governmentForm;
    }

    public void setGovernmentForm(String governmentForm) {
        this.governmentForm = governmentForm;
    }

    public String getHeadOfState() {
        return headOfState;
    }

    public void setHeadOfState(String headOfState) {
        this.headOfState = headOfState;
    }

    public Integer getCapital() {
        return capital;
    }

    public void setCapital(Integer capital) {
        this.capital = capital;
    }

    public String getCode2() {
        return code2;
    }

    public void setCode2(String code2) {
        this.code2 = code2;
    }

    public List<City> getCities() {
        return cities;
    }

    public void setCities(List<City> cities) {
        this.cities = cities;
    }

    public Set<CountryLanguage> getLanguages() {
        return languages;
    }

    public void setLanguages(Set<CountryLanguage> languages) {
        this.languages = languages;
    }
}
