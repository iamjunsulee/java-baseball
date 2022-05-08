package baseball.domain;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class BallsTest {
    @Test
    void nothing_test() {
        Balls computer = new Balls(Arrays.asList(1, 2, 3));
        BallStatus ballStatus = computer.play(new Ball(1, 4));
        assertThat(ballStatus).isEqualTo(BallStatus.NOTHING);
    }

    @Test
    void ball_test() {
        Balls computer = new Balls(Arrays.asList(1, 2, 3));
        BallStatus ballStatus = computer.play(new Ball(1, 2));
        assertThat(ballStatus).isEqualTo(BallStatus.BALL);
    }

    @Test
    void strike_test() {
        Balls computer = new Balls(Arrays.asList(1, 2, 3));
        BallStatus ballStatus = computer.play(new Ball(2, 2));
        assertThat(ballStatus).isEqualTo(BallStatus.STRIKE);
    }

    @Test
    void 원스트라이크_원볼() {
        Balls computer = new Balls(Arrays.asList(1, 2, 3));
        GameResult result = computer.createGameResult(Arrays.asList(1, 4, 2));
        assertThat(result.getStrikeCount()).isEqualTo(1);
        assertThat(result.getBallCount()).isEqualTo(1);
    }

    @Test
    void 쓰리볼() {
        Balls computer = new Balls(Arrays.asList(1, 2, 3));
        GameResult result = computer.createGameResult(Arrays.asList(3, 1, 2));
        assertThat(result.getStrikeCount()).isEqualTo(0);
        assertThat(result.getBallCount()).isEqualTo(3);
    }

    @Test
    void 쓰리스트라이크() {
        Balls computer = new Balls(Arrays.asList(1, 2, 3));
        GameResult result = computer.createGameResult(Arrays.asList(1, 2, 3));
        assertThat(result.getStrikeCount()).isEqualTo(3);
        assertThat(result.getBallCount()).isEqualTo(0);
    }
}
