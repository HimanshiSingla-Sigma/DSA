class Solution {
    public int lastStoneWeight(int[] stones) {

        // min heap 
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for( int num : stones){
            pq.offer(num);
        }

        while( pq.size() > 1 ){
            int stonea = pq.poll();
            int stoneb = pq.poll();

            if( stonea != stoneb){
                pq.offer(stonea- stoneb);
            }
        }

        return pq.isEmpty() ? 0 : pq.peek();

    }
}