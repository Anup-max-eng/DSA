class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int st = 0;
        int end = arr.length - 1;
        int mid = 0;
       while (st < end) {
       mid = st + (end - st) / 2;

    if (arr[mid] < arr[mid + 1]) {
        st = mid + 1;
    } else {
        end = mid;
    }
}
return st;
}}
