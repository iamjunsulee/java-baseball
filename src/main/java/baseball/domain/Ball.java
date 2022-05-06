package baseball.domain;

import java.util.Objects;

public class Ball {
    private final int ballNumber;
    private final int position;

    public Ball(int position, int ballNumber) {
        this.position = position;
        this.ballNumber = ballNumber;
    }

    public BallStatus play(Ball ball) {
        if (this.equals(ball)) {
            return BallStatus.STRIKE;
        }
        if (ball.matchBallNumber(ballNumber)) {
            return BallStatus.BALL;
        }
        return BallStatus.NOTHING;
    }

    private boolean matchBallNumber(int ballNumber) {
        return this.ballNumber == ballNumber;
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
        return ballNumber == ball.ballNumber &&
                position == ball.position;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ballNumber, position);
    }
}
