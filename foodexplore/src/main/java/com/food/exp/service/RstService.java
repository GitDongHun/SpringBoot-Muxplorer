package com.food.exp.service;

import java.util.List;
import com.food.exp.dto.RstDTO;

public interface RstService {
    List<RstDTO> getAllRestaurants();
    void saveRestaurant(RstDTO restaurant);
    RstDTO getRestaurantById(String rst_id);
    // 다른 비즈니스 로직 메서드
}
