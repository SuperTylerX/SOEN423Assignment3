package publisher;

import common.Setting;
import business.UDPServer;

public class DVL_Server {

    static final int PORT = Setting.DVL_PORT;

    public static void main(String[] args) {

        new Server(PORT, "DVL");
        new UDPServer(Setting.DVL_UDP_SERVER_PORT);

    }


}
