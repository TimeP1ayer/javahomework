import java.util.*;

public class Main {
        public static void main(String[] args) {
            Random random = new Random();

            //生成随机数存入set保证不重复
            int n = 0;
            //哈希集合保证不出现重复数字
            Set hashset = new HashSet();
            for(int i = 0; hashset.size() < 20; i++) {
                n = 10 + random.nextInt(81);
                hashset.add(n);
            }

            //hashset转为list
            String strs = "";
            List list = new ArrayList(hashset);

            for(int i = 0; i < list.size(); i++) {
                //list的元素拼接到字符串
                if (i != list.size() - 1) {
                    strs += (list.get(i) + ",");
                } else {
                    strs += (list.get(i));
                }
            }

            //输出字符串
            System.out.println("字符串形式为："+strs);

            //将字符串中的数字存入数组
            //分割符
            String [] num_split = strs.split(",");

            int [] arr = new int[num_split.length];
            for(int i = 0; i < num_split.length; i ++) {
                arr[i] = Integer.parseInt(num_split[i]);
            }

            //排序
            Arrays.sort(arr);
            //遍历数组
            System.out.println("字符串的数字个数为：" + arr.length);
            System.out.print("分离排序后为：");
            for(int i = 0; i < arr.length; i ++) {
                System.out.print(arr[i] + " ");
            }
        }
}
