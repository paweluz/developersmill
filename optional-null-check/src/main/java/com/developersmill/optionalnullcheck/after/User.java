package com.developersmill.optionalnullcheck.after;

import java.util.Optional;

public final class User {

    private RentHistory rentHistory;

    public User() {
    }

    public User(RentHistory rentHistory) {
        this.rentHistory = rentHistory;
    }

    public Optional<RentHistory> getRentHistory() {
        return Optional.ofNullable(rentHistory);
    }
}
