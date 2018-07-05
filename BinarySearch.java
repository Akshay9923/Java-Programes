class BinarySearch{

    int binSearch(int a[], int l, int r, int x){
       
	    if (l<=r){
     	    	int mid = l + (r - l)/2;
           	if (a[mid] == x)
               		return mid;
            	else if (a[mid] > x)
               		return binSearch(a, l, mid-1, x);
       	   	else	
            		return binSearch(a, mid+1, r, x);
        }
           return -1;
    }
    public static void main(String args[]){

        BinarySearch obj = new BinarySearch();
        int a[] = {1,2,3,4,5,6,7,8,9,10};
        int n = a.length;
        int x = 7;
        int result = obj.binSearch(a,0,n-1,x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " +result);
    }
}