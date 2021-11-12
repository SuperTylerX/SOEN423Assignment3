package publisher;

import common.Setting;
import business.UDPServer;

public class WST_Sever {

    static final int PORT = Setting.WST_PORT;

    public static void main(String[] args) {
        
        new Server(PORT, "WST");
        new UDPServer(Setting.WST_UDP_SERVER_PORT);

    }
}
