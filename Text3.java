public class Test2 {
	public static void noOfDuplicates(int arr[]) {
	      int noOfDuplicates = 0;
			  for(int i=0;i<arr.length;i++) {
				  int count = 1;
				  for(int j= i+1;j<arr.length;j++) {
					  if (arr[i]==arr[j]) {
						  count++;
						  
					  }
				  }
				  if(count>1) {
					  noOfDuplicates++;
					  
					  
				  }
				  
			  }
			  System.out.println("No.of duplicates: "+noOfDuplicates);
			 			
	}
	

}
