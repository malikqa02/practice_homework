package practice_homework11.task4;


public class Movie {
    String nameOfMovie;

    public String getNameOfMovie() {
        return nameOfMovie;
    }

    public Movie(String nameOfMovie) {
        this.nameOfMovie = nameOfMovie;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Movie)) return false;
        Movie movie = (Movie) o;
        return nameOfMovie.equals(movie.nameOfMovie);
    }
    @Override
    public int hashCode(){
        return nameOfMovie.hashCode();
    }

}

