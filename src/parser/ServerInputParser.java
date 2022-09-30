package parser;

import mapper.ServerMapper;
import model.Server;

import java.util.ArrayList;
import java.util.List;

public class ServerInputParser {

    public List<Server> parseArray(String[] inputData) {
        List<Server> servers = new ArrayList<>();
        for (String inputServer : inputData) {
            ServerMapper mapper = new ServerMapper();
            Server server = mapper.map(inputServer);
            servers.add(server);
        }
        return servers;
    }
}
