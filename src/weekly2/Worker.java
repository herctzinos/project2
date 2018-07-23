package weekly2;

import java.text.DecimalFormat;

public class Worker extends Person {

    private double weekSalary;
    private double hours_per_day;

    public Worker(String firstName, String lastName, double weekSalary, double hours_per_day) {
        super(firstName, lastName);
        setWeekSalary(weekSalary);
        setHours_per_day(hours_per_day);
    }

    public void setWeekSalary(double weekSalary) {

        if (weekSalary > 10) {
            this.weekSalary = weekSalary;
        } else {
            this.weekSalary = 0;
        }
    }

    public void setHours_per_day(double hours_per_day) {

        if ((hours_per_day >= 1) && (hours_per_day <= 12)) {
            this.hours_per_day = hours_per_day;
        } else {
            this.hours_per_day = 0;
        }
    }

    public double getWeekSalary() {

        return weekSalary;
    }

    public double getHours_per_day() {

        return hours_per_day;
    }

    public double moneyHour() {

        double money_per_hour = weekSalary / (hours_per_day * 5);
        return (money_per_hour);
    }

    public String toString() {
        DecimalFormat df = new DecimalFormat("#.00");

        System.out.println("First Name : " + getFirstName());
        System.out.println("Last Name : " + getLastName());
        System.out.println("Week Salary : " + df.format(getWeekSalary()));
        System.out.println("Hours Per Day : " + df.format(getHours_per_day()));
        System.out.println("Salary per hour : " + df.format(moneyHour()));

        return "\n";
    }
}
