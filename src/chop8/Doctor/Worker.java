package chop8.Doctor;

/**
 *上班族类
 */

import java.util.*;

public class Worker {
    private boolean alive = true; // 状态，true表示活着，false表示死亡

    /**
     * @return alive
     */
    public boolean getAlive() {
        return alive;
    }

    /**
     * @param alive 要设置的 alive
     */
    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    /**
     * 工作
     * @throws Exception
     */
    public void work() throws Exception {
        int t = (int)( new Date().getTime() % 3 );  // 产生一个随机数
        System.out.println("我在工作...");
        if(t == 1) {  // 当随机数等于1时，上班族生病
            throw new Exception("我生病了！！");
        }
    }

    /**
     * 休息
     * @throws Exception
     */
    public void rest() throws Exception {
        int t = (int)( new Date().getTime() % 7 );  // 产生一个随机数
        System.out.println("我在休息...");
        if(t == 1) {  // 当随机数等于1时，上班族生病
            throw new Exception("我生病了！！");
        }
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        Worker worker = new Worker();  //一个可怜的上班族
        try {
            worker.work();    // 上班族工作
            worker.rest();    // 上班族休息
        } catch (Exception e) {  //工作或休息时生病
            System.out.println(e.getMessage());
            new Doctor().cure(worker); // 医生给上班族看病
            System.out.println("医生在给我治治疗...");
            if( worker.getAlive() ) { // 治好了
                System.out.println("医生给我治好了^^");
            } else {  // 没治好
                System.out.println("没治好，我牺牲了！！");
            }
        }
    }
}
