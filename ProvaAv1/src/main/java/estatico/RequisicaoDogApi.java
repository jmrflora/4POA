package estatico;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Base64;

import javax.imageio.ImageIO;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RequisicaoDogApi
 */
@WebServlet("/RequisicaoDogApi")
public class RequisicaoDogApi extends HttpServlet {
	private static final long serialVersionUID = 1L;
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Cachorro dog = new Cachorro();
		
		System.out.println("pegando os parametros");
		
		dog.setNome(request.getParameter("nomeCachorro"));
		dog.setNomeResponsavel(request.getParameter("nomeResponsavel"));
		dog.setRaca(request.getParameter("raca"));
		DogApiResponse dar;
		TesteCon tc = new TesteCon();
		dar = tc.getDogApiResponse(dog.getRaca());
		System.out.println(dar.getMessage());
		
		URL url = new URL(dar.getMessage());
		BufferedImage image = ImageIO.read(url);
		dog.setImg(image);
		
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		ImageIO.write(dog.getImg(), "jpg", baos);
		String base64Image = Base64.getEncoder().encodeToString(baos.toByteArray());
		
		request.setAttribute("teste", dar.getMessage());
		request.setAttribute("imagem", base64Image);
		request.setAttribute("nome", dog.getNome());
		request.setAttribute("nomeResponsavel", dog.getNomeResponsavel());
		request.setAttribute("raca", dog.getRaca());
		RequestDispatcher rd = request.getRequestDispatcher("/Carteira.jsp");
		rd.forward(request, response);

	}

}
