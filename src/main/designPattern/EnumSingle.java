/**
 * Created with IntelliJ IDEA.
 * 枚举实现单例
 *
 * @author RainZero
 * @date 2021/4/13
 */
public enum EnumSingle {
    INSTANCE;

    public EnumSingle getInstance() {
        return INSTANCE;
    }
}
