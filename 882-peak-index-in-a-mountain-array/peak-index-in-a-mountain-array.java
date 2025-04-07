class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int st = 0;
        int end = arr.length - 1;
        int mid = 0;
        int peak = 0;

        if (arr.length < 3) return -1;

        while (st < end) {
            mid = st + (end - st) / 2;

            if (mid > 0 && mid < arr.length - 1 &&
                arr[mid] > arr[mid + 1] && arr[mid] > arr[mid - 1]) {
                peak = mid;
                break;
            } else if (arr[mid] < arr[mid + 1]) {
                st = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        if (st > 0 && st < arr.length - 1 &&
            arr[st] > arr[st - 1] && arr[st] > arr[st + 1]) {
            peak = st;
        }

        return peak;
    }
}
