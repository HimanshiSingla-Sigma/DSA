class Solution {
    public int[][] kClosest(int[][] points, int k) {
        
        ArrayList<int[]> result = new ArrayList<>();

        // max heap 
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a,b) -> Integer.compare(b[0]*b[0] + b[1]*b[1] , a[0]*a[0] + a[1] * a[1])
        );

        for( int i = 0 ; i < points.length ; i++){
            pq.offer(points[i]);

            if( pq.size() > k ){
                pq.poll();
            }
        }

        while(!pq.isEmpty()){
            result.add(pq.poll());
        }

        return result.toArray(new int[result.size()][]);
        
    }
}