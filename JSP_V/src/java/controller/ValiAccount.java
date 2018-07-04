///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package controller;
//
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.Statement;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import sun.security.util.Password;
//
///**
// *
// * @author vincent
// */
//@WebServlet(name = "ValiAccount", urlPatterns = {"/ValiAccount"})
//public class ValiAccount extends HttpServlet {
//
//    /**
//     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
//     * methods.
//     *
//     * @param request servlet request
//     * @param response servlet response
//     * @throws ServletException if a servlet-specific error occurs
//     * @throws IOException if an I/O error occurs
//     */
//    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        response.setContentType("text/html;charset=UTF-8");
//        try (PrintWriter out = response.getWriter()) {
//            /* TODO output your page here. You may use following sample code. */
//          
//            String myId = request.getParameter("myId");
//            boolean pwd = true;
//            
//            //宣告資料庫server 位置與連入的帳號密碼
//            String connectionurl = "jdbc:sqlserver://localhost:1433;"+""
//                    + "databaseName=Project;user=sa;password=12345;";
//        //String user = "sa";
//        //String pass = "12345";
//        Connection con = null;
//        //Statement stmt = null;
//        ResultSet rs = null;
//            
//        try {
//            // 載入驅動程式
//            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//            // 建立 連線 物件
//            con = DriverManager.getConnection(connectionurl); // 連線失敗，con 為 null
//            // 建立 SQL 陳述句 物件
//            //stmt = con.createStatement();
//            // 撰寫 SQL 查詢 字串
//            String SQL = "SELECT email FROM dbo.member where email=?"; // 查詢所有員工
//           
//            /*連線成功後送出myId字串*/
//            PreparedStatement pstmt = con.prepareStatement(SQL);
//            pstmt.setString(1, myId);
//            /*根據資料庫回傳結果*/ 
//            rs = pstmt.executeQuery();
//            
//            if(rs.next())
//            {
//                Password = false;
//                message = "account is used";
//            }else{
//                Password = true;
//                message = "account OK";
//                
//            }catch(Exception e){
//                    
//                    }
//        <response>
//            <passed><%=(passed ? "true":"false")%></passed>
//            <message><%=message %></message>
//        </response>
//            
//            
//        }
//    }
//
//    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
//    /**
//     * Handles the HTTP <code>GET</code> method.
//     *
//     * @param request servlet request
//     * @param response servlet response
//     * @throws ServletException if a servlet-specific error occurs
//     * @throws IOException if an I/O error occurs
//     */
//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        processRequest(request, response);
//    }
//
//    /**
//     * Handles the HTTP <code>POST</code> method.
//     *
//     * @param request servlet request
//     * @param response servlet response
//     * @throws ServletException if a servlet-specific error occurs
//     * @throws IOException if an I/O error occurs
//     */
//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        processRequest(request, response);
//    }
//
//    /**
//     * Returns a short description of the servlet.
//     *
//     * @return a String containing servlet description
//     */
//    @Override
//    public String getServletInfo() {
//        return "Short description";
//    }// </editor-fold>
//
//}
