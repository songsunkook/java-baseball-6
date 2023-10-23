package baseball;

import controller.BaseballController;

public class Application {
    private static final BaseballController baseballController = new BaseballController();
    public static void main(String[] args) {
        do {
            baseballController.initGame();
            baseballController.playGame();
        } while (baseballController.restartGame());
    }
}
