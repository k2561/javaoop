package chop4.qiye.impl;

import chop4.qiye.ICode;
import chop4.qiye.ITalk;

/**
 * 公司职员
 */
public class People implements ICode, ITalk {

    @Override
    public void writeCode() {
        System.out.println("我会写代码");
    }

    @Override
    public void takeyeWu() {
        System.out.println("我会讲业务");
    }
}
