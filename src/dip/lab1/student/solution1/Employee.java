package dip.lab1.student.solution1;

/**
 * The concrete super class of all employee types. What's wrong with this class?
 * Find and fix all encapsulation, DIP and best practice problems learned
 * so far.
 *
 * @author Larry Mastel
 */

//The low-level classes HourlyEmployee and SalariedEmployee shpuld depend on
//abstractions so the Employee class will be changed to an interface.
//public class Employee {
public interface Employee {    
    // You gotta question if these are appropriate for ALL employees?
    //hourlyRate and totalHrsForYear are appropriate for HourlyEmployee
    //annualSalary and annualBonus are appropriate for SalariedEmployee
//    private double hourlyRate; - moved to HourlyEmployee class
//    private double totalHrsForYear; - moved to HourlyEmployee class
//    private double annualSalary; - moved to SalariedEmployee class
//    private double annualBonus; - - moved to SalariedEmployee class

    /**
     * Returns annual wages for hourly workers. Is this polymorphic?
     * Could it be? Does it belong here?
     *
     * @return annual wages for hourly workers using the formula
     * annualWages = hourlyRate * totalHrsForYear
     */
    //moved to HourlyEmployee class
//    public double getAnnualWages() {
//        return hourlyRate * totalHrsForYear;
//    }

    /**
     * Returns annual bonus for salaried workers. Is this polymorphic?
     * Could it be? Does it belong here?
     *
     * @return annual bonus or zero if none.
     */
    //moved to SalariedEmployee
//    public double getAnnualBonus() {
//        return annualBonus;
//    }

    /**
     * Is this polymorphic? Should it be? Does it belong here?
     * @param annualBonus -- think carefully about this
     */
    //moved to SalariedEmployee class
//    public void setAnnualBonus(double annualBonus) {
//        this.annualBonus = annualBonus;
//    }

    /**
     * Is this polymorphic? Should it be? Does it belong here?
     * @return
     */
    //moved to SalariedEmployee
//    public double getAnnualSalary() {
//        return annualSalary;
//    }

    /**
     * Is this polymorphic? Should it be? Does it belong here?
     * @param annualSalary - think carefully about this
     */
    //moved to SalariedEmployee
//    public void setAnnualSalary(double annualSalary) {
//        this.annualSalary = annualSalary;
//    }

    /**
     * Is this polymorphic? Should it be? Does it belong here?
     * @return
     */
    //moved to HourlyEmployee class
//    public double getHourlyRate() {
//        return hourlyRate;
//    }

    /**
     * Is this polymorphic? Should it be? Does it belong here?
     * @param hourlyRate -- think carefully about this
     */
    //moved to HourlyEmployee class
//    public void setHourlyRate(double hourlyRate) {
//        this.hourlyRate = hourlyRate;
//    }

    /**
     * Is this polymorphic? Should it be? Does it belong here?
     * @return
     */
    //moved to HourlyEmployee
//    public double getTotalHrsForYear() {
//        return totalHrsForYear;
//    }

    /**
     * Is this polymorphic? Should it be? Does it belong here?
     * @param totalHrsForYear -- think carefully about this
     */
    //moved to HourlyEmployee class
//    public void setTotalHrsForYear(double totalHrsForYear) {
//        this.totalHrsForYear = totalHrsForYear;
//    }
    
    //added abstract method getAnnualCompensation so it can used by both
    //and future Employee subsclasses. This method covers annual wages for
    //hourly employess and and annual salary plus bonus,if any, for
    //salaried employees.    
    public abstract double getAnnualCompensation();

}
