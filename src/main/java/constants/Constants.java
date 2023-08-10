package constants;

public class Constants {
    public static final String SELECT_MARKS_QUERY ="SELECT c.name AS course, m.marks " +
            "FROM students s " +
            "JOIN student_course sc ON s.id = sc.student_id " +
            "JOIN courses c ON sc.course_id = c.id " +
            "JOIN marks m ON s.id = m.student_id AND c.id = m.course_id " +
            "WHERE s.username = ?";
    public static final String JDBC_URL = "jdbc:mysql://localhost/GradingSystem";
    public static final String JDBC_USER = "hdawwas";
    public static final String JDBC_PASS = "hrmad";
    public static final String DRIVER_CLASS = "com.mysql.cj.jdbc.Driver";
    public static final String SELECT_STUDENTS_QUERY = "Select * from students where students.username=?";
}
