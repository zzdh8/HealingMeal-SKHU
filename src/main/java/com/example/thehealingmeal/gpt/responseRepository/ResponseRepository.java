package com.example.thehealingmeal.gpt.responseRepository;

import com.example.thehealingmeal.gpt.domain.GPTResponse;
import com.example.thehealingmeal.menu.domain.Meals;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResponseRepository extends JpaRepository<GPTResponse, Long> {
    GPTResponse findByMealsAndUserId(Meals meals, long userId);

    void deleteAllByUserId(long userId);
}
