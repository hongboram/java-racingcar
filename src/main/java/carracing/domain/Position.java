package carracing.domain;

import carracing.util.RandomUtil;

public class Position {

    private int position;

    public Position() {
        this.position = 0;
    }

    public int getPosition() {
        return this.position;
    }

    public void getPosition(int randomNumber) {
        if (RandomUtil.win(randomNumber))
            this.position++;
    }

    @Override
    public String toString() {
        String result = "";

        for (int count = 0; count < position ; count++)
            result += "-";

        return result;
    }
}
