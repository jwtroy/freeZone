package dataStructure;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @Auther: jiwang
 * @Date: 2018/9/22 17:02
 * @Description:
 */
public class Test1_1_1 {
    public static void main(String[] args){
        Test1_1_1 test = new Test1_1_1();
        ArrayList list = new ArrayList();
        list.add(2);
        list.add(3);
        list.add(7);
        list.add(20);
        list.add(22);
       System.out.println(test.returnIndex(list,22));
    }

    private int returnIndex(ArrayList<Integer> list,Integer temp){
        int low = 0;
        int high = list.size()-1;
        Integer guess = null;
        while (low<=high){
            int mid =(low+ high)/2;
            guess = list.get(mid);
            if (guess == temp){
                return mid;
            }
            if (guess>temp){
                high = mid-1;
            }else {
                low = mid+1;
            }
        }
        return -1;
    }


    private int getMax(int len,int k){
        ArrayList arr = createRandomArray(len);
        for (int i=0; i<arr.size(); i++){
        }
return 0;
    }
    private ArrayList createRandomArray(int len){
        ArrayList arr = new ArrayList(len);
        for (int i=0; i<len; i++)
        {
            Random random = new Random();
            int tmp = random.nextInt(len);
            arr.add(tmp);
        }
        return arr;
    }
}
