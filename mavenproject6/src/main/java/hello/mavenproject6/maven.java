/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello.mavenproject6;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author nroma
 */
public class maven extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
  {
     PrintWriter out =res.getWriter();
      int k = Integer.parseInt(req.getParameter("num1"));
      int j = Integer.parseInt(req.getParameter("num2"));
     
      int x = k +j;
     
      RequestDispatcher rd = req.getRequestDispatcher("second");
      rd.forward(req, res);
  }
}
