import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

public class MySrv extends HttpServlet {

    @Override
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
    }

}
