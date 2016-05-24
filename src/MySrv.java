import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class MySrv extends HttpServlet {

    ConnectToDB db = new ConnectToDB();

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String state = request.getParameter("state");
        PrintWriter out = response.getWriter();
        if (state.equals("Connect")) {
            db.connect();
            out.write("Connected!");
        } else if (state.equals("Disconnect")) {
            db.disconnect();
            out.write("Disconnected!");
        } else {

            out.write("Ooommhh! Call to support!");
            out.flush();
            out.close();
        }

    /*@Override
    public void doGet(HttpServletRequest request, HttpServletResponse response){
        String inputText = request.getParameter("inputText");
        response.setStatus(HttpServletResponse.SC_OK);
        PrintWriter out = null;
        String res = "";
        try {
            out = response.getWriter();
            res = ConnectToDB.Connect();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        out.write("<h1>Its Okey Dany!!!!!</h1>" + res);
        out.flush();
        out.close();


    }*/

}}
