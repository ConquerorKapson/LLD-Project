package Models;

import Enums.DifficultyLevel;

public class BotPlayer extends Player{
    private DifficultyLevel difficultyLevel;

    public DifficultyLevel getDifficultyLevel() {
        return difficultyLevel;
    }

    public void setDifficultyLevel(DifficultyLevel difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }
}
