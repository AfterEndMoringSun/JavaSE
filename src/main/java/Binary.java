public class Binary {
    public static void main(String[] args) {
        int[] arr={1,5,9,10,56,65,78,85,99};
        int post = binarySearch(arr,0, arr.length-1,56 );
        if (post != -1) {
            System.out.println("输出的位置为"+post);
        }else
            System.out.println("找不到该数字");
    }
//    二分查找算法
    public static int binarySearch(int[] arr,int low,int high,int key){
//        低位小于等于高位
        while (low<=high){
//            求出中间位
          int mid = (low+high)/2;

          if(arr[mid] == key){//看看是不是自己要找的数据
              return mid; //是的话返回mid下标
          }
          else if(key <arr[mid]){//如果小于中位，那高位-1
              high = mid -1;
          }else {
              low = mid+1; //如果大于中位，那低位为中位+1
          }
        }
        return -1;
    }
}
