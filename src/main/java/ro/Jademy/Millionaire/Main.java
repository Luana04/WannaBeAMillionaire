package ro.Jademy.Millionaire;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        // 1.  define objects
        // define properties
        // define methods

        // 2. define interactions


        List<Question> difficultyZeroQuestions = new ArrayList<Question>();
        List<Question> difficultyOneQuestions = new ArrayList<Question>();
        List<Question> difficultyYwoQuestions = new ArrayList<Question>();
        List<Question> difficultyThreeQuestions = new ArrayList<Question>();

        Game game = new Game(difficultyZeroQuestions, difficultyOneQuestions,difficultyYwoQuestions, difficultyThreeQuestions);
    }
}
