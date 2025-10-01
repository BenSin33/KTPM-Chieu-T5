    package model;

    import java.sql.*;

    /**
     * This should connects to database to get, insert, update or delete data.
     */

     //5 Thiếu chức năng insert, update,delete
    public class ModelManager {
        private static String url = "jdbc:mysql://localhost:3306/bookme"; //12 nên là private static final
        private static String user = "root";//12 nên là private static final
    //    private static String pass = "admin"; // essam
        private static String pass = "yakout"; // yakout//12 nên là private static final
        private static ModelManager model;
        private Connection connection;
        static private int pagecount = 20; // 6 PAGE_COUNT, 10 nên là hằng số    final

        private ModelManager() {
            startConnection();
        }

        public static synchronized ModelManager getInstance()
        {
            if (model == null) {
                model = new ModelManager();
            }
            return model;
        }

        public void startConnection() {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                connection = DriverManager.getConnection(url, user, pass);
            } catch (SQLException | ClassNotFoundException e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
        }

        public Connection getConnection() {
            return connection;
        }

        public ResultSet executeQuery(String query) throws SQLException {
            Statement statement = connection.createStatement();// 19 Không kiểm tra xem object connection có null không
            statement.execute(query);// 15 Không kiểm tra query có null không
            return statement.getResultSet();
        }

        static public int getPagecount() {
            return pagecount;
        }

        public void closeConnection() {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();// 37 chưa in ra lỗi
            }
        }
    }
