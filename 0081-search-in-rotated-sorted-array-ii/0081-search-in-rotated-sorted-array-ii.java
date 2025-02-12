class Solution {
    public boolean search(int[] arr, int target) {
        
        int s = 0, e = arr.length-1;

        while(s <= e)
        {
            int mid = s + (e-s)/2;

            // When target found !
            if(arr[mid] == target)
            {
                return true;
            }

            // If duplicates exists, handling them 
            else if (arr[s] == arr[mid] && arr[mid] == arr[e])
            {
                if(target == arr[s] || target == arr[e])
                    return true;

                // Now, shrink the search space
                s++;
                e--;
            }
            else if(arr[mid] <= arr[e])  // mid to end is sorted i.e right part
            {
                if(target > arr[mid] && target <= arr[e]) 
                    s = mid + 1;
                else 
                    e = mid - 1;
            }
            else        // start to mid is sorted i.e left part
            {
                if(target >= arr[s] && target < arr[mid])
                    e = mid - 1;
                else
                    s = mid + 1;
            }
        }
        return false;
    }
}