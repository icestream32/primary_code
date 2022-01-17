public class TestThis {
    //用于测试this关键字的用法和作用场景
    /*
        总结：
        this的应用场景有两个：
            - 当自定义构造函数的形参变量和类的实例变量名称一致时，利用this.(实例变量)来区别形参和实例变量
            - 当构造函数中需要调用其他构造函数时，利用this(实参)调用
                注意：this()必须要放在第一行 
    */
    public static void main(String args[]){
        This a = new This();
        System.out.println(a.getYear() + "年" + a.getMonth() + "月" + a.getDate() + "日");

        This b = new This(2021, 1, 17);
        System.out.println(b.getYear() + "年" + b.getMonth() + "月" + b.getDate() + "日");
    }
}
