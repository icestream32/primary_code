public class TestUser {
    //用于测试嵌套类的运用
    public static void main(String args[]){
       
        //先调用用户类
        User u = new User();
        /*
       第一种方法 
        //调用住址类
        u.addr = new Address();
        */

        //第二种方法，直接复合式调用
        Address a = new Address();
        u.addr = a;
        //本质上属于指针地址的赋值，但是Java不给这样说
        //Sorry啊，学过c就是可以为所欲为~
        
    }
}
