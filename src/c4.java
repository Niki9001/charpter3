public class c4 {
}
class TwoDArrayPractice1{
    public static void main(String[] args) {
        int[][] arr1 = new int[][]{{3,5,8},{12,9},{7,0,6,4}};
        int sum = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                sum = arr1[i][j] + sum;
                System.out.print(arr1[i][j]+"\t");
            }
            System.out.println(" ");
        }
        System.out.println(sum);
    }
}

class TwoDArrayPractice2{
    public static void main(String[] args) {
        String[][] employee = {
                {"10","1", "a", "22","3000"},
                {"12","2", "b", "32","10000","15000","2000"},
        };
        for (int i = 0; i < employee.length; i++) {
            for (int j = 0; j < employee[i].length; j++) {
                if (employee[i][0]=="10"){
                    employee[i][0] = "Normal";
                } else if (employee[i][0]=="12") {
                    employee[i][0] = "Developer";
                }
                System.out.print(employee[i][j]+"\t\t");
            }
            System.out.println(" ");
        }
    }
}