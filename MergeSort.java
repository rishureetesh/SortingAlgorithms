public class MergeSort {
    public static void mergeSort(int[] array) {
        int l=array.length;
        if(l<2)
            return;
        int mid=l/2;
        int[] arrayOne=new int[mid];
        int[] arrayTwo=new int[l-mid];
        int i=0;
        for(i=0;i<mid;i++){
            arrayOne[i]=array[i];
        }
        for(i=mid;i<l;i++){
            arrayTwo[i-mid]=array[i];
        }
        mergeSort(arrayOne);
        mergeSort(arrayTwo);
        merge(arrayOne, arrayTwo, array);
    }
    public static void merge(int[] arrayOne, int[] arrayTwo, int[] array) {
        int i=0,j=0,k=0;
        int l=arrayOne.length,m=arrayTwo.length;
        while(i < l && j < m ){
            if(arrayOne[i] < arrayTwo[j]){
                array[k++]=arrayOne[i++];
            }else{
                array[k++]=arrayTwo[j++];
            }
        }
        while(i < l){
            array[k++]=arrayOne[i++];
        }
        while(j < m){
            array[k++]=arrayTwo[j++];
        }
    }
    public static void main(String[] args) {
        int[] array={6,1,4,2,9,7};
        mergeSort(array);
        for(int x :array){
            System.out.println(x);
        }
    }
}
