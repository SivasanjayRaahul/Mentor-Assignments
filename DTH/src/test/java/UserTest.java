import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

class UserTest {

    @Test
    void shouldReturnBillAmountAs29ForEnglishPackNewsPackAndKTVChannel(){
        User user = new User();
        user.subscribePackage(1);
        user.subscribePackage(2);
        user.subscribeChannel(2);

        int bill= user.getBill();

        assertThat(bill,equalTo(29));

    }

    @Test
    void shouldReturnBillAmountAs22ForHBOAndKTVChannel(){
        User user = new User();
        user.subscribeChannel(1);
        user.subscribeChannel(2);

        int bill= user.getBill();

        assertThat(bill,equalTo(22));

    }

}