package com.example.quizapp.dao;

import com.example.quizapp.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionDao extends JpaRepository<Question, Integer> {

    @Query(value = "select * from question where LOWER(category) = LOWER(:category)", nativeQuery = true)
    public List<Question> findByCategory(@Param("category") String category);


//    Not working because of case sensitivity
//    public List<Question> findByCategory(String category);
}
