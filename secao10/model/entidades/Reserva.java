package model.entidades;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reserva {
	private Integer numeroDoQuarto;
	private Date checkIn;
	private Date checkOut;
	
	private static SimpleDateFormat sdf;
	
	public Reserva(Integer numeroDoQuarto, Date checkIn, Date checkOut) {
		this.numeroDoQuarto = numeroDoQuarto;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	public Integer getNumeroDoQuarto() {
		return numeroDoQuarto;
	}

	public Date getCheckIn() {
		return checkIn;
	}

	public Date getCheckOut() {
		return checkOut;
	}
	
	public long duracao() {
		long diff = checkOut.getTime()- checkIn.getTime(); //diferença em milissegundos entre os dias
		
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS); //converte os milissegundos em dias
	}
	
	public void atualizarDatas(Date checkIn, Date checkOut) {
		Date agora = new Date(); //cria um objeto com o momento atual
		
		//As datas de checkIn e checkOut devem ser futuras ao agora.
		//se forem anteriores ao agora, entrara no if
		if(checkIn.before(agora) || checkOut.before(agora)) {
			throw new IllegalArgumentException("Update só é permitido para datas futuras");
		}
		
		//alem disso a data de checkOut deve ser uma data futura a data de checkIn. Se não for, entrará no if.
		if (!checkOut.after(checkIn)) {
			throw new IllegalArgumentException("A data de checkIn deve ser anterior a data de CheckOut");
		}
		
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	@Override
	public String toString() {
		sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		return "numero Do Quarto=" + numeroDoQuarto + 
				"\n checkIn=" + sdf.format(checkIn) + 
				"\n checkOut=" + sdf.format(checkOut) +
				"\n Duração="+duracao() + "Noites";
	}
	
	
	
	
}
