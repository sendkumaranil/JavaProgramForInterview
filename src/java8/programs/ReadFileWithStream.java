package java8.programs;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ReadFileWithStream {

    public static void main(String[] args) throws IOException {

        String filename = "junglebook.txt";
        String workingDirectory = System.getProperty("user.dir");
        String absoluteFilePath = workingDirectory + File.separator + filename;

        //Read line from file and convert the camel case word in line.
        Files.lines(Paths.get(absoluteFilePath))
                .map(line -> {
                    String[] words=line.split(" ");
                    return Arrays.stream(words)
                            .map(word -> word.substring(0,1).toUpperCase()+word.substring(1))
                            .collect(Collectors.joining(" "));
                })
                // .map(mapToCamelCase)
                .forEach(System.out::println);
    }

    /*
    //we can separate method for map() function also
    //map function which reads the line and split into words then after convert first character of each word in uppercase
    //and return joining string.
    private static Function<String,String> mapToCamelCase=(line)->{

        String[] words=line.split(" ");
        return Arrays.stream(words)
                .map(word -> word.substring(0,1).toUpperCase()+word.substring(1))
                .collect(Collectors.joining(" "));
    };

    //below method is equivalent to upper method without using lamda expression
    private static Function<String,String> mapToCamelCasewithoutLamda=new Function<String, String>() {
        @Override
        public String apply(String line) {
            String[] words=line.split(" ");
            return Arrays.stream(words)
                    .map(word -> word.substring(0,1).toUpperCase()+word.substring(1))
                    .collect(Collectors.joining(" "));
        }
    };*/

}
