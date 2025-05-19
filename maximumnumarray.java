public class maximumnumarray {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5, 6,7};
        int max = arr[0];
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max | arr[i]<min){
                max=arr[i];
            }
        }
        System.out.println("maximum number of array:"+max);
                System.out.println("minimum number of array:"+min);
        
    }
    
}
