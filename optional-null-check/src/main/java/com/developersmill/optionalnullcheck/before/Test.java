package com.developersmill.optionalnullcheck.before;

public final class Test {

    public void displayNumberOfMoviesRentInCurrentMonth(User user) {
        if (user.getRentHistory() != null && user.getRentHistory().getTotalInCurrentMonth() != null) {
            System.out.println("Number of movies user rent is this month is: " + getTotal(user.getRentHistory()));
        } else {
            System.out.println("User has not rent any movie in the current month");
        }
    }

    private Integer getTotal(RentHistory history) {
        return history.getTotalInCurrentMonth();
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.displayNumberOfMoviesRentInCurrentMonth(new User());
    }

}
