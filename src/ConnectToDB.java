public class ConnectToDB {


        boolean connectToDataBase;
        public String connect(){
            if (connectToDataBase == true){
                return "Don't do it!";
            }
            connectToDataBase = true;
            System.out.println("Connect complite!");
            return "Connect complite!";

        }

        public String disconnect() {
            if (connectToDataBase == false){
                return "Don't do it!";
            }
            connectToDataBase = false;
            System.out.println("Disonnected DB!");
            return "Disonnected DB!";

        }

        /*
         public static String Connect() throws SQLException, ClassNotFoundException {
        Connection connection = null;
        String userName = "root";
        String password = "cthdbc1";
        String url = "jdbc:mysql://localhost:3306/computerstore";
        String resultOfConnection = "";

        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection(url,userName,password);
        if(conn != null)
            resultOfConnection = "Connection Successful !";
        else
            System.exit(0);

        Statement st = conn.createStatement();
        // Результирующий запрос
        ResultSet rs = st.executeQuery("select * from manufacturer");
        // Количество колонок в результирующем запросе
        int columns = rs.getMetaData().getColumnCount();
        // Перебор строк с данными
        while(rs.next()){
            for (int i = 1; i <= columns; i++){
                System.out.print(rs.getString(i) + "\t");
            }
            System.out.println();
        }
        System.out.println();
        if(rs != null)
            rs.close();
        if(st != null)
            st.close();
        if(conn != null)
            conn.close();
        return resultOfConnection;
    }*/
}
