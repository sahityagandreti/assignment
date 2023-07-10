class Binary{  
 public static void binary(int a[], int first, int last, int key){  
   int mid = (first + last)/2;  
   while( first <= last ){  
      if ( a[mid] < key ){  
        first = mid + 1;     
      }else if ( a[mid] == key ){  
        System.out.println("found at index: " + mid);  
        break;  
      }else{  
         last = mid - 1;  
      }  
      mid = (first + last)/2;  
   }  
   if ( first > last ){  
      System.out.println("not found");  
   }  
 }  
 public static void main(String args[]){  
        int a[] = {10,20,30,40,50};  
        int key = 30;  
        int last=a.length-1;  
        binary(a,0,last,key);     
 }  
}  