public class BinaryIterativeSearch implements Practice2Search{
	public int search(int[] a, int target){
		int lower = 0;
		int upper = a.length -1;
		while(lower <= upper){
			int mid = (lower+upper)/2;
			if(a[mid] == target){
				return mid;
			}else if(target < a[mid]){
				lower = mid + 1;
			}upper = mid -1;
		}return -1; 
	}
	public String searchName(){
		return "BinaryIterativeSearch";
	}
}