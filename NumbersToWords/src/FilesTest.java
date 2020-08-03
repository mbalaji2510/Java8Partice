import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilesTest {

private static final String SEPARATOR = " ";

public static void main(String[] args) {
String fileName = "/home/ciri/eclipse-workspace/Java_8_Basic/src/com/brain/sotware/lines.txt";
List<Host> list = new ArrayList<>();

try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
           
Stream<String> list1 = stream.map(line -> Arrays.toString(line.split(SEPARATOR)));
String bj =list1.toString();
        String[] a = bj.split(" ");
    Host host=new Host();
    host.setHostName(a[0]);
    list.add(host);
 


} catch (IOException e) {
e.printStackTrace();
}
       
    Map<String, Long> counting = list.stream().collect(
               Collectors.groupingBy(Host::getHostName, Collectors.counting()));

      System.out.println(counting);
}


}
class Host {

private String hostName;


/**
* @param hostName
*/
public Host(String hostName) {
super();
this.hostName = hostName;
}

public Host() {
// TODO Auto-generated constructor stub
}

/**
* @return the hostName
*/
public String getHostName() {
return hostName;
}

/**
* @param hostName the hostName to set
*/
public void setHostName(String hostName) {
this.hostName = hostName;
}


}
