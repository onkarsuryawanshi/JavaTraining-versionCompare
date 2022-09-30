package mapper;

import model.Server;

public class ServerMapper {
    public  Server map(String data) {
        String[] arr = data.split(",");
        if (arr.length != 4) {
            throw new RuntimeException("invalid number of values");
        }
        String server = arr[0];
        String platform = arr[1];
        String software = arr[2];
        String version = arr[3];
        Server softWare = new Server(server, platform, software, version);
        return softWare;
    }
}
