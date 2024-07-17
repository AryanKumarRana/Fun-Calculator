package myPackage;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class myServlet
 */
public class myServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String[] jokes = {
			"why do java develoopers wear glasses? becuase they don't c#!",
			"i told my computer i nested a break, and now it won't bording me kit kat bars.",
			"why don't programmers like nature? it has too many errors",
	};
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public myServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String str1 = request.getParameter("num1");
		String str2 = request.getParameter("num2");
		String str3 = request.getParameter("bt1");
		
		int a = Integer.parseInt(str1);
		int b = Integer.parseInt(str2);
		
//		int sum = num1 + num2;
		
		int ans;
		if(str3.equals("1")) ans=a+b;
		else if(str3.equals("2")) ans=a-b;
		else if(str3.equals("3")) ans=a*b;
		else ans=a/b;
		
		int randomIndex = (int) (Math.random() * jokes.length);
		String randomJoke = jokes[randomIndex];
//		response.getWriter().append("Ans =  "+ans);
		response.sendRedirect("index.jsp?ans="+ans+"&joke="+randomJoke);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
