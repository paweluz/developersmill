package com.developersmill.optionalnullcheck.after;

import java.util.Optional;

public final class Test {

    public void displayNumberOfMoviesRentInCurrentMonth(User user) {
        System.out.println(user.getRentHistory()
                .flatMap(this::getTotal)
                .map(total -> "Number of movies user rented in this month is: " + total)
                .orElse("User has not rented any movie in the current month"));
    }

    private Optional<Integer> getTotal(RentHistory history) {
        return Optional.ofNullable(history.getTotalInCurrentMonth());
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.displayNumberOfMoviesRentInCurrentMonth(new User());
    }

}
