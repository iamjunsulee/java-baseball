package baseball.domain;

import java.util.Objects;

public class Ball {
    private final BallNumber ballNumber;
    private final int position;

    public Ball(int position, int ballNumber) {
        this.position = position;
        this.ballNumber = new BallNumber(ballNumber);
    }

    public BallStatus play(Ball ball) {
        if (this.equals(ball)) {
            return BallStatus.STRIKE;
        }
        if (ball.matchBallNumber(ballNumber.getNumber())) {
            return BallStatus.BALL;
        }
        return BallStatus.NOTHING;
    }

    private boolean matchBallNumber(int ballNumber) {
        return this.ballNumber.getNumber() == ballNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Ball ball = (Ball) o;
        return position == ball.position &&
                Objects.equals(ballNumber, ball.ballNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ballNumber, position);
    }
}
