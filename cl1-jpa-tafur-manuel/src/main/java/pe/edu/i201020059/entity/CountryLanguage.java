package pe.edu.i201020059.entity;
import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "countrylanguage")
public class CountryLanguage {

    @Embeddable
    public static class CountryLanguageId implements Serializable {

        private String countryCode;
        private String language;

        public CountryLanguageId() {}

        public CountryLanguageId(String countryCode, String language) {
            this.countryCode = countryCode;
            this.language = language;
        }
    }

    @EmbeddedId
    private CountryLanguageId id;

    @ManyToOne
    @MapsId("countryCode")
    @JoinColumn(name = "CountryCode", nullable = false)
    private Country country;
    private String isOfficial;
    private float percentage;

    public CountryLanguage() {}

    public CountryLanguage(Country country, String language, String isOfficial, float percentage) {
        this.id = new CountryLanguageId(country.getCode(), language);
        this.country = country;
        this.isOfficial = isOfficial;
        this.percentage = percentage;
    }

    public CountryLanguageId getId() {
        return id;
    }

    public void setId(CountryLanguageId id) {
        this.id = id;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public String getIsOfficial() {
        return isOfficial;
    }

    public void setIsOfficial(String isOfficial) {
        this.isOfficial = isOfficial;
    }

    public float getPercentage() {
        return percentage;
    }

    public void setPercentage(float percentage) {
        this.percentage = percentage;
    }
}
