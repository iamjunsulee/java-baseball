package baseball.domain;

import java.util.Objects;

public class BallNumber {
    private final int number;

    public BallNumber(int number) {
        if (number < 1 || number > 9) {
            throw new IllegalArgumentException("숫자는 1~9 사이의 값이어야 합니다.");
        }
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BallNumber that = (BallNumber) o;
        return number == that.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }
}
