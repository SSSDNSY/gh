package lang.cjuc.concurrent2;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * @author ：pengzh
 * @date ：Created in 2020/1/31 11:08
 * @description：阻塞队列
 * @modified By：
 */
public class A35BlockingQueue {
    public static void main(String[] args) {
        BlockingQueue bq = new ArrayBlockingQueue(3);
      bq.add(1);
      bq.add(1);
        System.out.println(bq.add(1));;
        bq.add(1);
    }
}
