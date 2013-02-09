
package dip.lab2.student.solution1;

/**
 *
 * @author LPM
 */
public interface TipCalculator {
    public enum ServiceQuality {
        GOOD, FAIR, POOR
    }
    
    public abstract void setServiceRating(ServiceQuality q);
    
    public abstract ServiceQuality getServiceQuality();
    
    public abstract double getTipForService();
}
