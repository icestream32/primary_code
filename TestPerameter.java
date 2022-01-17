public class TestPerameter {
    /* 
        用于测试当方法传递参数为某一个对象的地址时
        与普通变量传递字面值的区别
        结论：Java语言中，有且仅有传值调用，不过有时会传递字面值，有时会传递一个类的地址
    */
    public static void main(String args[]){
        //字面值的传递
        int i = 20;
        add_zimian(i);
        System.out.println("main方法中字面值传递值 -->" + i);

        //指向对象的地址传递
        Peramaeter a = new Peramaeter(20);
        add_lei(a);
        System.out.println("add_lei方法中对象传递值 -->" + a.getAge());
    }

    public static void add_zimian(int i){
        i++;
        System.out.println("add_zimian方法中字面值传递值 -->" + i);
    }
    
    public static void add_lei(Peramaeter a){
        a.setAge(21);
        System.out.println("add_lei方法中对象地址传递值 -->" + a.getAge());
    }
    /*
        可以看到字面值传递时，输出值分别是20，21；
        而对象地址传递时，输出值却是21，21；
        用c语言的话来说，就是传址调用，所有方法中的参数都是实参（本人深受c毒害只能这样理解了...） 
    */
}
