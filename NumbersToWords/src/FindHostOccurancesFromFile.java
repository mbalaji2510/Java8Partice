

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindHostOccurancesFromFile {
    private static final Scanner scan = new Scanner(System.in);
   
    public static void main(String args[]) throws Exception {
        // read the string filename
        String filename;
        filename = scan.nextLine();
        String outputFilename = "records_"+filename;
        List<String> list = new ArrayList<>();

        try (Stream<String> stream = Files.lines(Paths.get(filename))) {
        list = stream.collect(Collectors.toList());

} catch (IOException e) {
e.printStackTrace();
}
       
       /* Map<String,List<Host>> dept=(Map<String, List<Host>>)
        list.stream().collect(supplier, accumulator, combiner)(Collectors.groupingBy(Host::getHostName));*/

        list.forEach(System.out::println);
    }
}
/*class Host {

private String hostName;

*//**
* @param hostName
*//*
public Host(String hostName) {
super();
this.hostName = hostName;
}

*//**
* @return the hostName
*//*
public String getHostName() {
return hostName;
}

*//**
* @param hostName the hostName to set
*//*
public void setHostName(String hostName) {
this.hostName = hostName;
}


}*/