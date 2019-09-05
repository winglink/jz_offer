public class pro_1 {
    public static   void main(String[] args){
        /******** 题3 数组中的重复数字********/
       // int[] a={1,2,3,4,5,6,2};
      //  int[] a={0,1,2,3,4};
        int[] a={3,3,3,3,3};
        int result=-1;
        for(int i=0; i < a.length;){
            System.out.println(a[i]);
            if(a[i] == i) {
                i++;
                continue;
            }
            else {
                if(a[i] == a[a[i]]){
                   result=a[i];
                   System.out.println("result="+result);
                   return;
                }
                //swap
               int temp=a[a[i]];
                a[a[i]]=a[i];
                a[i]=temp;
            }
        }
    }
}
