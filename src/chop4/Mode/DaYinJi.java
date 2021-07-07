package chop4.Mode;

/**
 *  打印
 */
public class DaYinJi {
    public void print(Mohe mohe,Zhizhang zhizhang){
        System.out.print("使用"+mohe.getColor()+"的墨盒");
        System.out.print("在"+zhizhang.getSize()+"的纸张上打印");
        System.out.println();
    }
}
