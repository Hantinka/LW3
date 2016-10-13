/**
 * Created by Irina on 24.08.2016.
 */
public class LongMethods {
    static void longMethods (){
        Long longA = new Long(123655);
        Long longB = new Long(758963);
        Integer integerC = new Integer(3);
        System.out.println("Long.MAX_VALUE = " + Long.MAX_VALUE);
        System.out.println("Long.MIN_VALUE = " + Long.MIN_VALUE);
        System.out.println("integerC.longValue() = " + integerC.longValue());
        System.out.println("longA.compareTo(longB) = " + longA.compareTo(longB));
        System.out.println("longA.byteValue() = " + longA.byteValue());
        System.out.println("longA.equals(integerC) = " + longA.equals(integerC));
        System.out.println("longA.floatValue() = " + longA.floatValue());
        System.out.println("longA.hashCode() = " + longA.hashCode());
        System.out.println("longA.intValue() = " + longA.intValue());
        System.out.println("longA.doubleValue() = " + longA.doubleValue());
        System.out.println("longA.shortValue() = " + longA.shortValue());
        System.out.println("longA.toString() = " + longA.toString());
    }
}
