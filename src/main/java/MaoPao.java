public class MaoPao {
    public static void main(String[] args) {
        int arr[] = {24,12,23,54,13,99};
        System.out.println("排序前的数组为");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("\t"+arr[i]);
        }
        System.out.println("排序后的数组为");
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j <arr.length-1; j++) {
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("排序后的数组为");
        for (int i = 0; i <arr.length ; i++) {
            System.out.println("\t"+arr[i]);
        }
    }
}
