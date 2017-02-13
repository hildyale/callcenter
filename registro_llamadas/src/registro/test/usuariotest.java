package registro.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import registro.BL.*;
import registro.Exception.BLException;
import registro.dto.Usuario;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("../../configuracionSpring.xml")

public class usuariotest {
    
	@Autowired 
	UsuarioBL usuarioBL;
	 

	@Test
	public void test(){
		List<Usuario> usuarios = null;
		try{
		usuarios = usuarioBL.ObtenerTodosUsuarios();
		if(usuarios == null){
			System.out.println("es nullo");
		}else{
			System.out.println("no es nulo");
		}
		System.out.println(usuarios.size());
		for (int i= 0;i<usuarios.size();i++){
			  System.out.println(usuarios.get(i).getNombre());
			}
		assertTrue(usuarios.size()>0);
		}catch (BLException e) {
			System.out.println(e.getMessage());
		}
	}

}
