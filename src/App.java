

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;


public class App 
{
    public static void main( String[] args ) throws MalformedURLException, IOException
    {
        List<Pessoa> pessoas = new ArrayList<>();
        String file_Name = "pessoas.txt";
        String FILE_URL = "https://s3-sa-east-1.amazonaws.com/lcpi/67fdd982-9281-4bb3-bf89-f7c4b157b8f8.txt";
        InputStream url = new URL(FILE_URL).openStream();

        Files.copy(url, Paths.get(file_Name), StandardCopyOption.REPLACE_EXISTING);


        


        Path file = Paths.get(file_Name);
        final Charset charset = Charset.forName("US-ASCII");
        StringBuffer sb = new StringBuffer();
        try (Stream<String> lines = 
        (Files.newBufferedReader(file, charset)
        .lines())) {
        lines.skip(1).forEach(line -> {
                // Split using spaces between the words
                String[] words = line.split("\\s{2,}");
                pessoas.add(new Pessoa(words[0], words[1], words[2], words[3]));

            });
        }
      
        

        
        // Transformando em um stream de pessoas
        
        
        System.out.println(pessoas);

    }
}
