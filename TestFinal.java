public class TestFinal {
    //用来测试final关键字
    //final译为不可修改的，一般 与static关键字搭配使用,此时被译为常量，类似于c语言中的宏定义
    /* 
        final：
            - final修饰的实例变量一经赋值不可修改
            - final修饰的实例变量和实例方法不可被继承
            - 使用final修饰的实例变量时必须给实例变量赋值 
    */
    public static void main(String[] args) {
        
        Final f = new Final();
        System.out.println(Final.COUNTRY);
        //f.shenfen = "人民";不可再修改，会报错The final field Final.shenfen cannot be assigned
        System.out.println(f.shenfen);
        
    }
}
