package practice_homework11.task4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MovieService {
    Map<Movie, List<Rating<? extends Number>>> ratings = new HashMap<>();
    public synchronized void addRating(Movie movie, Rating<? extends Number> rating){
        ratings.computeIfAbsent(movie, m -> new ArrayList<>()).add(rating);
    }
    public double getAverageRating(Movie movie){
        return ratings.getOrDefault(movie, List.of())
                .stream()
                .mapToDouble((r -> r.getValue().doubleValue()))
                .average()
                .orElse(0);
    }

    public List<String> sortByRating(){
        return ratings.keySet()
                .stream()
                .sorted((m1, m2) ->
                         Double.compare(getAverageRating(m2), getAverageRating(m1)))
                .map(m -> m.getNameOfMovie() + " - " + getAverageRating(m))
                .toList();
    }
}
