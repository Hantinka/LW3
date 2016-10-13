/**
 * Created by Irina on 24.08.2016.
 */
public class ShortMethods {
    static void shortMethods (){
        Short shortA = new Short("123");
        Short shortB = new Short("456");
        Integer integerC = new Integer(3);
        System.out.println("Short.MAX_VALUE = " + Short.MAX_VALUE);
        System.out.println("Short.MIN_VALUE = " + Short.MIN_VALUE);
        System.out.println("integerC.shortValue() = " + integerC.shortValue());
        System.out.println("shortA.compareTo(shortB) = " + shortA.compareTo(shortB));
        System.out.println("shortA.byteValue() = " + shortA.byteValue());
        System.out.println("shortA.equals(integerC) = " + shortA.equals(integerC));
        System.out.println("shortA.floatValue() = " + shortA.floatValue());
        System.out.println("shortA.hashCode() = " + shortA.hashCode());
        System.out.println("shortA.intValue() = " + shortA.intValue());
        System.out.println("shortA.doubleValue() = " + shortA.doubleValue());
        System.out.println("shortA.longValue() = " + shortA.longValue());
        System.out.println("shortA.toString() = " + shortA.toString());
    }
}
