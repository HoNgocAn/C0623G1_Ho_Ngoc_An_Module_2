package ss2_loop.thuc_hanh;

public class TimGiatTriNhoNhatTrongMang {

    public static void main(String[] args) {
        int[] arr = {4, 12, 7, 8, 1, 6, 9};
        int index = minValue(arr);
        System.out.println("Phân từ nhỏ nhất trong mảng là: " + arr[index]);
    }
    public static int minValue(int[] array){
        int index = 0;
        for (int i = 1; i < array.length;i++){
            if (array[i]<array[index]){
                index = i;
            }
        }
        return index;
    }
}
