public class pro_1 {
    public static   void main(String[] args){
         int[] a={1,2,5,3,4,5};
         find_d(a,0,a.length-1);
    }
    /**********题目3 数组中的重复数字 *****************/
    public void find_c(int[] a ) {
        for (int i = 0; i < a.length; ) {
            System.out.println(a[i]);
            if (a[i] == i) {
                i++;
                continue;
            } else {
                if (a[i] == a[a[i]]) {
                    System.out.println("result=" + a[i]);
                    return;
                }
                //swap
                int temp = a[a[i]];
                a[a[i]] = a[i];
                a[i] = temp;
            }
        }
    }

    /******* 题目2 不修改数组找出重复的数字**********/
    public static void find_d(int[] a,int start,int end){
        if(start == end) {
            System.out.println("result="+start);
            return;
        }
        int fenge=(start+end)/2;
        System.out.println("fenge="+fenge);
         if(count_d(a,start,fenge) > (fenge-start+1))
              find_d(a,start,fenge);
         else
             find_d(a,fenge+1,end);
    }
    public  static  int count_d(int[] a,int left,int right){
           int count=0;
           for(int i=0; i < a.length;i++){
               if( a[i] >= left && a[i] <= right)
                    count++;
           }
           return count;
    }
}
