class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
       ArrayList<Integer> arr = new ArrayList<>();

       
        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr1.length;j++){
                if(arr1[j]==arr2[i]){
                    arr.add(arr1[j]);
                }
            }
        }  
        ArrayList<Integer> baki = new ArrayList<>();
        for(int val:arr1){
            if(!contains(arr2,val)){
                baki.add(val);
            }
        }
        Collections.sort(baki);
        arr.addAll(baki);
        int[] result = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            result[i] = arr.get(i);
        }

        return result;
    }

    private boolean contains(int[] arr, int target) {
        for (int num : arr) {
            if (num == target) return true;
        }
        return false;
    }
   
}