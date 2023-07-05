package com.example.javaprojtectest2.week11.day3.programmers.network43162;

class UnionFindSolution {
    int[] parents;
    
    public int solution(int n, int[][] computers) {
        parents = new int[n];
        
        for(int i=0;i<n;i++){
            parents[i] = i;
        }
        
        for(int i=0;i<computers.length;i++){
            for(int j=0;j<computers[0].length;j++){
                if(computers[i][j]==1){
                    union(i,j);
                }
            }
        }
    
        int cnt = 0;
        for(int i=0;i<computers.length;i++){
            if (findParents(i) == i) {
                cnt++;
            }
        }
        
        return cnt;
    }
    
    public int findParents(int x){
        if(parents[x]==x){
            return x;
        }
        return parents[x] = findParents(parents[x]);
    }
    
    public void union(int a, int b){
        a = findParents(a);
        b = findParents(b);
        if (a < b) {
            parents[b] = a;
        } else {
            parents[a] = b;
        }
    }
}