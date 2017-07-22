package command;

/**
 * Created by GR on 2017/7/21.
 */
public class CommandTest {
    public static void main(String[] args) {
        ProcessArray processArray = new ProcessArray();
        int[] target = {5, 2, 8, 4};
        processArray.each(target, new Command() {
            @Override
            public void process(int[] target) {
                for (int temp : target) {
                    System.out.println("迭代输出：" + temp);
                }
            }
        });
    }
}
