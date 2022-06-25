package com.yjl.design.creation.prototype.basic.demo;

/**
 * @Author yujiale
 * @Date 2022/6/25 18:31
 * @Description 重构之前的历史代码
 **/
public class MainTest {
    public static void main(String[] args) {
        QuestionBankController questionBankController = new QuestionBankController();
        System.out.println(questionBankController.createPapers("张三","123123123"));
        System.out.println(questionBankController.createPapers("李四","123123123"));
        System.out.println(questionBankController.createPapers("王五","123123123"));
    }
}
