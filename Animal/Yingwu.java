package Animal;
//package包，方便不同包之间的代码管理和保存
import Pet.Bird;
//import引入，方便使用不同包之间的.java文件

/*
    访问控制权限修饰符：
        1.访问控制权限修饰符来控制元素的访问范围
        2.访问控制权限修饰符包括：
            public          表示公开的，在任何位置都可以访问
            protected       同包，子类可以访问
            缺省（default）  同包可以访问
            private         表示私有的，只能在本类访问
        3.访问控制权限修饰符可以修饰类、变量、方法...
            注：每一个.java文件的第一个类只能用public和缺省修饰
        4. 当某个数据只希望子类使用，使用protected进行修饰  
            
*/          
public class Yingwu extends Bird {
    //这里不做方法覆盖，用于验证继承的就近原则
}
