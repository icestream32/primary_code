package Pet;

public class TestMaster {
    //用于测试类的多态性
    /*
        多态性：
            - 基础语法（以父类Animal和子类Cat为例）：
                - 多态性中有两种形式：
                    - 向上转型（upcasting） 子类变成父类 
                        Animal a = new Cat();
                    - 向下转型（downcasting） 父类变成子类 （需要添加强制转换符）
                        if(a instanceof Cat){
                            Cat c = (Cat)a;
                        }
                - 在向下强制转换的时候，建议添加instanceof运算符来判断当前用例指向谁
                  以避免出现java.lang.ClassCastException的错误
                - 向下转型中，只有父类访问子类当中特有的方法时，我们才使用向下转型
            - 作用：多态性可以降低程序的耦合度，提高程序的拓展力；
                    多态性可以使得程序面向抽象的编程，而不是面向具体的编程
        案例：主人养宠物
            - 对象：
                主人、宠物
            - 行为：主人喂宠物，宠物吃东西
    */
    public static void main(String[] args) {
        
        //实例化Master对象，张三
        Master zhangsan = new Master();
        //实例化Cat对象，tom
        Cat tom = new Cat();
        //实例化Bird对象，yingwu
        Bird yingwu = new Bird();

        //主人喂宠物
        //类的多态性——向上转型
        zhangsan.feed(tom);
        zhangsan.feed(yingwu);
        /*
            因为Cat和Bird继承的都是宠物抽象类，
            因此主人和具体宠物的耦合度降低了，
            程序的扩展力大大加强。
            今后如果主人要养更多的宠物，那么直接添加新的宠物类就可以了。
        */

    }
}
