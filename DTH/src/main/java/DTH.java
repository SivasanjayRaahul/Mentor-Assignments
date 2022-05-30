import java.util.ArrayList;
import java.util.List;

public class DTH {

    List<Channel> channels = new ArrayList<>();
    List<Packages> packages = new ArrayList<>();

    DTH() {
        Channel channelHBO_Movies = new Channel("HBO Movies", 1, 10);
        Channel channelKTv = new Channel("KTV", 2, 12);
        Channel channelZeeNews = new Channel("Zee News", 3, 2);
        Channel channelNDTVNews = new Channel("NDTV News", 4, 5);
        Channel channelFox = new Channel("Fox", 5, 10);

        List<Channel> englishPack = new ArrayList<>();
        englishPack.add(channelHBO_Movies);
        englishPack.add(channelNDTVNews);

        List<Channel> newsPack = new ArrayList<>();
        newsPack.add(channelZeeNews);
        newsPack.add(channelNDTVNews);

        Packages packageEnglish = new Packages("English Pack", 12, englishPack, 1);
        Packages packageNews = new Packages("News Pack", 5, newsPack, 2);

        channels.add(channelFox);
        channels.add(channelKTv);
        channels.add(channelHBO_Movies);
        channels.add(channelNDTVNews);
        channels.add(channelZeeNews);

        packages.add(packageEnglish);
        packages.add(packageNews);

    }
}
