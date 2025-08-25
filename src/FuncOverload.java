
public class FuncOverload {
    public static void main(String[] args) {
    //When 2 functs with same name but different types of args are taken java at compile time checks the args type and executes the respected function.

        fun(43);
        // fun("Neev");
    }

    static void fun (int a){
        System.out.println(a);
    }
    static void fun(String name){
        System.out.println(name);
    }
}
