class Solution {
    public boolean backspaceCompare(String s, String t) {
        if(s.length()==0&&t.length()==0) return true;
        Stack<Character> stack = new Stack<>();
        Stack<Character> stack1 = new Stack<>();

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='#'){
                stack.push(s.charAt(i));

            }
            else{
                int top=stack.size();
                if(!stack.isEmpty()) stack.pop();

                
            }
        }
         for(int i=0;i<t.length();i++){
            if(t.charAt(i)!='#'){
                stack1.push(t.charAt(i));

            }
            else{
                int top=stack1.size();
                if(!stack1.isEmpty()) stack1.pop();
                
            }
        }
        if(stack.equals(stack1)){
            return true;
        }
    return false;}
}