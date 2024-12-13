package nested.nested;


public class NestedOuterMain {

    public static void main(String[] args) {
//        NestedOuter outer = new NestedOuter();
        NestedOuter.Nested nested = new NestedOuter.Nested();
        nested.print();

        System.out.println("nestedClass = " + nested.getClass());

        Integer num1 = NestedOuter.outClassValue2;
        Integer num2 = NestedOuter.outClassValue2;
        System.out.println(num1 == num2);

        NestedOuter.Nested static1 = new NestedOuter.Nested();
        NestedOuter.Nested static2 = new NestedOuter.Nested();
        System.out.println();
    }
}
