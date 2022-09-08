package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class _118 {
    /**
     * @Author yoto
     * @Description 给定一个非负整数 numRows，生成「杨辉三角」的前 numRows 行。
     * 在「杨辉三角」中，每个数是它左上方和右上方的数的和。
     * @Date 2022/8/29 9:45
     **/
    public List<List<Integer>> generate(int numRows) {
        //根据numRows创建数组长度
        List<List<Integer>> outList = new ArrayList<>();
        //x行的第i个元素是x-1行的第i个元素和i-1个元素之和
        //遍历外层list
        for (int one = 0; one < numRows; one++) {
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
        return outList;
    }

    public static void main(String[] args) {
        final _118 v = new _118();
        System.out.println(v.generate(5));
    }
}
