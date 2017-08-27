package com.t3h.servlet;

import java.io.IOException;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.t3h.dto.TeamDTO;
import com.t3h.service.DataServiceRemote;

/**
 * Servlet implementation class FindTeamServlet
 */
@WebServlet("/find-team.jsp")
public class FindTeamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public FindTeamServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	@EJB
	DataServiceRemote dataServiceRemote;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String teamCode = request.getParameter("teamCode");
		String teamName = request.getParameter("teamName");
		String description = request.getParameter("teamDescription");
		String status = request.getParameter("teamStatus");
		List<TeamDTO> lst = dataServiceRemote.getTeamByConditions(teamCode, teamName, description, status);
		request.setAttribute("teams", lst);
		request.getRequestDispatcher("pages/find-team.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
