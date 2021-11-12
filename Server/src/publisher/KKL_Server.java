package publisher;

import common.Setting;
import business.UDPServer;

public class KKL_Server {

    static final int PORT = Setting.KKL_PORT;

    public static void main(String[] args) {

        new Server(PORT, "KKL");
        new UDPServer(Setting.KKL_UDP_SERVER_PORT);

    }
}
