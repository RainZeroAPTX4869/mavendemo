import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created with IntelliJ IDEA.
 * 动态代理
 *
 * @author RainZero
 * @date 2021/6/12
 */
interface Human {
    String getBelif();

    void eat(String food);
}

//被代理类
class SuperMan implements Human {
    @Override
    public String getBelif() {
        return "老子天下第一";
    }

    @Override
    public void eat(String food) {
        System.out.println("要吃" + food);
    }
}


class ProxyFactory {
    /*private Object obj;

    public ProxyFactory(Object obj) {
        this.obj = obj;
    }

    //将被代理类要执行的方法写在invoke中,通过反射自动执行
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        return method.invoke(obj, args);
    }
    public static Object getInstance(Object obj) { //obj被代理类的对象
        ProxyFactory handler = new ProxyFactory(obj);
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), handler);
    }

    */
    //通过加载到内存的被代理类，动态地创建代理类对象

    public static Object getInstance(Object obj) { //obj被代理类的对象
        //使用lambda简化代码
        //形参不加类型，因为可以类型推断
        InvocationHandler handler1 = (proxy, method, args) -> method.invoke(obj, args);
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), handler1);
    }
}


public class DynamicProxy {
    public static void main(String[] args) {
        Human instance = (Human) ProxyFactory.getInstance(new SuperMan());
        instance.eat("铀235");
        System.out.println(instance.getBelif());
    }
}
