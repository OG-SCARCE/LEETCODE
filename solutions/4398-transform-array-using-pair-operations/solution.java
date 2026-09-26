class Solution {
    public boolean canTransform(int[] source, int[] target) {
        if(source.length != target.length){
            return false;
        }

        if(source.length == 1){
            return source[0] == target[0];
        } 

        long sums = 0;
        long sumt = 0;

        for(int i = 0; i < source.length; i++) {
            sums += source[i];
            sumt += target[i];
        }
        return sums == sumt;
    }
}
