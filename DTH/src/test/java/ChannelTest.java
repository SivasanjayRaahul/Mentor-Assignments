import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class ChannelTest {

    @Test
    void shouldReturn10AsChannelCostForChannelHBOMovies() {
        Channel channelHBOMovies = new Channel("HBO Movies", 1, 100);

        int channelCost = channelHBOMovies.getCost();

        assertThat(channelCost,equalTo(100));

    }
}
