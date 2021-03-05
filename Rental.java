public class Rental {

    private Movie _movie;
    private int _daysRented;
 
    public Rental(Movie movie, int daysRented) {
       _movie = movie;
       _daysRented = daysRented;
    }
 
    public int getDaysRented() {
       return _daysRented;
    }
 
    public Movie getMovie() {
       return _movie;
    }

    public double getCharge() {
      // determine amounts for each line
      return _movie.getCharge(_daysRented);
   }

   public int getFrequentRenterPoints(){
      int frequentRenterPoints=1;
      if ((this._movie.getPriceCode() == Movie.NEW_RELEASE) &&
         this.getDaysRented() > 1) frequentRenterPoints ++;
      return frequentRenterPoints;
   }
 }