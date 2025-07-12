public class Span{
    public static int findSpan(int a[]){
        int min = a[0]; 
        int max = a[0];

        for(int i=0;i<a.length;i++){
            if(a[i] > max)
                max = a[i];
            if(a[i] < min)
                min = a[i];
        } 
        return max - min;
    }
    public static void main(String args[]){
        int a[] = {11,45,9,7,4,99,11,88};
        System.out.println(findSpan(a));
    }
}