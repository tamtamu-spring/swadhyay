package com.example.sawdhyay.services;

import com.example.sawdhyay.models.Question;

import java.util.List;

public interface QuestionService {

    void addQuestion(Question question);

    void updateQuestion(Question question);

    void deleteQuestionById(int id);

    List<Question> findAllQuestions();

    Question getQuestionById(int id);
    
}
