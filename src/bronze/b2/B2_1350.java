package bronze.b2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2_1350
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int clusterSize = Integer.parseInt(br.readLine());
		long num = 0L;
		while(st.hasMoreTokens())
		{
			int fileSize = Integer.parseInt(st.nextToken());
			if(fileSize == 0)
			{}
			else
			{
				if(fileSize/clusterSize == 0)
					num += 1;
				else if(fileSize/clusterSize > 0)
				{
					num += (fileSize/clusterSize);
					if(fileSize%clusterSize!=0) // 나머지 있을 때
					{
						num += 1;
					}
				}
			}
		}
		System.out.println(num * clusterSize);
		br.close();
	}
}
