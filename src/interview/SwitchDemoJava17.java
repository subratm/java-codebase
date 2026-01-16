package interview;

import static java.lang.Boolean.TRUE;

public class SwitchDemoJava17 {

    public static String process(Object object){
        return switch (object){
            case Integer i -> "Its an Integer";
            case String s -> "Its an String";
            case Double d -> "Its an Double";
            case Boolean b -> "Its an Boolean";
            case null -> "Input is null";
            default -> "Unknown type";
        };
    }

    public static void main(String[] args) {
        System.out.println(process(TRUE));

    }

}
