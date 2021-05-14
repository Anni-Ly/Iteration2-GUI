package sample;

public class Clinic {

    private Integer clinicNumber;
    private Holidays holidays;
    public Clinic(Integer clinicNumber, Holidays inputHolidays) {
        this.clinicNumber = clinicNumber;
        this.holidays = inputHolidays;
    }

    public Holidays getHolidays() {
        return holidays;
    }

    public void setHolidays(Holidays holidays) {
        this.holidays = holidays;
    }
}
