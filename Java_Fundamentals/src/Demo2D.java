
public class Demo2D {

	public static void main(String[] args) {
		int[][] elements=new int [3][];
		
		elements[0]=new int[3];
		elements[1]=new int[1];
		elements[2]=new int[5];
		elements[0][0]=1;
		elements[0][1]=2;
		elements[0][2]=3;
		
		elements[1][0]=4;
//		elements[1][1]=5;
//		elements[1][2]=6;
		
		elements[2][0]=7;
		elements[2][1]=8;
		elements[2][2]=9;
		elements[2][3]=10;
		elements[2][4]=11;
//		elements[2[5]
		
		for(int i=0; i<elements.length;i++) {
			for(int j=0; j<elements[i].length; j++) {
				System.out.print(elements[i][j]+"\t");
			}
			System.out.println();
		}
		
		for(int[] i:elements) {
			for(int j: i){
				System.out.println(j+"\t");
			}
			System.out.println();
		}
	}
}
