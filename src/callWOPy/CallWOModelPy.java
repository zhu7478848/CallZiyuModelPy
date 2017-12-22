package callWOPy; 

import java.io.*;

public class CallWOModelPy {
	String py_path;
	
	public CallWOModelPy() {
		this.py_path= "E:\\MyPro\\fileRW\\test_tensorflow.py";
	}
	
	public CallWOModelPy(String path) {
		this.py_path= path;
	}
	
	private void procOutStream(InputStream fis) {
		//��һ�����������ȥ��    
        InputStreamReader isr=new InputStreamReader(fis);    
        //�û���������    
        BufferedReader br=new BufferedReader(isr);    
        String line=null; 
        try {
        	//ֱ������Ϊֹ
        	while((line=br.readLine())!=null)    
            {    
                System.out.println(line);    
            }
        } catch (IOException e) {
        	e.printStackTrace();
        }  
	}
	
	public void callPy() {
		System.out.println("calling start");
		Process proc = null;
		int state = 0;
        try {
            proc = Runtime.getRuntime().exec("python " + py_path);
            InputStream fis=proc.getInputStream();
            procOutStream(fis);
            state = proc.waitFor();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("call state is "+ state);
        System.out.println("calling end");
	}
	
}
