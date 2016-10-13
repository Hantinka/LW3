/**
 * Created by Irina on 23.08.2016.
 */
public class ByteMethods {
    static void byteMethods (){
        Byte byteA = new Byte("1");
        Byte byteB = new Byte("2");
        Integer integerC = new Integer(3);
        System.out.println("Byte.MAX_VALUE = " + Byte.MAX_VALUE);
        System.out.println("Byte.MIN_VALUE = " + Byte.MIN_VALUE);
        System.out.println("integerC.byteValue() = " + integerC.byteValue());
        System.out.println("byteA.compareTo(byteB) = " + byteA.compareTo(byteB)); //Если Integer равно аргументу, то возвращается 0. Если Integer меньше, чем аргумент, то возвращается -1. Если Integer больше, чем аргумент, то возвращается 1.
        System.out.println("byteA.doubleValue() = " + byteA.doubleValue());
        System.out.println("byteA.equals(integerC) = " + byteA.equals(integerC));
        System.out.println("byteA.floatValue() = " + byteA.floatValue());
        System.out.println("byteA.hashCode() = " + byteA.hashCode());
        System.out.println("byteA.intValue() = " + byteA.intValue());
        System.out.println("byteA.longValue() = " + byteA.longValue());
        System.out.println("byteA.shortValue() = " + byteA.shortValue());
        System.out.println("byteA.toString() = " + byteA.toString());
    }
}
