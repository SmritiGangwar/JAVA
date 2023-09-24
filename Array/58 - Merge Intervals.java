class Solution {
    public int[][] merge(int[][] intervals) {
        //Sorting acc to starting points as we need to merge the intervals so we need min starting point of first interval
        Arrays.sort(intervals,(a,b) -> Integer.compare(a[0],b[0])); 

        ArrayList<int[]> list = new ArrayList<>();

        for(int [] interval : intervals){
            if(list.isEmpty() || interval[0] > list.get(list.size()-1)[1]){
                //if curr interval is starting after end of prev interval OR list is empty
                //then no overlapping, add interval
                list.add(interval);
            }
            else{
                //overlapping, update the end point of previously added interval in the list
                list.get(list.size()-1)[1] = Math.max(interval[1],list.get(list.size()-1)[1]);
            }
        }
        return list.toArray(new int[0][]);
    }
}
