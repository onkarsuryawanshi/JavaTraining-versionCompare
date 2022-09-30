import model.Server;
import parser.ServerInputParser;
import services.TestService;

import java.util.Arrays;
import java.util.List;
import java.util.SortedSet;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String[] serversInformation = {
                "Server1, Database, MySQL, 5.5",
                "Server2, Database, MySQL, 5.1",
                "Server3, OS, Ubuntu, 12.04",
                "Server1, OS, Ubuntu, 12.04",
                "Server2, OS, Ubuntu, 18.04",
                "Server3, Language, Python, 2.6.3",
                "Server4, Language, Python, 3.9.14",
                "Server4, Language, Python, 3.10.4"
        };

        ServerInputParser parser = new ServerInputParser();
        List<Server> servers = parser.parseArray(serversInformation);
        System.out.println("--- Servers ---");
        servers.stream().forEach(System.out::println);

        String[] versions = {"2.6.3", "3.9.14", "3.10.4"};
        TestService service = new TestService();
        SortedSet<String> sortedVersions = service.sortedVersions(Arrays.asList(versions));
        sortedVersions.stream().forEach(System.out::println);

        List<String> version = servers.stream().map(Server::getVersion).collect(Collectors.toList());
        version.stream().forEach(System.out::println);
    }
}