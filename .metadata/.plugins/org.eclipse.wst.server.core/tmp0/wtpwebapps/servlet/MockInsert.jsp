<%@page import="java.util.Scanner"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="javax.print.DocFlavor.STRING"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Statement"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Insert</title>
</head>
<body>
	<%!private static Connection connection;
	private static Statement statement;
	private static PreparedStatement preparedStatement;
	private final static String driverPath = "com.mysql.cj.jdbc.Driver";
	private static String query="INSERT INTO student VALUES(?,?,?)";
	private final static String url="jdbc:mysql://localhost:3306/demo";
	private final static String user="root";
	private final static String password="root";
	private static int result;
	private static Scanner sc = new Scanner(System.in);
	%>

	<%!
	public static void createConnection() throws Exception{
		Class.forName(driverPath);
		connection=DriverManager.getConnection(url, user, password);
		preparedStatement = connection.prepareStatement(query);		
	}
	
	public static void closeConnection(){
		if (connection!=null) {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} 
	}%>
	
	<%! 
	try {
			createConnection();	
			System.out.println("Enter a id : ");
			preparedStatement.setInt(1, sc.nextInt());
			System.out.println("Enter a name : ");
			preparedStatement.setString(2,sc.next());
			System.out.println("Enter a rating : ");
			preparedStatement.setString(3, sc.next());
			result = preparedStatement.executeUpdate();
			System.out.println(result + " records inserted successfully..!!");
			result = 0;
			closeConnection();
		} catch (Exception e) {
			// TODO: handle exception
		}%>
</body>
</html>