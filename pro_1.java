import javax.swing.text.html.HTMLDocument;
import java.util.*;

public class pro_1 {
    public static   void main(String[] args){
//         int[] a={1,2,5,3,4,5};
//         int[][] aa={
//                 {1,2,8,9},
//                 {2,3,9,12},
//                 {4,7,10,13},
//                 {6,8,11,15},
//         };
//           String ss="we are happy";
//           char[] cc=ss.toCharArray();
//           System.out.println(cc);
//           System.out.println(cc.length);
//           cc=th_space(cc);
//        System.out.println(cc);
//        System.out.println(double_in(aa,6,0,aa[0].length-1));
/*****************7重建二叉树*************************/
//        int[] a={1,2,4,7,3,5,6,8};
//        int[] b={4,7,2,1,5,3,8,6};
//        Tree tree=new Tree();
//        tree.root=cj_Tree(a,b);
//        System.out.println(tree.root);
//        tree.zx_print();
///*****************9两个栈实现队列*************************/
//            Queue_w queue_w=new Queue_w();
//            for(int i=0;i<5;i++) {
//                queue_w.appendTail(i);
//            }
//        for(int i=0;i<5;i++) {
//           System.out.println(queue_w.deleteHead());
//        }
/*****************9-1 两个队列实现栈***********************/
//         Stack_w stack_w=new Stack_w();
//         for(int i=0;i<5;i++)
//          stack_w.push(i);
//        System.out.println(stack_w.pop());
//gg
//        for(int i=0;i<5;i++)
//            stack_w.push(i);
//        for(int i=9;i>0;i--)
//            System.out.println(stack_w.pop());
/*****************9-1 两个队列实现栈complete***********************/
/*****************11 旋转数组的最小数字***********************/
////            int[] ss={3,4,5,1,2};
//            int[] ss={5,2};
//            System.out.println( xz_Sz.xz(ss,0,ss.length-1));

/*****************11 旋转数组的最小数字 complete***********************/
/*****************12 矩阵中的路径 回溯法***********************/
                char[][] ss={
                        {'a','b','t','g'},
                        {'c','f','c','s'},
                        {'j','d','e','h'},
                        {'f','c','d','h'}
                };

        System.out.println("ss.length"+ss.length+" "+ss[0].length);
                char[] s={'f'};
                System.out.println(Jzlj_Hs.jzlj_hs(ss,s));

/*****************12 矩阵中的路径 回溯法*complete**********************/





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
      /**************7:重建二叉树*****************/
     public static TreeNode cj_Tree(int[] qx,int[] zx){
         if(qx.length == 0 || zx.length == 0)
             return null;

         int gen=qx[0];
         TreeNode treeNode=new TreeNode(gen);
         for(int i=0;i<qx.length-1;i++)
         {
             qx[i]=qx[i+1];
         }
         int i=0;
         for(;i<zx.length;i++)
         {
             if(zx[i]==gen)
                 break;
         }
         int lengtha=0;
         if( i == 0)
         {
             lengtha=0;
         }else {
             lengtha=i;
         }
         System.out.println("i="+i);
         System.out.println("lengtha="+lengtha);
         System.out.println("zx.length="+zx.length);
         System.out.println(Arrays.toString(zx));
         int[] leftzx=new int[lengtha];
         for (int j = 0; j < i ; j++) {
             leftzx[j] = zx[j];
         }
         int lengthb=0;
         if(i == zx.length-1)
         {
             lengthb=0;
         }else {
             lengthb=zx.length-1-i;
         }
         System.out.println("i="+i);
         System.out.println("lengthb="+lengthb);
         System.out.println("zx.length="+zx.length);
         System.out.println(Arrays.toString(zx));

         int[] rightzx=new int[lengthb];
         for(int j=0;j < lengthb;j++)
         {
             rightzx[j]=zx[i+1+j];
         }
         treeNode.leftchild=cj_Tree(qx,leftzx);
         treeNode.rightchild=cj_Tree(qx,rightzx);
         return  treeNode;


     }
}
class  TreeNode{
       int  key;
       TreeNode leftchild;
       TreeNode rightchild;
       TreeNode(int key){
           this.key=key;
           leftchild=null;
           rightchild=null;
       }
       @Override
      public  String toString(){
           return  "key="+key;
       }
}
class Tree{
     TreeNode root;
     Tree(){
         root=null;
     }
     public  void  zx_print(){
          print(root);
     }
     public  void print(TreeNode node){
         if(node == null)
             return;
         print(node.leftchild);
          System.out.print(node);
          print(node.rightchild);
     }
}
/****************面试题9用两个栈实现队列*********************/
class Queue_w{
    private Stack<Integer> stack1=new Stack<>();
    private Stack<Integer> stack2=new Stack<>();
    public  void appendTail(int t){
         stack1.push(t);
    }
    public int  deleteHead() throws EmptyStackException {
        if (!stack2.isEmpty()) {
            return stack2.pop();
        } else  if(!stack1.isEmpty()){
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
            return stack2.pop();
        }else
            throw new EmptyStackException();
    }
}
/****************面试题9-1用两个队列实现栈*********************/
class Stack_w {
    private Queue<Integer> queue1 = new LinkedList<>();
    private Queue<Integer> queue2 = new LinkedList<>();

