/**
 * Created by Irina on 23.08.2016.
 */
public class FloatMethods {
    static void floatMethods (){
        Float floatA = new Float(1.26f);
        Float floatB = new Float(2.58f);
        Integer integerC = new Integer(3);
        System.out.println("Float.MAX_VALUE = " + Float.MAX_VALUE);
        System.out.println("Float.MIN_VALUE = " + Float.MIN_VALUE);
        System.out.println("integerC.floatValue() = " + integerC.floatValue());
        System.out.println("floatA.compareTo(floatB) = " + floatA.compareTo(floatB));
        System.out.println("floatA.byteValue() = " + floatA.byteValue());
        System.out.println("floatA.equals(integerC) = " + floatA.equals(integerC));
        System.out.println("floatA.doubleValue() = " + floatA.doubleValue());
        System.out.println("floatA.hashCode() = " + floatA.hashCode());
        System.out.println("floatA.intValue() = " + floatA.intValue());
        System.out.println("floatA.longValue() = " + floatA.longValue());
        System.out.println("floatA.shortValue() = " + floatA.shortValue());
        System.out.println("floatA.toString() = " + floatA.toString());
    }
}
