public class BinarySearch {
    int binarySearch(int[] arr, int target){
       int start = 0;
        if(arr.length == 0) return -1;
        if(arr.length == 1) {
            if(arr[start] == target) return start;
            return -1;
        }
        int end = arr.length-1;
        while(start <= end){
            int mid  = (start+ ((end-start)/2));
            if(arr[mid]==target) return mid+1;
            if(arr[mid]<target){
               start = mid+1;
            }
            else {
                end = mid -1;
            }

        }
        return -1;
    }
    
}
