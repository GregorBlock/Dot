package de.compilerbau.dot.util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

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

   private static final String IMAGE_FILE_EXTENSION = ".png";

   /**
    * Directory where the fingerprints are saved
    */
   public static final String DOT_PATH = "gen_graph/";

   public static final String IMAGE_PATH = "gen_images\\";

   /**
    * Checks and creates the directory if it not exists.
    */
   private static void createPath(String path)
   {
      File file = new File(path);
      if (!file.exists())
      {
         file.mkdirs();
      }
   }

   private static boolean checkPath(String path)
   {
      return new File(path).exists();
   }

   /**
    * Saves a graph in a file.
    * 
    * @param graph
    *           The graph which have to be saved.
    * @throws IOException
    */
   public static void saveGraph(String graph, String graphName)
         throws IOException
   {
      createPath(DOT_PATH);

      String fileName = graphName;
      File file = new File(DOT_PATH + fileName + DOT_FILE_EXTENSION);

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

               file = new File(DOT_PATH + newFileName + DOT_FILE_EXTENSION);
            }
            else
            {
               String newFileName = fileName + "_2";
               file = new File(DOT_PATH + newFileName + DOT_FILE_EXTENSION);
            }
         }
      }

      FileOutputStream fileOut = new FileOutputStream(file);
      fileOut.write(graph.getBytes());
      fileOut.close();
   }

   public static ArrayList<File> load(String path)
   {
      ArrayList<File> files = new ArrayList<File>();

      File root = new File(path);

      for (File f : root.listFiles())
      {
         files.add(f);
      }

      return files;
   }

   public static void createImages() throws IOException
   {
      createPath(IMAGE_PATH);

      ArrayList<File> files = load(DOT_PATH);

      ProcessBuilder pb;
      for (int i = 0; i < files.size(); i++)
      {
         String path = files.get(i).getPath();
         System.out.println(path);
         pb = new ProcessBuilder("dot/bin/dot.exe", "-Tpng", "gen_graph/g.dot",
               "-o","gen_images/g.png");
         pb.start();
         System.out.println(IMAGE_PATH + files.get(i).getName() + IMAGE_FILE_EXTENSION);
      }
   }
}

//dot/bin/dot.exe -Tpng gen_graph/g.dot > gen_images/g.png