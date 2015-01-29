
public class P081_SearchInRotatedSortedArrayII{
	public boolean search(int[] A, int target) {
		int lo =0, hi = A.length-1;
		int mid = 0;
		while(lo<hi){
			mid=(lo+hi)/2;
			if(A[mid]==target)
				return true;
			if(A[mid]>A[hi]){
				if(A[mid]>target && A[lo] <= target)
					hi = mid;
				else lo = mid + 1;
			}else if(A[mid] < A[hi]){
				if(A[mid]<target && A[hi] >= target) 
					lo = mid + 1;
				else hi = mid;
		    }else{
			    hi--;
			}
		}
		return A[lo] == target ? true : false;
	}
}