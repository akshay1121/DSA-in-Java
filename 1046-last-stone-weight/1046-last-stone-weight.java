class Solution {
    public int lastStoneWeight(int[] stones) {
      PriorityQueue<Integer> m = new PriorityQueue<>(Collections.reverseOrder());
      for(int s:stones){
        m.offer(s);
      }
      while(m.size()>1){
        int y = m.poll();
        int x = m.poll();
        if(y!=x){
            m.offer(y-x);
        }
      }
      return m.isEmpty() ? 0:m.poll();

    }
} 