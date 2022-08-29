package easy;

import java.util.ArrayList;
import java.util.List;

public class _119 {
    public List<Integer> getRow(int rowIndex) {
//根据numRows创建数组长度
        List<List<Integer>> outList = new ArrayList<>();
        //x行的第i个元素是x-1行的第i个元素和i-1个元素之和
        //遍历外层list
        for (int one = 0; one < rowIndex+1; one++) {
            //遍历内层list
            List<Integer> innerList = new ArrayList<>();
            for (int two = 0; two <= one; two++) {
                if (two == 0||two==one){
                    innerList.add(1);
                }else {
                    List<Integer> list = outList.get(one-1);
                    innerList.add(list.get(two)+list.get(two-1));
                }
            }
            outList.add(innerList);

        }
        return outList.get(rowIndex);
    }
    public static void main(String[] args) {
        final _119 v = new _119();
        System.out.println(v.getRow(5));
    }
}
