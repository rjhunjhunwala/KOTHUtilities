/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knockoutkoth;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rohans
 */
public class Handler {
/**
 * Invokes the runtime in order to parse the contents of the 
 * standard output stream of a process created
 * @param command
 * @return 
 */
	public static String getReturned(String command){
		try {
			String s="";
			Process runtime = Runtime.getRuntime().exec(command);
			int i=0;
			for(;(i=runtime.getInputStream().read())!=-1;)System.out.print((char) i);
			return s;
		} catch (IOException ex) {
			Logger.getLogger(Handler.class.getName()).log(Level.SEVERE, null, ex);
		}
		return null;
}	
}
