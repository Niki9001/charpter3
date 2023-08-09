import java.util.Scanner;

public class c5 {
}
//TODO: 第一类，数值型数组特征值统计
//定义一个int类型的一维数组，包含10个元素，分别赋值一些随机整数，然后求出所有元素的最大值、最小值、总和、平均值，并输出
//要求：所有随机数都是两位数

class RandomNum{
    public static void main(String[] args) {
        int[] arr1 = new int[10];
        int sum = 0;
        int min = 1000;
        int max = 0;
        for (int i = 0; i < arr1.length; i++) {
            arr1[i]=(int) (Math.random()*100);
            sum = sum + arr1[i];
            if (arr1[i]>max){
                max=arr1[i];
            }
            if (arr1[i]<min){
                min=arr1[i];
            }
            System.out.print(arr1[i]+"\t");
        }
        System.out.println(" ");
        System.out.println("max is "+max);
        System.out.println("min is "+min);
        System.out.println("sum is "+sum);
        System.out.println("avg is "+(sum/10));
    }
}

//在编程竞赛中，有10位评委要为参赛选手打分，分数分别是5,4,6,8,9,0,1,2,7,3
//求选手最后得分，去掉一个最高分，去掉一个最低分，然后平均值
class Score{
    public static void main(String[] args) {
        int[] score = new int[] {5,4,6,8,9,0,1,2,7,3};
        int max = 0;
        int min = 10;
        double sum = 0;
        for (int i = 0; i < score.length; i++) {
            if (score[i]>max){
                max = score[i];
            }
            if (score[i]<min){
                min = score[i];
            }
            sum = sum + score[i];
        }
        sum = sum - max - min;
        System.out.println("sum is "+sum);
        System.out.println("max is "+max);
        System.out.println("min is "+min);
        System.out.println("avg is "+(sum/8));
    }
}

//TODO：第二类，数组元素的赋值 （实际开发中遇到的场景比较多）
//使用二维数组打印一个10行的杨辉三角
class Triangle {
    public static void main(String[] args) {

        int[][] arr = new int[10][];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new int[i+1];

            arr[i][0]=1;
            System.out.print(arr[i][0] + "\t");
            arr[i][i]=1;

            for (int j = 1; j < i; j++) {

                arr[i][j]=arr[i-1][j-1] + arr[i-1][j];

                System.out.print(arr[i][j]+"\t");
            }

            if (i != 0) {  // 除了第一行，其他每一行的最后一个值是1
                arr[i][i] = 1;
                System.out.print(arr[i][i] + "\t");
            }
            System.out.println(" ");
        }
    }
}

class Triangle2 {
    public static void main(String[] args) {

        int[][] arr = new int[10][];

        for (int i = 0; i < arr.length; i++) {

            arr[i] = new int[i + 1];  // 分配空间

            arr[i][0] = 1;  // 左边界的值
            System.out.print(arr[i][0] + "\t");  // 打印左边界的值

            for (int j = 1; j < i; j++) {  // 注意：这里我们修改了循环条件为 j < i，这是因为我们只处理到倒数第二个元素。

                arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
                System.out.print(arr[i][j] + "\t");
            }

            if (i != 0) {  // 除了第一行，其他每一行的最后一个值是1
                arr[i][i] = 1;
                System.out.print(arr[i][i] + "\t");
            }

            System.out.println();  // 开始新的一行
        }
    }
}

//等回数
//从键盘输入一个整数(1-20),以该数字为矩阵的大小，把1,2,3....n的数字按照顺时针螺旋型式填入其中


class NumRot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a number between 1-20: ");
        int n = sc.nextInt();

        if (n < 1 || n > 20) {
            System.out.println("Invalid input! Please input a number between 1-20.");
            sc.close();
            return;
        }

        int[][] matrix = new int[n][n];
        int num = 1;
        int left = 0, right = n - 1, top = 0, bottom = n - 1;

        while (left <= right && top <= bottom) {
            for (int i = left; i <= right; i++) {
                matrix[top][i] = num++;
            }
            for (int i = top + 1; i <= bottom; i++) {
                matrix[i][right] = num++;
            }
            if (left < right && top < bottom) {
                for (int i = right - 1; i > left; i--) {
                    matrix[bottom][i] = num++;
                }
                for (int i = bottom; i > top; i--) {
                    matrix[i][left] = num++;
                }
            }
            left++;
            right--;
            top++;
            bottom--;
        }

        // Print the matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        sc.close();
    }
}

//TODO:数组反转
//定义数组{34,56,3,2,65,7,34,5,76,34,67}，然后反转
//重点在于i--，如果用arr.length，就要-1，因为数组是从0开始的，所以虽然数字有11个，但是index只到10，
class Reverse{
    public static void main(String[] args) {
        int[] arr = new int[] {34,56,3,2,65,7,34,5,76,34,67};
        for (int i = arr.length-1; i > 0; i--) {
            System.out.print(arr[i]+"\t");
        }
    }
}

//TODO：数组扩容
//现有数组 int[] arr = new int[]{1,2,3,4,5}
//将数组长度扩大一倍，并将10,20,30三个数据添加到数组中
class Extend{
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        int[] arr2 = new int[arr.length*2];

        for (int i = 0; i < arr.length*2; i++) {
            if (i<=4){
                arr2[i] = arr[i];
            } else if (i<8&&i>4) {
                arr2[i] = 10*(arr[i-4]);
            }
        }
        arr = arr2; //重新赋值arr
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr2[i]+"\t");
        }

    }
}

//TODO：数组缩容
//现有数组 int[] arr = new int[]{1,2,3,4,5,6,7}
//删掉索引为 4 的元素
class Retract{
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7};
        int deleteIndex = 4;
        for (int i = deleteIndex; i < arr.length-1; i++) {
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

//TODO: 数组查找
//线性查找
//数组34,54,3,2,65,7,34,5,76,34,67
//查找是否有5，并告知5的索引
class Finder1{
    public static void main(String[] args) {
        boolean flag = true;
        int[] arr = {34,54,3,2,65,7,5,34,76,34,67};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==5){
                flag = true;
                System.out.println("Yes");
                System.out.println(i);
                break;
            }else {
                flag = true;
            }
        }
        if (flag=true){
            System.out.println("No");

        }
    }
}