public class BinaryRecursiveSearch implements Practice2Search{

	public int search(int[] a, int target){
		int lower = 0;
		int upper = a.length -1;

		return bin_search(a,target,lower,upper);
	}
	public int bin_search(int[] a, int target, int lower, int upper){
		if(lower>upper){
			return -1;
		}else{
			int mid = (lower+upper)/2;
			if(a[mid] == target){
				return mid;
			}else if(target < a[mid]){
				return bin_search(a,target,lower,mid-1);

			}return bin_search(a,target,mid+1,upper);
		}
	}

	public String searchName(){
		return "BinaryRecursiveSearch";
	}
}