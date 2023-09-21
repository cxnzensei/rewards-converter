import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue());
    }

    @Test
    void create_with_miles_value() {
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue, true);
        assertEquals(milesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_cash_to_miles() {
        int cashValue = 323;
        var milesValue = new RewardValue(cashValue).getMilesValue();
        assertEquals(milesValue, 323/0.0035);
    }

    @Test
    void convert_from_miles_to_cash() {
        int milesValue = 5000;
        var rewardValue = new RewardValue(milesValue, true).getCashValue();
        assertEquals(rewardValue, milesValue*0.0035);
    }
}
