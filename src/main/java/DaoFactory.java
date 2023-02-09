public class DaoFactory {
    private static Ads adsDao;
    // need to make config here
    Config config = new Config();

    public static Ads getAdsDao() {
        if (adsDao == null) {
            //double check the below line
            adsDao = new MySQLAdsDao(config);
        }
        return adsDao;
    }
}
