public class TestAnimal {
    //用于测试类的继承性和方法覆盖
    /*
        类的继承（extends）：
            - 作用：1.代码复用 2.（重点）为类的多态性和方法覆盖打下基础
            - 语法格式：【修饰限定词】 class 【子类名】 extends 【父类名】{} 
            - 应用场景：当所有对象中具有继承关系时，功能近似，这时可以使用继承
            - 限制条件：在Java语言中，一个父类只能继承一个子类，但是可以间接继承多个子类。C++可以继承多个子类。
        方法覆盖（override）:
            - 使用条件：
                - 在类的继承中使用
                - 子类中的方法必须要和父类中的方法名称相同，返回值类型相同，参数相同
            - 应用场景：当子类从父类继承的方法不足以满足子类的业务需要时，可以重写方法
    */
    public static void main(String[] args) {
        
        Animal a = new Animal();
        a.move();

        Bird b = new Bird();
        b.move();

        Cat c = new Cat();
        c.move();

        Yingwu y = new Yingwu();
        y.move();

    }
    
}
