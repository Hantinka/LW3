/**
 * Created by Irina on 24.08.2016.
 */
public class IntegerMethods {
    static void integerMethods (){
        Integer integerA = new Integer(1);
        Integer integerB = new Integer(2);
        Double doubleC = new Double(3);
        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);
        System.out.println("Integer.MIN_VALUE = " + Integer.MIN_VALUE);
        System.out.println("integerA.byteValue() = " + integerA.byteValue());
        System.out.println("integerA.compareTo(integerB) = " + integerA.compareTo(integerB)); //Если Integer равно аргументу, то возвращается 0. Если Integer меньше, чем аргумент, то возвращается -1. Если Integer больше, чем аргумент, то возвращается 1.
        System.out.println("integerA.doubleValue() = " + integerA.doubleValue());
        System.out.println("integerA.equals(doubleC) = " + integerA.equals(doubleC));
        System.out.println("integerA.floatValue() = " + integerA.floatValue());
        System.out.println("integerA.hashCode() = " + integerA.hashCode());
        System.out.println("integerA.longValue() = " + integerA.longValue());
        System.out.println("integerA.shortValue() = " + integerA.shortValue());
        System.out.println("integerA.toString() = " + integerA.toString());
    }
}
