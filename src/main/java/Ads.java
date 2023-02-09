import java.util.List;

public interface Ads {
    // get a list of all the ads
    List<Ads> all();
    // insert a new ad and return the new ad's id
    Long insert(Ad ad);
}
