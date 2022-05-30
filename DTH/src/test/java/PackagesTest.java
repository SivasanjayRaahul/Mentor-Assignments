import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

class PackagesTest {

    @Test
    void shouldReturn12AsPackageCostForPackageEnglishPack() {
        Channel channelHBO = new Channel("HBO Movies", 1, 10);
        Channel channelNDTV = new Channel("NDTV", 2, 5);
        List<Channel> channels = new ArrayList<>();
        channels.add(channelHBO);
        channels.add(channelNDTV);
        Packages packageEnglishPack = new Packages("English Pack", 12, channels,1);

        int packageCost = packageEnglishPack.getCost();

        assertThat(packageCost, equalTo(12));

    }

}