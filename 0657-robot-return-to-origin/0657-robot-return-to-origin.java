class Solution {
    public boolean judgeCircle(String moves) {
        int horizontal = 0;
        int vertical = 0;
        for(int i=0; i<moves.length(); i++){
            char ch = moves.charAt(i);
            if(ch == 'U'){
                vertical++;
            }
            else if(ch=='D'){
                vertical--;
            }
            else if(ch=='L'){
                horizontal--;
            }
            else{
                horizontal++;
            }
        }
        if(horizontal == 0 && vertical == 0){
            return true;
        }
        return false;
    }
}