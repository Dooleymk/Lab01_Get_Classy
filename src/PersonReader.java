import javax.swing.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

import static java.nio.file.StandardOpenOption.CREATE;

public class PersonReader {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        JFileChooser chooser = new JFileChooser();
        File selectedFile;
        String data = "";

        try
        {
            File workingDirectory = new File(System.getProperty("user.dir"));
            chooser.setCurrentDirectory(workingDirectory);

            if(chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION)
            {
                selectedFile = chooser.getSelectedFile();
                Path file = selectedFile.toPath();

                InputStream in =
                        new BufferedInputStream(Files.newInputStream(file, CREATE));
                BufferedReader reader =
                        new BufferedReader(new InputStreamReader(in));

                String form1 = "ID#     Firstname   Lastname    Title   YOB";
                String form2 = "===========================================";

                System.out.println(form1);
                System.out.println(form2);
                while(reader.ready())
                {
                    data = reader.readLine();
                    System.out.println(data);
                }
                reader.close();
                System.out.println("\n\nData has been read");
            }
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Error 404: File not found!");
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

}


