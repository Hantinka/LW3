/**
 * Created by Irina on 23.08.2016.
 */
public class DoubleMethods {
    static void doubleMethods (){
        Double doubleA = new Double(1.26);
        Double doubleB = new Double(2.58);
        Integer integerC = new Integer(3);
        System.out.println("Double.MAX_VALUE = " + Double.MAX_VALUE);
        System.out.println("Double.MIN_VALUE = " + Double.MIN_VALUE);
        System.out.println("integerC.doubleValue() = " + integerC.doubleValue());
        System.out.println("doubleA.compareTo(doubleB) = " + doubleA.compareTo(doubleB));
        System.out.println("doubleA.byteValue() = " + doubleA.byteValue());
        System.out.println("doubleA.equals(integerC) = " + doubleA.equals(integerC));
        System.out.println("doubleA.floatValue() = " + doubleA.floatValue());
        System.out.println("doubleA.hashCode() = " + doubleA.hashCode());
        System.out.println("doubleA.intValue() = " + doubleA.intValue());
        System.out.println("doubleA.longValue() = " + doubleA.longValue());
        System.out.println("doubleA.shortValue() = " + doubleA.shortValue());
        System.out.println("doubleA.toString() = " + doubleA.toString());
    }
}