    public void push(int t) {
        if (queue1.isEmpty())
            queue2.add(t);
        else if (queue2.isEmpty())
            queue1.add(t);
    }

    public int pop() throws EmptyStackException {
        if (queue1.isEmpty() && queue2.isEmpty())
            throw new EmptyStackException();
        if (queue1.isEmpty()) {
            while (queue2.size() != 1)
                queue1.add(queue2.remove());
            return queue2.remove();
        }
        if (queue2.isEmpty()) {
            while (queue1.size() != 1)
                queue2.add(queue1.remove());
            return queue1.remove();
        }
        return  -1;
    }
}
/**************斐波那契数列*********************/
 class  fbnq{
       public  static  int fbnq_xh(int n){
             int[] resultn={0,1};
             if(n<2)
                 return resultn[n];
             int num1=0;
             int num2=1;
             int result=0;
             for(int i=2;i<=n;i++){
                 result=num1+num2;
                 num1=num2;
                 num2=result;
             }
             return  result;
       }
}

/**************11  旋转数组*********************/
class xz_Sz {
          public static  int   xz(int[] ss,int start,int end){
              if(start == end)
                   return  start;
              int min_index=-1;
              System.out.println("end="+end);
              if((end-start) == 1)
                  return  ss[start]<ss[end]?start:end;
              int fenge=(start+end)/2;
              if(ss[fenge] >= ss[start] && ss[fenge]<=ss[end])
                  return  start;
              else if(ss[fenge] >= ss[start])
                  min_index=xz(ss,fenge,end);
              else if(ss[fenge] <= ss[end])
                  min_index=xz(ss,start,fenge);
              return  ss[min_index];
          }
}
/**************12  矩阵中的路径 回溯法*********************/
class Jzlj_Hs{
      private static int index_s;
      Jzlj_Hs(){
          index_s=0;
      }
   public  static  boolean   jzlj_hs(char[][] ss,char[] s){
            int row=0;
            int col=0;
            boolean[][] jz_b=new boolean[ss.length][ss[0].length];
            for(int i=0;i < jz_b.length;i++)
            {
                for(int j=0;j< jz_b[0].length;j++)
                {
                    jz_b[i][j]=false;
                }
            }
            for(;row < ss.length;row++)
            {
                for(col=0;col < ss[0].length;col++)
                {
                    if (hasPath(ss,s,row,col,jz_b) ==  true) {
                        System.out.println("row="+row+" col="+col+" index_s="+index_s);
                        return true;
                    }
                }
            }
            return  false;
   }
   public static boolean  hasPath(char[][] ss,char[] s,int row,int col,boolean[][] jz_b){
                System.out.println("in hasPath() row="+row+" col="+col+" index_s="+index_s);
              //  System.out.println("ss[row][col]="+ss[row][col]);
              // System.out.println("jz-b[row][col]"+jz_b[row][col]);
    //   System.out.println("s[index_s]"+s[index_s]);
      // System.out.println(row >=0 && row <ss.length && col>=0 && col<ss[0].length );
               if( index_s >= s.length)
                   return  true;
               if( row >=0 && row <ss.length && col>=0 && col<ss[0].length && ss[row][col] == s[index_s] && jz_b[row][col] == false){
                   jz_b[row][col]=true;
                   index_s++;
                   System.out.println("hasPath  ss[row][col]== s[index_s]"+"row="+row+" col="+col+" index_s="+index_s);
                   boolean has_p=hasPath(ss,s,row+1,col,jz_b) ||
                             hasPath(ss,s,row-1,col,jz_b) ||
                             hasPath(ss,s,row,col+1,jz_b) ||
                             hasPath(ss,s,row,col-1,jz_b);

                   if(has_p == false){
                       jz_b[row][col]=false;
                       index_s--;
                       System.out.println("after husu  hasPath  ss[row][col]== s[index_s]"+"row="+row+" col="+col+" index_s="+index_s);
                       return  false;
                   }
                   return  true;
               }
               return  false;
   }



}

