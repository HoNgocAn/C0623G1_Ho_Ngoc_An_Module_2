package ss14_thuattoansapxep.thuc_hanh;

public class SelectionSort {
    static double [] list = {1,9,4.5,6.6,5.7,-4.5};
    public static void selectionSort(double[]list){
        for (int i = 0; i < list.length-1; i++) {
            double min = list[i];
            int minIndex = i;
            for (int j = i+1 ; j < list.length; j++) {
                if (list[j] < min) {
                    min = list[j];
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                double tempt = list[i];
                list[i] = list[minIndex];
                list[minIndex] = tempt;
            }
        }
        for (int h = 0; h < list.length; h++) {
            System.out.print(list[h] + " ");
        }
    }
    public static void main(String[] args) {
        selectionSort(list);
    }
}
