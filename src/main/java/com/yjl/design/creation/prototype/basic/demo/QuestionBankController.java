package com.yjl.design.creation.prototype.basic.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author yujiale
 * @Date 2022/6/25 18:14
 * @Description TODO
 **/
public class QuestionBankController {

    public String createPapers(String candidate, String number) {
        List<ChoiceQuestion> choiceQuestionList = new ArrayList<ChoiceQuestion>();

        List<AnswerQuestion> answerQuestionList = new ArrayList<AnswerQuestion>();


        Map<String, String> choiceMap01 = new HashMap<String, String>();

        choiceMap01.put("A", "Java EE");
        choiceMap01.put("B", "Java Card");
        choiceMap01.put("C", "Java ME");
        choiceMap01.put("D", "Java HE");
        choiceMap01.put("E", "Java SE");

        Map<String, String> choiceMap02 = new HashMap<>();


        choiceMap02.put("A", "Java");
        choiceMap02.put("B", "Java");
        choiceMap02.put("C", "Java");
        choiceMap02.put("D", "Java");

        Map<String, String> choiceMap03 = new HashMap<>();


        choiceMap02.put("A", "Java");
        choiceMap02.put("B", "Java");
        choiceMap02.put("C", "Java");
        choiceMap02.put("D", "Java");
        Map<String, String> choiceMap04 = new HashMap<>();


        choiceMap04.put("A", "Java");
        choiceMap04.put("B", "Java");
        choiceMap04.put("C", "Java");
        choiceMap04.put("D", "Java");

        Map<String, String> choiceMap05 = new HashMap<>();


        choiceMap05.put("A", "Java");
        choiceMap05.put("B", "Java");
        choiceMap05.put("C", "Java");
        choiceMap05.put("D", "Java");


        choiceQuestionList.add(new ChoiceQuestion("Java", choiceMap01, "D"));
        choiceQuestionList.add(new ChoiceQuestion("Java", choiceMap02, "A"));
        choiceQuestionList.add(new ChoiceQuestion("Java", choiceMap03, "B"));
        choiceQuestionList.add(new ChoiceQuestion("Java", choiceMap04, "C"));
        choiceQuestionList.add(new ChoiceQuestion("Java", choiceMap05, "D"));


        answerQuestionList.add(new AnswerQuestion("小红", "4条腿"));
        answerQuestionList.add(new AnswerQuestion("小红", "4条腿"));
        answerQuestionList.add(new AnswerQuestion("小红", "4条腿"));


        StringBuilder details = new StringBuilder("考生：" + candidate + "\r\n" + "考号：" + number);

        for (int idx = 0; idx < choiceQuestionList.size(); idx++) {

        }

        for (int idx = 0; idx < answerQuestionList.size(); idx++) {

        }

        return details.toString();

    }
}
