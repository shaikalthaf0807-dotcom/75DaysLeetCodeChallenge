class Solution {
    public boolean isPalindrome(String s) {
        if(s.equals(" ")){
            return true;
        }else{
            s=s.toLowerCase();
            String newString="";
            for(int i=0;i<s.length();i++){
                char ch=s.charAt(i);
                if(Character.isLetterOrDigit(ch)){
                    newString+=s.valueOf(ch);
                }else{
                    continue;
                }
            }
            char[] arr=newString.toCharArray();
            int start=0;
            int end=arr.length-1;
            while(start<end){
                if(arr[start]==arr[end]){
                    start++;
                    end--;
                    continue;
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}