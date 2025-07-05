class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> hsmp=new HashMap<>();
        int LI=-1;
        for(int val:arr){
            hsmp.put(val,hsmp.getOrDefault(val,0)+1);
        }
        for(Integer key:hsmp.keySet()){
            if(key==hsmp.get(key)){
                LI =key;
            }
        }
        
  return LI;  }
}