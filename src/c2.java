import java.util.Scanner;

public class c2 {
}

class ArrayPractices{
    public static void main (String[] args) {
        int[] arr = new int[] {8,2,1,0,3};
        int [] index = new int[] {2,0,3,2,4,0,1,3,2,3,3};

        for (int i = 0; i < index.length; i++) {
            int tel = arr[index[i]];
            System.out.println(tel);

        }
    }
}

class ArrayPractices1{
    public static void main (String[] args) {
        String[] week = new String[] {"Mon","Tue","Wed","Thur","Fri","Sat","Sun"};
        //int[] num = new int[]{1,2,3,4,5,6,7};

        Scanner sc = new Scanner(System.in);
        System.out.print("Input a number: ");
        int a = sc.nextInt();

        System.out.println(week[a-1]);
        /*
        for (int i = 0; i < week.length; i++) {
            if (a==num[i]){
                System.out.println(week[i]);
        }

        }
        */


        sc.close();

    }
}



class ArrayPractices2{
    public static void main (String[] args) {
        //new scanner
        Scanner sc = new Scanner(System.in);
        //学生人数
        System.out.print("pls input the number of students: ");
        int studentNum = sc.nextInt();
        //初始化grades
        int[] grades = new int[studentNum];


        //最大、最小成绩
        //思路：遍历数组中的每一个元素。
        //对于数组中的每一个元素，与当前的最大值和最小值比较。
        //如果该元素大于当前最大值，那么更新最大值。
        //如果该元素小于当前最小值，那么更新最小值。
        int max = 0;
        int min = 100;



        //输入列表中的成绩
        for (int i = 0; i < grades.length; i++) {
            System.out.print("pls input No." + (i+1) +" grades: ");
            int gd = sc.nextInt();
            //注意赋值顺序，如果gd=grade[i],那就是给gd重新赋值了
            grades[i]=gd;
            //或者直接这么写
            //grades[i] = sc.nextInt();
        }

        for (int j = 0; j < grades.length; j++) {
            System.out.println(grades[j]);
            if (grades[j]>max){
                max = grades[j];
            }
            if (grades[j]<min){
                min = grades[j];
            }
        }
        System.out.println("minimum value is "+min);
        System.out.println("maximum value is "+max);
    }
}