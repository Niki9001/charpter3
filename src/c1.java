/**
 * 数组，是多个相同类型数据按一定顺序排列的集合，并使用一个名字命名，并通过变好的方式对这些数据进行统一管理
 *
 * 数组中的概念
 *  数组名（name）
 *  下标（index）
 *  元素
 *  数组的长度
 *
 * 数组的特点：
 *  数组中的元素在内存中是依次紧密排列的，有序的
 *  数组，属于引用数据类型的变量，数组的元素，既可以是基本数据类型，也可以是引用数据类型
 *  一旦初始化完成，长度就固定了，且长度不可更改
 *  数组必须是内存中的一整块空间
 *
 * 数组的分类
 *  按照元素的类型，基本数据类型元素数组，引用数据类型元素数组
 *  按照数组的维度来分类，一维数组，二维数组
 *
 * 一维数组的使用
 *  数组的声明和初始化
 *  调用数组的指定元素
 *  数组的属性：length，表示数组长度
 *  数组的遍历
 *  数组元素的默认初始化
 *      int: 0
 *      float: 0.0
 *      boolean: false
 *      char: 0
 *      引用数据类型 null (String)
 *  一维数组的内存解析
 *
 * */
public class c1 {
}


class OneDArray {
    public static void main(String[] args){
        //1. 数组的声明和初始化
        //TODO：静态初始化
        //声明
        double[] price;
        //初始化
        price = new double[]{20.32,43.32,43.22};
        //TODO：动态初始化
        //指定长度的声明和初始化
        String[] foods = new String[4];

        //2. 数组元素的调用
        //通过角标的方式
        System.out.println(price[0]);
        foods[0] = "sea food";
        foods[1] = "milk tea";

        //3. 数组的长度，用来描述数组容器中容量的大小
        //使用length表示
        System.out.println(foods.length);
        System.out.println(price.length);

        //4. 如何遍历数组
        for (int i = 0; i < 4; i++) {
            System.out.println(foods[i]);
        }

        //5. 默认初始化值
        double[] a = new double[6];
        System.out.println(a[1]);
        boolean[] b = new boolean[4];
        System.out.println(b[0]);
        char[] c = new char[4];
        System.out.println(c[1]);
    }
}
