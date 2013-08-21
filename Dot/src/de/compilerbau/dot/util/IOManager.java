package de.compilerbau.dot.util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Hilfsklasse zum Laden und Speichern von Graphen (als .dot-Datei und
 * .png-Datei).
 */
public class IOManager
{
    /**
     * Endung für dot-Datei.
     */
    private static final String DOT_FILE_EXTENSION = ".dot";

    /**
     * Endung für Bilddatei
     */
    private static final String IMAGE_FILE_EXTENSION = ".png";

    /**
     * Ordner, indem die dot-Dateien gespeichert werden.
     */
    public static final String DOT_PATH = "gen_graph/";

    /**
     * Ordner, indem die Graphen als Bilddateien gespeichert werden.
     */
    public static final String IMAGE_PATH = "gen_images/";

    /**
     * Erstellt den Ordner, falls dieser nicht exisitiert.
     * 
     * @param path Pfad zum Ordner.
     */
    private static void createPath(String path)
    {
	File file = new File(path);

	if (!file.exists())
	{
	    file.mkdirs();
	}
    }

    /**
     * Speichert den Graphen. Ermöglicht das Speichern von Graphen mit selben
     * Namen.
     * Existiert bereits ein Graph mit dem Namen, wird der Datei eine laufende
     * Nummer an den Namen angehängt.
     * 
     * @param graph Graph als String.
     * @param graphName Name (Identifiert) des Graphen.
     * 
     * @throws IOException Wird geworfen, wenn beim Speichern des Graphen etwas
     *             schiefgelaufen ist.
     */
    public static void saveGraph(String graph, String graphName)
	    throws IOException
    {
	// Erstellt den Ordner, falls dieser nicht bereits exisitert
	createPath(DOT_PATH);

	String fileName = graphName;
	File file = new File(DOT_PATH + fileName + DOT_FILE_EXTENSION);

	String newFileName;

	// Graph mit selben Namen exisitert bereits
	if (file.exists())
	{
	    // Solange neue Datei nicht existiert...
	    while (file.exists())
	    {
		// Dateiname ohne Endung
		fileName = file.getName().substring(0,
			file.getName().indexOf("."));

		// Enthält der Name ein "_", ist bereits eine laufende Nummer
		// angehängt
		// Die Zahl wird ausgelesen und inkrementiert
		if (fileName.contains("_"))
		{
		    newFileName = fileName.substring(0, fileName.indexOf("_"))
			    + "_"
			    + (Integer.parseInt(fileName.substring(fileName
				    .indexOf("_") + 1)) + 1);

		    file = new File(DOT_PATH + newFileName + DOT_FILE_EXTENSION);
		}
		else
		{
		    // Dateinamen eine "_2" anhängen
		    newFileName = fileName + "_2";
		    file = new File(DOT_PATH + newFileName + DOT_FILE_EXTENSION);
		}
	    }
	}

	// Graph in die Datei schreiben
	FileOutputStream fileOut = new FileOutputStream(file);
	fileOut.write(graph.getBytes());
	fileOut.close();

	// Bilddateien erstellen
	createImages();
    }

    /**
     * Lädt alle Dateien in einem bestimmten Pfad.
     * 
     * @param path Pfad aus dem die Dateien geladen werden sollen.
     * @return Liste von Dateien.
     */
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

    /**
     * Erstellt Bilddateien zu vorhandenen dot-Dateien.
     * 
     * @throws IOException
     */
    public static void createImages() throws IOException
    {
	// Erstellt Ordner für Bilddateien, falls dieser nicht bereits
	// existiert.
	createPath(IMAGE_PATH);

	// Laden der dot-Dateien
	ArrayList<File> files = load(DOT_PATH);

	ProcessBuilder pb;

	// Für jede dot-Datei eine Bilddatei erstellen
	for (int i = 0; i < files.size(); i++)
	{
	    String path = files.get(i).getPath();

	    int index = files.get(i).getName().indexOf(".");

	    String imgPath = IMAGE_PATH
		    + files.get(i).getName().substring(0, index)
		    + IMAGE_FILE_EXTENSION;

	    // Erstellen der Bilddatei mit Hilfe der dot.exe
	    pb = new ProcessBuilder("Graphviz/bin/dot.exe", "-Tpng", path,
		    "-o", imgPath);
	    try
	    {

		int code = pb.start().waitFor();
		if (code != 0)
		{
		    System.err
			    .println("WARNUNG: ProzessBuilder exit code ist: "
				    + code);
		}
	    }
	    catch (InterruptedException e)
	    {
		System.err.println(e);
	    }
	}
    }

    /**
     * Löscht sowhol alle dot-Dateien, als auch alle Bilddateien in den Ordnern.
     */
    public static void deleteFiles()
    {
	// Löschen der dot-Dateien
	ArrayList<File> files = load(DOT_PATH);

	for (int i = 0; i < files.size(); i++)
	{
	    files.get(i).delete();
	}

	// Löschen der Bilddateien
	files = load(IMAGE_PATH);

	for (int i = 0; i < files.size(); i++)
	{
	    files.get(i).delete();
	}
    }
}
