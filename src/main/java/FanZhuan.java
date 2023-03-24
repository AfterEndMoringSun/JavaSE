public class FanZhuan {
    public static void main(String[] args) {
        int arr[] = {11,22,33,44,55,66};
        int temp = 0;
        int len = arr.length;//计算数组的长度
        for (int i = 0;i<len/2;i++){
            temp = arr[len-1-i];//保存
            arr[i] = temp;
        }
        System.out.println("-------翻转数组--------");
        for (int i = 0; i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
    }
}
