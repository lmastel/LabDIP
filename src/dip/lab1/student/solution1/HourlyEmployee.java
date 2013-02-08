package dip.lab1.student.solution1;

import dip.lab1.*;

/**
 * An implementation sub-class of an Employee. These are low-level classes
 * in the DIP. Does it meet the rules of DIP? If not fix it.
 *
 * @author Larry Mastel
 */

//low-level class should depend on abstraction
//public class HourlyEmployee extends Employee {
public class HourlyEmployee implements Employee {
    
    //moved from Employee class
    private double hourlyRate;
    private double totalHrsForYear;
    
    /** default constructor. Is this the best way to go? */
    public HourlyEmployee() {}

    /**
     * Convenience constructor. Is this the best way to go?
     * @param hourlyRate - the rate per hour that the employee is paid
     * @param totalHrsForYear - total hours worked or predicted per year
     */
    public HourlyEmployee(double hourlyRate, double totalHrsForYear) {
        setHourlyRate(hourlyRate);
        setTotalHrsForYear(totalHrsForYear);
    }
    
    //moved from Employee class
    //move code to new getAnnualCompensation method
//    public double getAnnualWages() {
//        return hourlyRate * totalHrsForYear;
//    }

    //moved from Employee class
    public double getHourlyRate() {
        return hourlyRate;
    }
    
    //moved from Employee class
    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
    
    //moved from Employee class
    public double getTotalHrsForYear() {
        return totalHrsForYear;
    }
    
    //moved from Employee class
    public void setTotalHrsForYear(double totalHrsForYear) {
        this.totalHrsForYear = totalHrsForYear;
    }

    @Override
    public double getAnnualCompensation() {
        return hourlyRate * totalHrsForYear;
    }
}
