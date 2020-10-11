public class QuickSort {
    public static int quickSort(int[] array, int start, int end) {
        int pivot=array[end];
        int PI=start;
        for(int i=start;i<end;i++){
            if(array[i] <= pivot){
                int temp=array[i];
                array[i]=array[PI];
                array[PI]=temp;
                PI++;
            }
        }
        int temp=array[end];
        array[end]=array[PI];
        array[PI]=temp;
        return PI;
    }
    public static void partition(int[] array, int start, int end){
        if(start < end){
            int pivot=quickSort(array,start,end);
            partition(array, start, pivot-1);
            partition(array, pivot+1, end);
        }
    }
    public static void main(String[] args) {
        int[] array={4,2,6,3,1,9,5};
        int l=array.length;
        partition(array, 0, l-1);
        for(int x : array){
            System.out.println(x);
        }
    }
}
