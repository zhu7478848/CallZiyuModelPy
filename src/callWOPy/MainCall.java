package callWOPy;

//import org.python.core.PyFunction; 
//import org.python.core.PyInteger;
//import org.python.core.PyObject; 
//import org.python.util.PythonInterpreter;  

import java.io.*;

public class MainCall {
	
	public static void main(String args[]) throws IOException, InterruptedException {
		//call jython
		/*
		PythonInterpreter interpreter = new PythonInterpreter();  
		interpreter.execfile("E:\\MyPro\\fileRW\\test_tensorflow.py");
		interpreter.exec("print('hello')");
		interpreter.close();
		*/
		String path = "E:\\MyPro\\CallZiyuModelPy\\src\\gongdan_ziyu_model.py";
		CallWOModelPy callPy = new CallWOModelPy(path);
		callPy.callPy();

	}
	
}
