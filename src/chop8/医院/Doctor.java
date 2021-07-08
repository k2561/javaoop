package chop8.医院;

/**
 *医生类
 */
import java.util.Date;

public class Doctor {
    public void cure(Worker worker) {
        int t = (int)(new Date().getTime() * 123 % 5);  // 产生一个随机数
        if( t == 1 ) { // 当随机数等于1时，上班族死亡
            worker.setAlive(false);
        } else {  // 当随机数不等于1时，上班族康复
            worker.setAlive(true);
        }
    }
}

