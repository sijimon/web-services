package com.samplepoc;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.jboss.resteasy.plugins.server.servlet.HttpServletDispatcher;


/*
 * 
 *  HttpServletDispatcher servlet is used to dispatch incoming requests to the Resteasy servlet. 
 *  The javax.ws.rs.Application init parameter is set to the fully qualified name of the JAX-RS application class.
 * 
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Server server = new Server(8080);

        ServletContextHandler helloContext = new ServletContextHandler(ServletContextHandler.SESSIONS);
        helloContext.setContextPath("/");
        ServletHolder helloHolder = new ServletHolder(new HttpServletDispatcher());
        helloHolder.setInitParameter("javax.ws.rs.Application", "com.samplepoc.configureapplication.HelloApplication");
        helloContext.addServlet(helloHolder, "/*");
        server.setHandler(helloContext);

        /*
        ServletContextHandler apiContext = new ServletContextHandler(ServletContextHandler.SESSIONS);
        apiContext.setContextPath("/api");
        ServletHolder apiHolder = new ServletHolder(new HttpServletDispatcher());
        apiHolder.setInitParameter("javax.ws.rs.Application", "com.samplepoc.newapplication.MyApiApplication");
        apiContext.addServlet(apiHolder, "/*");
        server.setHandler(apiContext);

*/
        
        server.start();
        server.join();
    }
}
