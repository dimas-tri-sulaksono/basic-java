package Day3.Scanner.App.Review;

import java.io.*;
import java.util.*;

public class Review {
    public String name;
    private int rating;

    public Review(String name, int rating){
        this.name = name;
        this.rating = rating;
    }

    // inner class
    public static class ReviewController{
        private final List<Review> reviewList;

        public ReviewController(){
            reviewList = new ArrayList<>();
        }

        // method
        public void addReview(Review review){
            reviewList.add(review);
        }

        public void displayAllReview(){
            if(!reviewList.isEmpty()){
                for (Review review : reviewList){
                    System.out.println("nama: "+ review.name +", rating: "+ review.rating);
                }
            } else {
                System.out.println("product tidak tersedia");
            }
        }

    }
}
