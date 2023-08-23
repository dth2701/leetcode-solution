class Solution {
    public int hIndex(int[] citations) {
        // Sort the citations array in non-decreasing order
        int n = citations.length;
        int[] papers = new int[n + 1];
        for (int c: citations) {
            if(c >= n) {
                papers[n]++;
            } else {papers[c]++;}
        }
        int k = n;
        for (int s = papers[n]; k > s; s += papers[k]) {
            k--;
        }
        return k;
    }
}
