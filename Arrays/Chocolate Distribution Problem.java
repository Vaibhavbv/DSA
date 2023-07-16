class Solution{
    public long findMinDiff (ArrayList<Integer> a, int n, int m){
        if(n<m){
            return -1;
        }
        if(n==0 || m==0){
            return 0;
        }
        Collections.sort(a);
        int mindiff = Integer.MAX_VALUE;
        for(int i=0; i+m-1<n; i++){
            int diff = a.get(i+m-1) - a.get(i);
            if(diff<mindiff){
                mindiff = diff;
            }
        }
        return mindiff;
    }
}
