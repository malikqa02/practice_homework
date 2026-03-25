package practice_homework11.task4;

public class Main {
    public static void main(String[] args) {
        Movie movie1 = new Movie("Terminator");
        MovieService movieService = new MovieService();
        movieService.addRating(movie1, new Rating<>(1));
        movieService.addRating(movie1, new Rating<>(10));
        movieService.addRating(movie1, new Rating<>(5));
        movieService.addRating(movie1, new Rating<>(8));
        System.out.println(movieService.getAverageRating(movie1));
        Movie movie2 = new Movie("Shrek");
        movieService.addRating(movie2, new Rating<>(10));
        movieService.addRating(movie2, new Rating<>(7));
        movieService.addRating(movie2, new Rating<>(8));
        movieService.addRating(movie2, new Rating<>(9));
        movieService.addRating(movie2, new Rating<>(9));
        System.out.println(movieService.sortByRating());
    }
}
