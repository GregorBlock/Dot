package de.compilerbau.dot;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Class with methods to read and save fingerprints.
 * 
 * @author Dennis Block
 */
public class IOManager
{
    /**
     * File extension.
     */
    private static final String DOT_FILE_EXTENSION = ".dot";
    /**
     * Directory where the fingerprints are saved
     */
    private static final String PATH = "gen_graph/";

    /**
     * Checks and creates the directory if it not exists.
     */
    private static void createPath()
    {
	File path = new File(PATH);
	if (!path.exists())
	{
	    path.mkdirs();
	}
    }
    
    private static boolean checkPath()
    {
	return new File(PATH).exists();
    }

    /**
     * Saves a graph in a file.
     * 
     * @param graph The graph which have to be saved.
     * @throws IOException
     */
    public static void saveGraph(String graph, String graphName)
	    throws IOException
    {
	createPath();
	
	String fileName = graphName;
	File file = new File(PATH + fileName + DOT_FILE_EXTENSION);

	// if file already exists, change the filename ("filename_#", # =
	// number)
	if (file.exists())
	{
	    while (file.exists())
	    {
		fileName = file.getName().substring(0,
			file.getName().indexOf("."));

		// if file contains a "_" there is alreay a number - increment
		if (fileName.contains("_"))
		{
		    String newFileName = fileName.substring(0,
			    fileName.indexOf("_"))
			    + "_"
			    + (Integer.parseInt(fileName.substring(fileName
				    .indexOf("_") + 1)) + 1);

		    file = new File(PATH + newFileName + DOT_FILE_EXTENSION);
		}
		else
		{
		    String newFileName = fileName + "_2";
		    file = new File(PATH + newFileName + DOT_FILE_EXTENSION);
		}
	    }
	}

	FileOutputStream fileOut = new FileOutputStream(file);
	fileOut.write(graph.getBytes());
	fileOut.close();
    }
}
