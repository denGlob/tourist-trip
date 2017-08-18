package model.entities;

import java.time.LocalDate;

/**
 * Created by denglob on 8/18/17.
 */
public class Booking {

    enum Decor {
        IN_PROCESS, REGECT, CONFIRM
    }

    private int id;
    private User user;
    private Budget budget;
    private Pass pass;
    private Decor decor;

    private LocalDate startWeekend;
    private LocalDate endWeekend;

    public static class Builder {
        private int id;
        private User user;
        private Budget budget;
        private Pass pass;
        private Decor decor;

        private LocalDate startWeekend;
        private LocalDate endWeekend;

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setUser(User user) {
            this.user = user;
            return this;
        }

        public Builder setBudget(Budget budget) {
            this.budget = budget;
            return this;
        }

        public Builder setPass(Pass pass) {
            this.pass = pass;
            return this;
        }

        public Builder setDecor(Decor decor) {
            this.decor = decor;
            return this;
        }

        public Builder setStartWeekend(LocalDate startWeekend) {
            this.startWeekend = startWeekend;
            return this;
        }

        public Builder setEndWeekend(LocalDate endWeekend) {
            this.endWeekend = endWeekend;
            return this;
        }

        public Booking build() {
            Booking booking = new Booking();
            booking.setId(id);
            booking.setBudget(budget);
            booking.setDecor(decor);
            booking.setStartWeekend(startWeekend);
            booking.setEndWeekend(endWeekend);
            booking.setPass(pass);
            booking.setUser(user);
            return booking;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Budget getBudget() {
        return budget;
    }

    public void setBudget(Budget budget) {
        this.budget = budget;
    }

    public Pass getPass() {
        return pass;
    }

    public void setPass(Pass pass) {
        this.pass = pass;
    }

    public Decor getDecor() {
        return decor;
    }

    public void setDecor(Decor decor) {
        this.decor = decor;
    }

    public LocalDate getStartWeekend() {
        return startWeekend;
    }

    public void setStartWeekend(LocalDate startWeekend) {
        this.startWeekend = startWeekend;
    }

    public LocalDate getEndWeekend() {
        return endWeekend;
    }

    public void setEndWeekend(LocalDate endWeekend) {
        this.endWeekend = endWeekend;
    }
}
