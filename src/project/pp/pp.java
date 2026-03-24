package project.pp;

public class pp {
    public static void main(String[] args) {
        int[] index = {1, 2, 3, 4, 5};
            int task;
            task = index[0];
            for (int i = 0; i < index.length - 1; i++) {
                index[i] = index[i + 1];

            }
        index[index.length - 1] = task;
        for (int i = 0; i < index.length; i++) {
            System.out.print(index[i] + " ");
        }
    }
}
