package dip.lab2.student.solution1;

// An useful import if you need it.
import java.text.NumberFormat;
// Another useful import if you need it.

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
//    public static enum ServiceQuality {
//           GOOD, FAIR, POOR
//    };
 
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
        //parms (ServiceQuality q, int bags)
       BaggageServiceTipCalculator service1 =  new BaggageServiceTipCalculator(
                BaggageServiceTipCalculator.ServiceQuality.FAIR,25);
       
       //parms (ServiceQuality q, double billAmt)
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
            if (i==0){
                System.out.println("Bag Count: " + service1.getBagCount()); 
                System.out.println("Service Quality: " + service1.getServiceQuality());
                System.out.println("Base Tip Per Bag: " + nf.format(service1.getBaseTipPerBag()));
                System.out.println("Baggage (Service " + (i+1) + ") tip: " + 
                    nf.format(ts.getTipForService(services[i]))); 
                System.out.println("");
            }
            else {
                System.out.println("Bill Amount: " + nf.format(service2.getBill()));
                System.out.println("Service Quality: " + service2.getServiceQuality());
                System.out.println("Food  (Service " + (i+1) + ") tip: " + 
                    nf.format(ts.getTipForService(services[i])));
            }
            
        }
        
        // Or, we could do this...but this is fragile
//        System.out.println("Baggage Service Tip: " +
//            nf.format(ts.getTip(service1)));
//        System.out.println("Food Service Tip: " +
//            nf.format(ts.getTip(service2));
        
        
        
    }

}
