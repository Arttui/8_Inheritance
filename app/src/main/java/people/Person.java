package people;
/**
 * Kertaustehtävä
 *
 * @author  Arttu Iso-Kuortti
 * @version 1.0
 * @since   4.11.2019
 */

public class Person {
    private String nimi;

    public Person(String nimi) {
        this.nimi = nimi;
    }

    public String getNimi(){
        return nimi;
    }
}
