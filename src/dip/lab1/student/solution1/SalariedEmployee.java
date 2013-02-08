package dip.lab1.student.solution1;

/**
 * A simple implementation sub-class of Employee. These are low-level classes
 * in the DIP. Does it meet the rules of DIP? If not fix it.
 *
 * @author Larry Mastel
 */
//low-level class should depend on abstraction
//public class SalariedEmployee extends Employee {
public class SalariedEmployee implements Employee {
    
    private double annualSalary; //moved from Employee class
    private double annualBonus;  //moved from Employee class

    /** default constructor. Is this the best way to go? */
    //I don't think having a default constructor is the best way.
    //I want the data passed through the paramatized constructor and
    //I want the constuctors and called methods to be consistent with
    //the HourlyEmployee class.
    //public SalariedEmployee() {}

    /**
     * Convenience constructor. Is this the best way to go?
     * @param annualSalary - the employee's annual salary
     * @param annualBonus - a bonus benefit, if any
     */
    public SalariedEmployee(double annualSalary, double annualBonus) {
        setAnnualSalary(annualSalary);
        setAnnualBonus(annualBonus);
    }

    //moved from Employee class
    public double getAnnualBonus() {
        return annualBonus;
    }
    
    //moved from Employee class
    //made private so the method is only controlled by the constructor
    private void setAnnualBonus(double annualBonus) {
        this.annualBonus = annualBonus;
    }
    
    //moved from Employee class
    //moved to new getAnnualCompensation method
//    public double getAnnualSalary() {
//        return annualSalary;        
//    }
    
    //moved from Employee class
    //made private so the method is only controlled by the constructor
    private void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    //annualBonus was missing from the annual compenstion claculation
    //so it was added
    @Override
    public double getAnnualCompensation() {
        return annualSalary + annualBonus;
    }
}
