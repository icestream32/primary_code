public class Product {
    //类的封装

    //产品的价格是一个私有实例变量，不能直接访问
    private int price;
    
    //通过构造get和set来间接访问price变量
    public int getPrice(){
        return price;
    }
    public void setPrice(int price_duixiang){
        //设置入口限制条件
        if(price_duixiang < 0){
            System.out.println("对不起，您设置的产品价格不合法");
            return;
        }
        
        price = price_duixiang;
    }
    
}
