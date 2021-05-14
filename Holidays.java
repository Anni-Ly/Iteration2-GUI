package sample;

import java.time.LocalDate;
import java.util.ArrayList;

public class Holidays {
    private ArrayList<LocalDate> holidays;

    public Holidays() {
        this.holidays = new ArrayList<LocalDate>();
    }
    public void addHoliday(LocalDate holiday) {
        if (! this.holidays.contains(holiday)) {this.holidays.add(holiday);}
    }
    public void removeHoliday(LocalDate holiday) {
        if (this.holidays.contains(holiday)) {this.holidays.remove(holiday);}
    }

    public ArrayList<LocalDate> getHolidays() { 
        return holidays;
    }

    public Boolean containsDay(LocalDate holiday) {

        return this.holidays.contains(holiday);
    }

    public void printHolidays() {
        System.out.println("Number of holidays: " + this.holidays.size());
        for (LocalDate d : this.holidays) {
            System.out.println(d);
        }

    }

    public Integer getSize() {
        return this.holidays.size();
    }
}

