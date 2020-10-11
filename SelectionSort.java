public class SelectionSort {
    public static void selectionSort(int[] array) {
        int l=array.length;
        for(int i=0;i<l;i++){
            int min=i;
            for(int j=i+1;j<l;j++){
                if(array[j] < array[min]){
                    min=j;
                }
            }
            if(min!=i){
                int temp=array[min];
                array[min]=array[i];
                array[i]=temp;
            }
        }
    }
    public static void main(String[] args) {
        int[] array={4,2,7,3,1};
        selectionSort(array);
        for(int x: array){
            System.out.println(x);
        }
    }
}
