package tests;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

import com.classpooly.structure.BytecodeClass;

public class ClassPoolyTest {
	
	public static void main(String[] args) throws IOException {
		DataInputStream data = new DataInputStream(new FileInputStream("ServerDescription.class"));
		new BytecodeClass(data);
	}

}
