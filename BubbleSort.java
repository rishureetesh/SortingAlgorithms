class BubbleSort{
    public static void bubbleSort(int[] array) {
        int l=array.length;
        for(int i=0;i<l;i++){
            boolean flag=false;
            for(int j=1;j<l;j++){
                if(array[j-1] > array[j]){
                    int temp=array[j-1];
                    array[j-1]=array[j];
                    array[j]=temp;
                    flag=true;
                }
            }
            if(flag==false){
                break; 
            }
        }
    }
    public static void main(String[] args) {
        int[] array={4,1,6,3,7,2};
        bubbleSort(array);
        for(int x:array){
            System.out.println(x);
        }
    }
}