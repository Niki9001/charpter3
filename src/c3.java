/**
 * 二维数组
 *
 * 1. 对于二维数组的理解，可以看成一个一维数组array1又称为另外一个一维数组array2的元素二存在
 *      其实从数组底层的运行机制来看，没有多维数组
 *      数组的外层元素，数组的内层元素
 * 2. 二维数组默认值
 *  2.1 动态初始化1 int[][] arr3 = new String[3][4];
 *      外层元素：默认存储地址值
 *      内层元素：默认与一维数组元素的不同类型的默认值规定相同
 *          int: 0
 *          float: 0.0
 *          boolean: false
 *          char: 0
 *          引用数据类型 null (String)
 *  2.2 动态初始化2 int[][] arr = new int[3][]
 *      外层元素：默认存储null
 *      内层元素：不存在的，如果调用会报错（NullPointerExcept）
 *
 * */
public class c3 {
}

class TwoDArray{
    public static void main(String[] args) {
        //1. 数组声明与初始化
        //1d
        int[] arr1 = new int[]{1,2,3};
        //2d 静态初始化 静态，数组变量的赋值和数组元素的赋值同时进行
        int[][] arr2 = new int[][]{{1,2,3},{4,5},{6,7,8,9}};
        //2d 动态初始化 动态，数组变量的赋值和数组元素的赋值分开进行
        String[][] arr3 = new String[3][4];
        double[][] arr4 = new double[2][];

        //2. 调用数组的指定元素
        System.out.println(arr2[0][0]); //1
        System.out.println(arr2[2][0]); //7
        System.out.println(arr2[0]); //object
        //测试arr3
        arr3[0][0]="A";
        System.out.println(arr3[0][0]);
        //测试arr4
        arr4[0] = new double[4];
        arr4[0][0] =12;

        //3. 数组的长度
        System.out.println(arr2.length);

        //4. 数组的遍历
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                //TODO：如果想分行，用 print t和外层空行
                System.out.print(arr2[i][j]+"\t");
            }
            System.out.println(" ");
        }

    }
}