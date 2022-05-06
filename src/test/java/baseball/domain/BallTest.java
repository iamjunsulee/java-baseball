package baseball.domain;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BallTest {
    private Ball computer;

    @BeforeEach
    public void setUp() {
        computer = new Ball(1, 1);
    }
    @Test
    public void nothingTest() {
        assertThat(computer.play(new Ball(2, 2))).isEqualTo(BallStatus.NOTHING);
    }

    @Test
    public void ballTest() {
        assertThat(computer.play(new Ball(2, 1))).isEqualTo(BallStatus.BALL);
    }

    @Test
    public void strikeTest() {
        assertThat(computer.play(new Ball(1, 1))).isEqualTo(BallStatus.STRIKE);
    }
}
