package movies;
import util.Input;

import java.util.Arrays;

public class MovieApplication {
    public static void main(String[] args) {
        MovieApplication mA = new MovieApplication();
        Movie[] movies =MoviesArray.findAll();
        Input input = new Input();
        int caseNumbers =7;
        do {
            System.out.print("What would you like to do?\n\n0 - exit\n1 - view all movies\n2 - view movies in the musical category\n3 - view movies in the drama category\n4 - view movies in the horror category\n5 - view movies in the sci-fi category\n6 - view movies in comedy category\n7 - Add a new movie");
            int menuChoice = input.getInt(0, caseNumbers, "\n\nEnter your choice: ");
                switch (menuChoice) {
                    case 0:
                        System.exit(0);
                        break;
                    case 1:
                        mA.printMovieTitle(movies);
                        break;
                    case 2:
                        mA.printCategory("musical", movies);
                        break;
                    case 3:
                        mA.printCategory("drama", movies);
                        break;
                    case 4:
                        mA.printCategory("horror", movies);
                        break;
                    case 5:
                        mA.printCategory("scifi", movies);
                        break;
                    case 6:
                        mA.printCategory("comedy", movies);
                        break;
                    case 7:
                        movies = mA.addNewMovie(movies);
                        menuChoice = -1;
                        break;


            }
        }while(true);
    }
    public void printMovieTitle(Movie[] movies){
        for(Movie movie: movies) {
            printMovieTitle(movie);
        }
    }
    public void printMovieTitle(Movie movie){
        System.out.println("Title: " + movie.getName() + " || Category: " + movie.getCategory());
    }
    public void printCategory(String category, Movie[] movies){
        MovieApplication mA = new MovieApplication();
        for(Movie movie: movies) {
            if (movie.getCategory().equals(category)) {
                mA.printMovieTitle(movie);
            }
        }
    }
    public Movie[] addNewMovie(Movie[] movies){
        Input input = new Input();
        String newMovieTitle = input.getString("What is the movie's title?");
        String newMovieCategory= input.getString("What is the movie's category?");
        Movie movie = new Movie(newMovieTitle, newMovieCategory);
        movies = Arrays.copyOf(movies, movies.length+1);
        movies[movies.length-1] = movie;
        return movies;
    }

}
