package dip.lab2.student.solution1;

// An useful import if you need it.
import dip.lab1.instructor.solution1.Employee;
import dip.lab1.instructor.solution1.HRService;
import dip.lab1.instructor.solution1.HourlyEmployee;
import dip.lab1.instructor.solution1.SalariedEmployee;
import dip.lab2.*;
import java.text.NumberFormat;
// Another useful import if you need it.
import javax.swing.JOptionPane;

/**
 * Just a test class for input and output.
 *
 * 1. Create instances of low-level classes using Liskov Substitution principle.
 * 2. Create an instance of your high-level class.
 * 3. Pass one of your calculator instances to the high-level class and
 *    check the results.
 * 4. Now switch to a different calculator instance and pass that to the
 *    high-level class. Did it work? Are the low-level instances
 *    interchangeable? The DIP requires this.
 * 
 * @author Larry Mastel
 */
public class Startup {
    public static enum ServiceQuality {
           GOOD, FAIR, POOR
    };
 
    public static void main(String[] args) {
        
        //params service quality, number of bags
        
        //original code
//        BaggageServiceTipCalculator service =
//                new BaggageServiceTipCalculator(
//                BaggageServiceTipCalculator.ServiceQuality.FAIR,5);
//        
        
              
        
        /*
         * We'll just use this class for testing our ccde.
         * We'll provide input and get some output...
         */

        //Low-level modules
       BaggageServiceTipCalculator service1 =  new BaggageServiceTipCalculator(
                BaggageServiceTipCalculator.ServiceQuality.FAIR,25);
       
       FoodServiceTipCalculator service2 =  new FoodServiceTipCalculator(
                FoodServiceTipCalculator.ServiceQuality.FAIR,100.00);
  
        
        
        // Create a collection that we can process as a group --
        // demands polymorphic behavior
        
        TipCalculator[] services = {service1, service2};

        // High-level module
        TipService ts = new TipService();

        // Just utility code to format numbers nice.
        NumberFormat nf = NumberFormat.getCurrencyInstance();

        // Test input/output by looping over collection in a way that
        // doesn't break if we add/subtract employees from array
        for(int i=0; i < services.length; i++) {
            System.out.println("Service " + (i+1) + " tip: " + 
                    nf.format(ts.getTipForService(services[i])));
        }
        
        // Or, we could do this...but this is fragile
//        System.out.println("Baggage Service Tip: " +
//            nf.format(ts.getTip(service1)));
//        System.out.println("Food Service Tip: " +
//            nf.format(ts.getTip(service2));
        
        
        
    }

}
