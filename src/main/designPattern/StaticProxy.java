/**
 * Created with IntelliJ IDEA.
 * 静态工厂
 * 代理类和被代理类在编译期间就确定了
 *
 * @author RainZero
 * @date 2021/6/12
 */

interface ClothFactory {
    /**
     * create by: RainZero
     * description:
     * * @Param: null
     *
     * @return
     */
    void productCloth();
}
//被代理类

class AdiClothFactory implements ClothFactory {

    @Override
    public void productCloth() {
        System.out.println("adi工厂正在生产");
    }
}

//代理类

class ProxyCloth implements ClothFactory {
    //    用被代理类的对象进行实例化

    private ClothFactory clothFactory;

    ProxyCloth(ClothFactory clothFactory) {
        this.clothFactory = clothFactory;
    }

    @Override
    public void productCloth() {
        System.out.println("代理工厂准备工作");
        clothFactory.productCloth();
        System.out.println("代理工厂完成工作");

    }
}


public class StaticProxy {
    public static void main(String[] args) {
        ClothFactory adiClothFactory = new AdiClothFactory();
        ClothFactory proxyCloth = new ProxyCloth(adiClothFactory);
        proxyCloth.productCloth();
    }
}
