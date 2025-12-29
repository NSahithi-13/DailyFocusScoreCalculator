public class FocusCalculator {

    public int calculateScore(ActivityInput ai) {

        int score = (ai.studyHours * 10)
                  + (ai.codingHours * 15)
                  + (ai.sleepHours * 5)
                  - (ai.distractionHours * 12);

        if (score < 0) score = 0;
        if (score > 100) score = 100;

        return score;
    }
}
