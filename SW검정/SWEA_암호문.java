package practice;


import java.util.LinkedList;

import java.util.StringTokenizer;
import java.io.BufferedReader;

import java.io.InputStreamReader;


class SWEA_암호문
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = 10;
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
			int N = Integer.parseInt(br.readLine().trim());
			LinkedList<Integer> LL = new LinkedList<Integer>();
			StringTokenizer st =new StringTokenizer(br.readLine());
			for(int index = 0 ; index < N ; index++) LL.add(Integer.parseInt(st.nextToken()));
			int Order = Integer.parseInt(br.readLine().trim());
			st = new StringTokenizer(br.readLine());
			for(int index = 0 ; index < Order ; index++) {
				String i = st.nextToken();
				int start_index = Integer.parseInt(st.nextToken());
				int end_index = Integer.parseInt(st.nextToken());
				for(int st_idx = start_index; st_idx < start_index+end_index;  st_idx++) {
					LL.add( st_idx, Integer.parseInt(st.nextToken()));
				}
				
			}
			
			System.out.print("#"+test_case+" ");
			for(int index = 0 ; index <10 ; index++)System.out.print(LL.get(index) +" ");
			System.out.println();
			
		}
	}
}