public class InsertionSort {
    public static void insertionSort(int[] array) {
        int l=array.length;
        if(l<2)
            return;
        for(int i=1;i<l;i++){
            int temp=array[i];
            int j=0;
            for(j=i;j>0 && array[j-1] > temp;j--){
                array[j]=array[j-1];
            }
            array[j]=temp;
        }
    }
    public static void main(String[] args) {
        int[] array={6,2,7,3,1};
        insertionSort(array);
        for(int x : array){
            System.out.println(x);
        }
    }
}
