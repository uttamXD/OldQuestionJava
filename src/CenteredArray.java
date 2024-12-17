public class CenteredArray {
    public static int isCenteredArray(int[] arr){
        if (arr.length % 2 ==0 || arr.length == 0){
            return 0;
        }

        int middleIndex = arr.length/2;
        int middleValue = arr[middleIndex];

        for (int i = 0 ; i<arr.length;i++) {
            if (i != middleIndex && arr[i] <= middleValue){
                return 0;
            }
        }
        return 1;
    }
    public  static void main(String[] args){
        int[] arr1 = {3,2,4,5,6};
        int[] arr2 = {1,3,5,4};
        int[] arr3 = {4,6,8,1,2,4,3};

        System.out.println(isCenteredArray(arr1));
        System.out.println(isCenteredArray(arr2));
        System.out.println(isCenteredArray(arr3));
    }
}


