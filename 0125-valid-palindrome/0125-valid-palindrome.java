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
                }
            }
            int start=0;
            int end=newString.length()-1;
            while(start<end){
                if(newString.charAt(start)!=newString.charAt(end)){
                    return false;
                }
                start++;
                end--;
            }
        }
        return true;
    }
}