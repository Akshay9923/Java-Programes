class CaesarCipher{

	public static void main(String args[]){
		
	String pt=args[0],ct="",et="";
	  int key=Integer.parseInt(args[1]);

	for(int i=0;i<pt.length();i++){
		ct = ct + (char)(pt.charAt(i) + key);
	}	
	System.out.println("your encrypted text is :-"+ct+"\n");
	
	for(int i=0;i<ct.length();i++){
		et = et + (char)(ct.charAt(i) - key);
	}	
	System.out.println("your decrypted text is :-"+et+"\n");
    }
}