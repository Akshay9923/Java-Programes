class SelectionSort{
	public static void main(String[] args){

		int a[]={21,45,11,56,78};
		int min;
		for(int i=0;i<(a.length);i++){

		        min=i;
			for(int j=i+1;j<a.length;j++){

				if(a[j]<a[min]){

				  int temp=a[j];
				  a[j]=a[min];
				  a[min]=a[j];
				}
			}
		}
		
		System.out.println("Sorted Array is :=");
		
		for(int i=0;i<a.length;i++){

			System.out.println(a[i]);
	        }
   }
}

		
			
		