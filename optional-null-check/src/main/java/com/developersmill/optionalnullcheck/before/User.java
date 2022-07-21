package com.developersmill.optionalnullcheck.before;

public final class User {

    private RentHistory rentHistory;

    public User() {
    }

    public User(RentHistory rentHistory) {
        this.rentHistory = rentHistory;
    }

    public RentHistory getRentHistory() {
        return rentHistory;
    }
}