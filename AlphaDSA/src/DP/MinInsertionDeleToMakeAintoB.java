package DP;

public class MinInsertionDeleToMakeAintoB {

	public static void main(String[] args) {
		String s = "aabc";
		String p = "anc";
		int n = s.length();
        int m = p.length();
        int k = space_op(n, m, s, p);
        System.out.println(n + m - 2*k);
	}

	//Based on LCS CONCEPT
	
	//Code of LCS
	
    public static int space_op(int n, int m, String s, String t) {
        int[] prev = new int[m+1];
        
        for(int ind1=1; ind1<=n; ind1++) {
            int[] curr = new int[m+1];
            for(int ind2=1; ind2<=m; ind2++) {
                if(s.charAt(ind1-1) == t.charAt(ind2-1)) {
                    curr[ind2] = 1 + prev[ind2-1];
                }
                else {
                    curr[ind2] = Math.max(prev[ind2], curr[ind2-1]);
                }
            }
            prev = curr;
        } 
        return prev[m];
    }

}
