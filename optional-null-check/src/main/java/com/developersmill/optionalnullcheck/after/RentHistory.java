package com.developersmill.optionalnullcheck.after;

public final class RentHistory {

    private Integer totalInThisMonth;

    private Integer totalFromTheBeginning;

    public RentHistory() {
    }

    public RentHistory(Integer totalInThisMonth, Integer totalFromTheBeginning) {
        this.totalInThisMonth = totalInThisMonth;
        this.totalFromTheBeginning = totalFromTheBeginning;
    }

    public RentHistory(Integer totalInThisMonth) {
        this.totalInThisMonth = totalInThisMonth;
    }

    public Integer getTotalInCurrentMonth() {
        return totalInThisMonth;
    }

    public Integer getTotalFromTheBeginning() {
        return totalFromTheBeginning;
    }

}
