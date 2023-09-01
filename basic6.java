public class basic6 {
    public static void main(String[] args) {
        Movie m1 = new Movie("ddlj","red chillies","3 Star");
        Movie m2 = new Movie("yjhd","Dhanma","5 Star");
        Movie m3 = new Movie("znmd","Dharma","4 Star");
        Movie m4 = new Movie("gadar","Tseries","5 Star");
        Movie m5 = new Movie("yariyaan","Dharma","5 Star");
        Movie m6 = new Movie("3idiots","Chopra","2 ");

        Movie[] arrMovie = {m1,m2,m3,m4,m5,m6};
        Movie[] result = Movie.get5StarMovies(arrMovie);

        for (int i = 0; i < result.length; i++) {
            System.out.println(i+1+".");
            System.out.println("Title : " + result[i].getTitle());
            System.out.println("Studio : " + result[i].getStudio());
            System.out.println("Rating : " + result[i].getRating());
            System.out.println();
        }
    }
}

class Movie{
    private String title;
    private String studio;
    private String rating;

    public Movie(String title,String studio, String rating){
        this.title=title;
        this.studio=studio;
        this.rating=rating;
    }

    public Movie(String title, String studio) {
        this.title = title;
        this.studio = studio;
        this.rating = "5 Star";
    }

    public static Movie[] get5StarMovies(Movie arrMovie[]){
        int count = 0;
        for(int i=0;i< arrMovie.length;i++){
            if(arrMovie[i].rating.equals("5 Star")){
                count++;
            }
        }
        Movie result[] = new Movie[count];
        int j=0;
        for(int i = 0; i < arrMovie.length; i++) {
            if (arrMovie[i].rating.equals("5 Star")) {
                result[j] = arrMovie[i];
                j++;
            }
        }
        return result;
    }


    public String getTitle() {
        return title;
    }

    public String getStudio() {
        return studio;
    }

    public String getRating() {
        return rating;
    }
}
