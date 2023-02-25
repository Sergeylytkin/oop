package arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int x = 0;
        int y = x;
        x = 12;
        System.out.println(y);
        int[] arr = new int[10];
        arr[3] = 12;
        print(arr);
        int[] arr2 = new int[]{12,34,546,1,3354};
        print(arr2);
        int[] arr3 = arr2;
        arr2[0] = 2023;
        print(arr2);
        print(arr3);
        int[] arr4 = arrCopy(arr2);
        arr2[0] = 23232323;
        print(arr4);
        //System.arraycopy(arr2, 0, arr4, 0, arr.length);
        int[][] massive = new int[3][];
        int[][] massive2 = new int[][]{{1,2,3},{4,5,6,0},{7,8,9}};
        print(massive2);
        int[][] massive3 = darrCopy(massive2);
        print(massive3);
    }

    private static int[][] darrCopy(int[][] massive) {
        int[][] nMassive = new int[massive.length][];
        for(int _i=0; _i<massive.length; _i++){
            int[] temp = new int[massive[_i].length];
            for (int _j=0; _j<massive[_i].length; _j++){
                temp[_j] =massive[_i][_j];
            }
            nMassive[_i] = temp;
            System.out.println();
        }
        return nMassive;
    }

    private static void print(int[][] massive) {
        for(int _i=0; _i<massive.length; _i++){
            for (int _j=0; _j<massive[_i].length; _j++){
                System.out.print(massive[_i][_j]+" ");
            }
            System.out.println();
        }
    }

    private static int[] arrCopy(int[] arr) {
        int[] nArr = new int[arr.length];
        for (int _i=0; _i<arr.length;_i++){
            nArr[_i] = arr[_i];
        }
        return nArr;
    }

    private static void print(int[] arr) {
        for(int _i=0; _i<arr.length; _i++){
            System.out.print(arr[_i]+" ");
        }
        System.out.println();
    }
}