import java.util.Arrays;

public class ArrayCopier {

	void copy (int[] src, int[]dst) {
	
		if (src.length == dst.length) {
			for (int i=0 ; i < src.length ; i++) {
			dst[i] = src[i];
			}
		}

		if (src.length < dst.length)  {
			for (int j=0 ; j < src.length ; j++) {
			dst[j] = src[j];
			} 
			for (int k = src.length ; k < dst.length ; k++) {
			dst[k] = 0;
			} 
		}

		if (src.length > dst.length)  {
			for (int l=0 ; l < dst.length ; l++) {
			dst[l] = src[l];
			} 
		}
	}






//fffffffffffffffffffffffffffffffffffffffffffff


public static void main(String[] args) {
       
       ArrayCopier arrayCopier = new ArrayCopier();
 int[] src = new int[]{1,2,3,4};
 int[] dst = new int[]{5,6};

arrayCopier.copy(src,dst);

    
        
	  

	System.out.println(Arrays.toString(dst));
   }
}