public class Aaa
{
    public static void main(String[] args)
    {
        System.out.println("hello Ooo");
        show("func1",100);

        System.out.println("func2");
        show("func2");
    }

    public static String show(String name, int age){
        System.out.println("args is :name,age");
        System.out.println("name   is:"+name);
        System.out.println("age is :"+age);
        return "func1";
    }
    public static String show(String name){
        System.out.println("args is:name");
        System.out.println("name is :"+name);
        return "func2";
    }

}
