import com.yalestar.util.Configurator;
import org.mortbay.jetty.Server;
import org.mortbay.jetty.servlet.Context;
import org.mortbay.jetty.servlet.ServletHolder;

import java.io.IOException;

public class Starter {

    public static void main(String[] args) throws Exception, IOException {
        Server server = new Server(8080);
        Context root = new Context(server, "/", Context.SESSIONS);
        root.setContextPath("/exploded");
        root.addServlet(new ServletHolder(new Configurator()), "/*");
        root.addServlet(new ServletHolder(new org.apache.struts.action.ActionServlet()), "/egg/*");
        server.start();

    }
}
