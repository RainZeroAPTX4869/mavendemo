/**
 * Created with IntelliJ IDEA.
 * 静态内部类实现单例
 *
 * @author RainZero
 * @date 2021/4/13
 */
public class HolderSingle {
    private HolderSingle() {
    }

    private static class Holer {
        private static final HolderSingle HOLDER_SINGLE = new HolderSingle();
    }

    private HolderSingle getInstance() {
        return Holer.HOLDER_SINGLE;
    }
}
