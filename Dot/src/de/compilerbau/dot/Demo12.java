package de.compilerbau.dot;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import att.grappa.Graph;
import att.grappa.GrappaAdapter;
import att.grappa.GrappaConstants;
import att.grappa.GrappaPanel;
import att.grappa.GrappaSupport;
import att.grappa.Parser;


public class Demo12 implements GrappaConstants
{
   public DemoFrame frame = null;

   public final static String SCRIPT = "formatDemo.sh";

   void doDemo(String input)
   {
      Parser program = null;
      try
      {
         File file = new File("bla");
         FileOutputStream fileOutputStream = new FileOutputStream(file);
         fileOutputStream.write(input.getBytes());
         fileOutputStream.flush();
         fileOutputStream.close();
         program = new Parser(new FileInputStream(file), System.err);
         // program.debug_parse(4);
         program.parse();
      }
      catch (FileNotFoundException e)
      {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
      catch (Exception ex)
      {
         System.err.println("Exception: " + ex.getMessage());
         ex.printStackTrace(System.err);
         System.exit(1);
      }
      Graph graph = program.getGraph();
//      graph.printGraph(System.out);

      // System.err.println("The graph contains "
      // + graph.countOfElements(Grappa.NODE | Grappa.EDGE
      // | Grappa.SUBGRAPH) + " elements.\n");

      graph.setEditable(true);
      // graph.setMenuable(true);
      graph.setErrorWriter(new PrintWriter(System.err, true));
       graph.printGraph(new PrintWriter(System.out));
      //
      // System.err.println("bbox="
      // + graph.getBoundingBox().getBounds().toString());

      frame = new DemoFrame(graph);

      frame.show();
   }

   class DemoFrame extends JFrame implements ActionListener
   {
      /** TODO Add comment for <code>serialVersionUID</code> */
      private static final long serialVersionUID = 1L;

      GrappaPanel gp;

      Graph graph = null;

      JButton layout = null;

      JButton printer = null;

      JButton draw = null;

      JButton quit = null;

      JPanel panel = null;

      public DemoFrame(Graph graph)
      {
         super("Graph");
         this.graph = graph;

         setSize(600, 400);
         setLocation(100, 100);

         addWindowListener(new WindowAdapter()
         {
            public void windowClosing(WindowEvent wev)
            {
               Window w = wev.getWindow();
               w.setVisible(false);
               w.dispose();
               System.exit(0);
            }
         });

         JScrollPane jsp = new JScrollPane();
         jsp.getViewport().setBackingStoreEnabled(true);

         gp = new GrappaPanel(graph);
         gp.addGrappaListener(new GrappaAdapter());
         gp.setScaleToFit(true);

         java.awt.Rectangle bbox = graph.getBoundingBox().getBounds();

         GridBagLayout gbl = new GridBagLayout();
         GridBagConstraints gbc = new GridBagConstraints();

         gbc.gridwidth = GridBagConstraints.REMAINDER;
         gbc.fill = GridBagConstraints.HORIZONTAL;
         gbc.anchor = GridBagConstraints.NORTHWEST;

         panel = new JPanel();
         panel.setLayout(gbl);

         draw = new JButton("Draw");
         gbl.setConstraints(draw, gbc);
         panel.add(draw);
         draw.addActionListener(this);

         layout = new JButton("Layout");
         gbl.setConstraints(layout, gbc);
         panel.add(layout);
         layout.addActionListener(this);

         printer = new JButton("Print");
         gbl.setConstraints(printer, gbc);
         panel.add(printer);
         printer.addActionListener(this);

         quit = new JButton("Quit");
         gbl.setConstraints(quit, gbc);
         panel.add(quit);
         quit.addActionListener(this);

         getContentPane().add("Center", jsp);
         getContentPane().add("West", panel);

         setVisible(true);
         jsp.setViewportView(gp);
      }

      public void actionPerformed(ActionEvent evt)
      {
         if (evt.getSource() instanceof JButton)
         {
            JButton tgt = (JButton) evt.getSource();
            if (tgt == draw)
            {
               graph.repaint();
            }
            else if (tgt == quit)
            {
               System.exit(0);
            }
            else if (tgt == printer)
            {
               graph.printGraph(System.out);
               System.out.flush();
            }
            else if (tgt == layout)
            {
               // Use an external program to produce layout information.
               // For directed graphs use "dot", for undirected graphs use
               // "neato".

               ProcessBuilder pb;

               if (graph.isDirected())
               {
                  pb = new ProcessBuilder("dot", "-Tdot");
               }
               else
               {
                  pb = new ProcessBuilder("neato", "-Goverlap=false",
                        "-Gsplines=true", "-Gsep=.1", "-Tdot");
               }

               Process dotProcess;
               try
               {
                  dotProcess = pb.start();
                  GrappaSupport.filterGraph(graph, dotProcess);

                  graph.repaint();
                  dotProcess.destroy();
               }
               catch (IOException e)
               {
                  e.printStackTrace();
               }
               
//               Process connector = null;
//               try
//               {
//                  String[] processArgs = { "dot" }; 
//                  connector = Runtime.getRuntime().exec(processArgs, null,
//                        null);
//               }
//               catch (Exception ex)
//               {
//                  System.err.println("Exception while setting up Process: "
//                        + ex.getMessage() + "\nTrying URLConnection...");
//                  connector = null;
//               }
//               
//               if (connector != null)
//               {
//                  if (!GrappaSupport.filterGraph(graph, connector))
//                  {
//                     System.err.println("ERROR: somewhere in filterGraph");
//                  }
//                  graph.printGraph(System.out);
//                     try
//                     {
//                        int code = connector.waitFor();
//                        if (code != 0)
//                        {
//                           System.err.println("WARNING: proc exit code is: "
//                                 + code);
//                        }
//                     }
//                     catch (InterruptedException ex)
//                     {
//                        System.err
//                              .println("Exception while closing down proc: "
//                                    + ex.getMessage());
//                        ex.printStackTrace(System.err);
//                     }
//                  }
//                  connector = null;
//               graph.repaint();
            }
         }
      }
   }
}
