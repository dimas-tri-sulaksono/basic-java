package Day3.Scanner.App.Review;

import java.util.Scanner;

public class ReviewMain {
    public static void main() {
            Review.ReviewController reviewController = new Review.ReviewController();


            while (true){
                Scanner input = new Scanner(System.in);
                System.out.println("apakah anda ingin menambahkan review? (Y/N) : ");
                String addReviewChoice = input.nextLine().toLowerCase();

                if(addReviewChoice.equals("y")){
                    System.out.println("masukkan nama : ");
                    String nama = input.nextLine();

                    int rating;
                    while (true) {
                        System.out.println("rating (1 - 10): ");
                        if (input.hasNextInt()) {
                            rating = input.nextInt();
                            if (rating >= 1 && rating <= 10) {
                                input.nextLine();
                                break;
                            } else {
                                System.out.println("rating harus antara 1 - 10!");
                            }
                        } else {
                            System.out.println("input tidak valid! masukkan angka antara 1 sampai 10.");
                            input.next();
                        }
                    }

                    Review review = new Review(nama, rating);
                    reviewController.addReview(review);
                } else {
                    break;
                }
            }

            System.out.println("=== REVIEW LIST ===");
            reviewController.displayAllReview();
    }
}