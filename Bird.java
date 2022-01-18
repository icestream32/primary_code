public class Bird extends Animal{
    //子类飞禽类
    //显然子类的飞禽类的移动描述继承父类，但不符合子类的需求，因此需要重写
    public void move() {

        // super.move();//super可以直接调用父类的实例方法
        System.out.println("鸟儿在飞翔！");
        
    }
    
}
