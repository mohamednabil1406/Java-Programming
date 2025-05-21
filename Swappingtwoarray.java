public class Swappingtwoarray {
    public static void main(String[] args) {
        int a[]={1,2,3};
        int b[]={4,5,6};
        for(int i=0;i<a.length;i++){
             int temp=a[i];
             a[i]=b[i];
             b[i]=temp;

    }
    System.out.println("Array A:");
    for(int i:a)System.out.println(i+"");
    System.out.println("Array B:");
    for(int i:b)System.out.println(i+"");
   }

    
}

