package com.codeforgood.poder;
import java.util.HashMap;
import java.util.ArrayList;

public class PlacementTest {

    private  HashMap<Integer, String> answerKey;

    public PlacementTest() {
        answerKey = new HashMap<Integer, String>();
        createAnswerKey();
    }

    /**
     * function createAnswerKey implements the answerKey array
     * */
    public void createAnswerKey() {
        answerKey.put(1, "b");
        answerKey.put(2, "b");
        answerKey.put(3, "a");
        answerKey.put(4, "c");
        answerKey.put(5, "b");
        answerKey.put(6, "d");
        answerKey.put(7, "b");
        answerKey.put(8, "b");
        answerKey.put(9, "c");
        answerKey.put(10, "c");
        answerKey.put(11, "b");
        answerKey.put(12, "c");
        answerKey.put(13, "a");
        answerKey.put(14, "d");
        answerKey.put(15, "b");
        answerKey.put(16, "d");
        answerKey.put(17, "c");
        answerKey.put(18, "a");
        answerKey.put(19, "b");
        answerKey.put(20, "c");
        answerKey.put(21, "c");
        answerKey.put(22, "b");
        answerKey.put(23, "d");
        answerKey.put(24, "b");
        answerKey.put(25, "b");
        answerKey.put(26, "c");
        answerKey.put(27, "a");
        answerKey.put(28, "a");
        answerKey.put(29, "a");
        answerKey.put(30, "d");
        answerKey.put(31, "a");
        answerKey.put(32, "b");
        answerKey.put(33, "c");
        answerKey.put(34, "b");
        answerKey.put(35, "b");
        answerKey.put(36, "a");
        answerKey.put(37, "c");
        answerKey.put(38, "b");
        answerKey.put(39, "d");
        answerKey.put(40, "a");
    }

    /**
     * function grade computes the user's test score
     * @param studentAnswers - an ArrayList of student answers a-d
     * @return correct - the number of correct answers
     * */
    public int grade(ArrayList<String> studentAnswers) {
        int correct = 0;
        for (int i = 1; i < studentAnswers.size(); i++) {
            if (studentAnswers.get(i).equals(answerKey.get(i))) {
                correct++;
            }
        }
        return correct;
    }

}
