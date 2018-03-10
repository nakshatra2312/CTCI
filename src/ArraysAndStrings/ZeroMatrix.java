package ArraysAndStrings;

public class ZeroMatrix {

	
	
	public static void zeroMatrix(int[][] matrix)
	{
		
		boolean firstRowHasZero=false;
		boolean firstColHasZero=false;
		
		int rows= matrix.length;
		int columns= matrix[0].length;
		
		for(int j=0;j<columns;j++)
		{
			if(matrix[0][j]==0)
			{
				firstRowHasZero=true;
			}
			
			
		}
		
		for(int i=0;i<rows;i++)
		{
			if(matrix[i][0]==0)
			{
				firstColHasZero=true;
			}
		}
		
		
		for(int i=1;i<rows;i++)
		{
			for(int j=1;j<columns;j++)
			{
				if(matrix[i][j]==0)
				{
					matrix[0][j]=0;
					matrix[i][0]=0;
				}
			}
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
