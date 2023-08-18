package ss14_thuattoansapxep.thuc_hanh;

public class BubbleSort {
    static int [] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
    public static void main(String[] args) {
        bubbleSort(list);
    }

    public static void bubbleSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            for (int j = 0; j < list.length-i; j++) {
                if (list[j]>list[j+1]){
                    int tempt = list[j];
                    list[j] = list[j+1];
                    list[j+1] = tempt;
                }
            }
        }
        for (int h = 0; h < list.length; h++) {
            System.out.print(list[h] + " ");

        }
    }
}
