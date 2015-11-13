package com.afroz;

import java.io.IOException;
import com.afroz.SecondWebServiceStub.Message;
import com.afroz.SecondWebServiceStub.MessageResponse;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWebServiceTest extends HttpServlet {
	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		SecondWebServiceStub stub = new SecondWebServiceStub();
		Message msg = new Message();
		MessageResponse res = stub.message(msg);
		response.getWriter().println("<h3>" + res.get_return() + "</h3>");
	}
}