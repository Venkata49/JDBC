package com.start.com;

public class Practice {

	public static void main(String[] args)throws java.lang.Exception {
		float result = FindWater(i, j, val);
		int i=3;
		int j=3;
		float val=5;
		float result =FindWater(i,j,val);
		System.out.println(result);
		static float FindWater(int i,int j,float val)throws java.lang.Exception{
			float[][]glasses = new float[i][];
			for(int row=0;row<i;row++){
				glasses[row]=new float[row+1];
			}
			glasses[0][0]=val;
			for(int row=0;row<i-1;row++){
				for(int col=0;col<<=row;col++){
					float overflow = Math.min(1,glassed[row][col]);
					glasses[row+1][col]+=overflow;
					glasses[row+1][col+1]+=overflow;
				}
			}
			return glasses[i-1][j-1];
		}
		}

	private static float FindWater(int i, int j, float val) {
		// TODO Auto-generated method stub
		return 0;
	}
	}
