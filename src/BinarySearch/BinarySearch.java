package BinarySearch;

public class BinarySearch {

    public static boolean contain(int num, int[] myNum) {
        int low = 0;
        int mid = 0;
        int high = myNum.length-1;
        int i=1;
        mid = low + ((high-low)/2);
//        System.out.println("Low ("+i+"):"+low);
//        System.out.println("Mid ("+i+"):"+mid);
//        System.out.println("High ("+i+"):"+high);
//        System.out.println("----------------");
        if (num==myNum[mid]) {
            return true;
        }
        while(num!=myNum[mid]) {
            i++;
            if(num>myNum[mid]) {
                low = mid+1;
            } else {
                high = mid-1;
            }
            mid = low + ((high-low)/2);
//            System.out.println("Low ("+i+"):"+low);
//            System.out.println("Mid ("+i+"):"+mid);
//            System.out.println("High ("+i+"):"+high);
//            System.out.println("----------------");
            if(mid>high) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] myNum = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(contain(33,myNum));
    }

}
