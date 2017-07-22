package command;

/**
 * Created by GR on 2017/7/21.
 */
public class ProcessArray {
    public void each(int[] target, Command cmd) {
        cmd.process(target);
    }
}
