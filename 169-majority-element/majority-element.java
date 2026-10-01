class Solution {
    public int majorityElement(int[] nums) {
        int Candidate=0;
        int vote=0;

        for(int num:nums){
            if(vote==0){
                Candidate=num;
                vote+=1;
            }else if(Candidate==num){
                vote+=1;
            }else{
                vote-=1;
            }
        }
        return Candidate;
        
    }
}