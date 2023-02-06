import java.lang.*;
import java.lang.reflect.Array;

public class BeanTest {

    public static void main(String[] args) {

        Album album = new Album(5, "AC/DC", "Back in Black", 1980, 30.1, "Hard Rock");
        Author author = new Author(1,"Davey", "Jones");
        Quote quote1 = new Quote(1, "Now that's high quality H2O.", "Bobby Boucher");
        Quote quote2 = new Quote(2, "Alligators are angry cuz they got all them teeth and no toothbrush.", "Bobby Boucher");
        Quote quote3 = new Quote(3, "No Colonel Sanders, you're wrong. Mommas right.", "Bobby Boucher");
        Quote quote4 = new Quote(4, "Tackling fuel", "Bobby Boucher");

        Quote[] quotesArr = new Quote[4];
        quotesArr[0] = quote1;
        quotesArr[1] = quote2;
        quotesArr[2] = quote3;
        quotesArr[3] = quote4;

        System.out.println(album.getArtist());
        System.out.println(author.getFirstName());
        for (Quote quotes : quotesArr) {
            System.out.println(quotes.getContent());
        }

    }

}
