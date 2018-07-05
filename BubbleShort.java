 class BubbleShort{

	public static void main(String args[]){
	
	int a[]={1,4,3,2,5,7,6,9,10,8};
	for(int i=0;i<a.length;i++){

		for(int j=0;j<a.length-1;j++){

		if(a[j]>a[j+1]){

		int temp=a[j];
		a[j]=a[j+1];
		a[j+1]=temp;
		
		}
	    }
	
	} 

 	for(int i=0;i<a.length;i++){
	
	  System.out.print(a[i]+"\n");	
	}  
 }
}