public class DemoClass {
    public static void main(String args[]){
        String str="ABCDEFG";
        int x=1;
        int y=2;

        System.out.println(add(x,y));
        System.out.println(isStr(str));
        System.out.println(sub(x,y));
        System.out.println(divide(x,y));
        System.out.println(multiply(x,y));
    }
    public static int add(int x, int y){
        return x+y;
    }
    public static boolean isStr(String str){
        if(str.equals("ABCDEFG")) return true;
        return false;
    }
    public static int sub(int x, int y){
        return x-y;
    }
    public static int divide(int x, int y){
        return x/y;
    }
    public static int multiply(int x, int y){
        return x*y;
    }
}
