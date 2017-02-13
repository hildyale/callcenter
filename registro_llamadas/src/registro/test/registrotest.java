package registro.test;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import registro.BL.*;
import registro.Exception.BLException;
import registro.dto.Registro;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("../../configuracionSpring.xml")

public class registrotest {
    
	@Autowired 
	RegistroBL registroBL;
	 

	@Test
	public void todos(){
		List<Registro> Registros = null;
		try{
		Registros = registroBL.ObtenerTodosRegistros();

		System.out.println(Registros.size());
		for (int i= 0;i<Registros.size();i++){
			  System.out.println(Registros.get(i).getComentario());
			}
		assertTrue(Registros.size()>0);
		}catch (BLException e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Test
	public void pormotivo(){
		List<Registro> Registros = null;
		try{
		Registros = registroBL.ObtenerRegistrosByMotivo(1);

		System.out.println(Registros.size());
		for (int i= 0;i<Registros.size();i++){
			  System.out.println(Registros.get(i).getComentario());
			}
		assertTrue(Registros.size()>0);
		}catch (BLException e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Test
	public void pormes(){
		List<Registro> Registros = null;
		try{
			Calendar calendar = Calendar.getInstance();
			calendar.set(2016, 10, 17);
	        Date mes =  calendar.getTime();
	        System.out.println(mes);
		Registros = registroBL.ObtenerRegistrosByMes(mes);

		System.out.println(Registros.size());
		for (int i= 0;i<Registros.size();i++){
			  System.out.println(Registros.get(i).getComentario());
			}
		assertTrue(Registros.size()>0);
		}catch (BLException e) {
			System.out.println(e.getMessage());
		}
	}

}
