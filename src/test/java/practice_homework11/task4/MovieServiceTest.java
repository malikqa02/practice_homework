package practice_homework11.task4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class MovieServiceTest {
    MovieService movieService;
    /**
     * позитивные:
     * добавление первого рейтинга фильму (int)
     * добавление второго рейтинга фильму (double)
     * показать сортированный список из 3 фильмов
     * негативные:
     * добавление негативного рейтинга фильму - wrong rating number exception
     * добавление  рейтинга 15 фильму - wrong rating number exception
     */

    @BeforeEach
    public void setUpTest(){
        movieService = new MovieService();
    }


    @Test
    public void userCanAddValidIntRatingFirst(){
        Movie movie1 = new Movie("Terminator");
        movieService.addRating(movie1, new Rating<>(1));
        Double expectedRating = 1.0;
        Double actualRating = movieService.getAverageRating(movie1);
        assertEquals(expectedRating, actualRating);
    }

    @Test
    public void userCanAddValidDoubleRatingSecond(){
        Movie movie1 = new Movie("Terminator");
        movieService.addRating(movie1, new Rating<>(2.0));
        movieService.addRating(movie1, new Rating<>(4.0));
        Double expectedRating = 3.0;
        Double actualRating = movieService.getAverageRating(movie1);
        assertEquals(expectedRating, actualRating);
    }

    @Test
    public void userCanSort3Movies(){
        Movie movie1 = new Movie("Terminator");
        Movie movie2 = new Movie("Shrek");
        Movie movie3 = new Movie("Harry Potter");
        movieService.addRating(movie1, new Rating<>(2.0));
        movieService.addRating(movie2, new Rating<>(4.0));
        movieService.addRating(movie3, new Rating<>(5.0));
        List<String> expectedList = List.of("Harry Potter - 5.0", "Shrek - 4.0", "Terminator - 2.0");
        List<String> actualList = movieService.sortByRating();
        assertEquals(expectedList, actualList);
    }

    @Test
    public void userCanAddinvalidRatingNegative(){
        Movie movie1 = new Movie("Terminator");
        assertThrows(WrongRatingNumber.class, () -> {
           movieService.addRating(movie1, new Rating<>(-2.0));
        });
    }@Test

    public void userCanAddinvalidRatingPositive(){
        Movie movie1 = new Movie("Terminator");
        assertThrows(WrongRatingNumber.class, () -> {
           movieService.addRating(movie1, new Rating<>(15));
        });
    }
}
