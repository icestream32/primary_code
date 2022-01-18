package Pet;
//继承抽象类，由抽象宠物到具体的猫
public class Cat extends Pet {
    public void eat(){
        //方法覆盖
        System.out.println("猫在吃鱼！");
    }
}
