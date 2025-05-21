public class Swappingstring {
    public static void main(String[] args) {
        String str="Hello";
        String str1="World";
        String temp=str;
        str=str1;
        str1=temp;
        System.out.println("String A:"+str);
        System.out.println("String B:"+str1);
    }
    
}
