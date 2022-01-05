package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

/**
 * Servlet implementation class GetSensor
 */
@WebServlet("/GetSensor")
public class GetSensor extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		SensorDAO dao = new SensorDAO();
		SensorVO vo = dao.getSensor();
		String result = new Gson().toJson(vo);
		PrintWriter out = response.getWriter();
		out.print(result);
	
	}

}
