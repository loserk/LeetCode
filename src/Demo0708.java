import java.util.*;

public class Demo0708 {
    public static void main(String[] args) {
        String[] ss = {"eat", "tea", "tan", "ate", "nat", "bat"};
        Soule s1 = new Soule();
        System.out.println(s1.groupAnagrams(ss));
    }
}
class Soule{//异位字符串
    public List<List<String>> groupAnagrams(String[] strs) {
        //返回值是List List里面是List 装的String  定义一个HashMap 值为List
        Map<String, List> map = new HashMap<String, List>();
        for (String i : strs) {
            char[] arr = i.toCharArray();
            Arrays.sort(arr);
            String str = String.valueOf(arr);

            if (!map.containsKey(str)) {
                //若不存在建立映射关系 排序后的字符串—>新的List集合（装未排序的异位词）
                map.put(str, new ArrayList());
            }
            //建立映射关系户后添加 以及存在映射关系后添加单词
            map.get(str).add(i);
        }
        //返回值是List集合 通过构造器 构造一个包含指定 collection 的元素的列表
        return new ArrayList(map.values());
    }
}
