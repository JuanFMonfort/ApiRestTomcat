import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/main")

public class main {
	@GET
	@Path("todos")
	 @Produces(MediaType.TEXT_PLAIN)
	public String hola() {
		return "hola a todos"; 
	}
	
	@GET
	@Path("texto")
	 @Produces(MediaType.TEXT_HTML)
	public String text() {
		return "<!DOCTYPE html><html><body><p>Hola desde un texto en bruto</p></body></html>"; 
	}
	
	@POST
 	@Path("login")
 	@Produces(MediaType.TEXT_HTML)
	public String nuevaPersona(@FormParam("nombre") String nombre, @FormParam("nacimiento") String nacimiento, @FormParam("hm") String sexo) {
		return "<!DOCTYPE html><html><body><p>Hola "+nombre+" que naciste el "+nacimiento+" de genero "+sexo+"</p></body></html>";
	}
	

}
