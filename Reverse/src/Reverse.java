import java.io.*;
public class Reverse {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		InputStream fis = new FileInputStream("input.txt");
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		FileOutputStream fos = new FileOutputStream("output.txt");
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		
		String[] data = new String[100000];
		int count = 0,i;
		while((data[count] = br.readLine())!=null)
		{
			count++;
		}
		for(i=count-1;i>=0;i--)
		{
			bw.write(data[i]);
			bw.newLine();
			bw.flush();
		}
		bw.close(); osw.close(); fos.close(); br.close(); isr.close(); fis.close();
	}

}
