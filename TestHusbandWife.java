public class TestHusbandWife {
    //用来测试类的关联性
    public static void main(String args[]){

        //调用Wife和Husband的内存
        Husband h = new Husband();
        Wife w = new Wife();

        //结婚证明
        h.wife = w;
        w.husband = h;

        //只要知道其中一个人就知道这个人的妻子（丈夫）是谁
        System.out.println("黄晓明的妻子是 " + h.wife.name);
        
    }
}
