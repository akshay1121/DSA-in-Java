class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack <Integer> s = new Stack<>();
        int n = temperatures.length;
        int []arr = new int[n];
        for(int i=0;i<n;i++){
            while(!s.isEmpty() && temperatures[i]>temperatures[s.peek()]){
                int id = s.pop();
                arr[id] = i-id;
            }
            s.push(i);
        }
        return arr;
    }
    
}