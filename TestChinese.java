public class TestChinese {
    //用来测试static关键字的使用方法和使用场景
    /*
        总结:
            - 当对象具有一些共同的属性和行为时，可以将其提升到类层面，作为所有对象的共同模板
                使用方法：static （实例变量）、修饰符 static （实例方法） 
            - 当需要在类加载时机进行特殊语句操作时，可以使用static编写静态代码块
                使用方法：static {}
                应用场景:Java日志
    */
    //静态代码块案例
    static{
        System.out.println("类加载");
    }
    public static void main(String[] args) {
        
        //静态代码块会优于方法执行
        System.out.println("方法执行");

        Chinese c = new Chinese("000000", "zhangsan");
        System.out.println(c.id);
        System.out.println(c.name);

        //调用静态变量和静态的时候要使用类调用
        System.out.println(Chinese.country);
        Chinese.speak();
    
        }
}
