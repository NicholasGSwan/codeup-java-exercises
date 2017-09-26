package movies;
import util.Input;

public class MovieApplication {
    public static void main(String[] args) {
        MovieApplication mA = new MovieApplication();
        Input input = new Input();
        do {
            System.out.print("What would you like to do?\n\n0 - exit\n1 - view all movies\n2 - view movies in the musical category\n3 - view movies in the drama category\n4 - view movies in the horror category\n5 - view movies in the sci-fi category\n6 - view movies in comedy category");
            int menuChoice = input.getInt(0, 6, "\n\nEnter your choice: ");
            for (Movie movie : MoviesArray.findAll()) {
                switch (menuChoice) {
                    case 0:
                        System.exit(0);
                        break;
                    case 1:
                        mA.printMovieTitle(movie);

                        break;
                    case 2:
                        mA.printCategory("musical", movie);
                        break;
                    case 3:
                        mA.printCategory("drama", movie);
                        break;
                    case 4:
                        mA.printCategory("horror", movie);
                        break;
                    case 5:
                        mA.printCategory("scifi", movie);
                        break;
                    case 6:
                        mA.printCategory("comedy", movie);
                        break;

                }
            }
        }while(true);
    }
    public void printMovieTitle(Movie movie){
        System.out.println("Title: "+movie.getName()+" || Category: "+movie.getCategory());
    }
    public void printCategory(String category, Movie movie){
        MovieApplication mA = new MovieApplication();
        if (movie.getCategory().equals(category)){
            mA.printMovieTitle(movie);
        }
    }

}
