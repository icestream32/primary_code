public class TestProduct {
    //用于测试类的封装性
    public static void main(String args[]){

        Product iphoneX = new Product();

        //不能直接设置价格，不然会报错
        //iphoneX.price = 10000;
        //错误码：The field Product.price is not visible

        //需要通过接口间接设置价格
        iphoneX.setPrice(-100);//错误价格会提示价格错误
        
        iphoneX.setPrice(10000);
        //获得当前产品价格
        System.out.println(iphoneX.getPrice());
        
    }

}
