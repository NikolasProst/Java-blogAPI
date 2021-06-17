package ru.romashov.blogapp.repositories.calendar;

import java.util.List;
import java.util.Map;

public interface CalendarRepositoryInterface {

    List<Integer> findAllYears(String year);
    Map<String, Long> findAllPosts(String year);
}
