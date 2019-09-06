public class pro_1 {
    public static   void main(String[] args){
         int[] a={1,2,5,3,4,5};
         int[][] aa={
                 {1,2,8,9},
                 {2,3,9,12},
                 {4,7,10,13},
                 {6,8,11,15},
         };
           String ss="we are happy";
           char[] cc=ss.toCharArray();
           System.out.println(cc);
           System.out.println(cc.length);
           cc=th_space(cc);
        System.out.println(cc);
//        System.out.println(double_in(aa,6,0,aa[0].length-1));
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
    /********面试题4 二维数组查找*****************/
    public  static  boolean double_in(int[][] a,int findi,int hang,int lie){
        System.out.println("hang="+hang);
        System.out.println("lie="+lie);
        boolean result=false;
        if( hang >=  a.length || lie <0)
            return  false;
        if( findi == a[hang][lie])
            return  true;
        else  if( findi < a[hang][lie])
            result=double_in(a,findi,hang,lie-1);
        else
            result=double_in(a,findi,hang+1,lie);
        return result;
    }
    /*********** 面试题5 替换空格***************/
    public  static  char[] th_space(char[] ss){
            int length=ss.length;
            char[] xin=new char[4*length];
            for(int i=0;i<ss.length;i++)
            {
                xin[i]=ss[i];
            }
            int count=0;
            for(char s:xin) {
                if(s == ' ')
                    count++;
            }
            System.out.println(count);
            for(int i=length-1;i >=0;i--)
            {
                if(xin[i] != ' ') {
                    xin[i + count * 2] = xin[i];
                }else {
                    count--;
                    xin[i+count*2]='%';
                    xin[i+count*2+1]='2';
                    xin[i+count*2+2]='0';
                }
            }
            return xin;
    }
}
