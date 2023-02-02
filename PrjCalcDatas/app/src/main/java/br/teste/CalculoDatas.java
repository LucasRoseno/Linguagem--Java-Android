package br.teste;

import java.util.Date;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;

public class CalculoDatas
{
    private GregorianCalendar dt1; //primeira data
    private GregorianCalendar dt2; //segunda data

    public String getDataCelString() //data now do celular, convertido para String
    {
        SimpleDateFormat formataData = new SimpleDateFormat("dd/MM/yyyy");
        Date data = new Date();
        String dataFormatada = formataData.format(data);
        return dataFormatada;
    }

    public GregorianCalendar getDataCelular()  //data now do celular
    {
        GregorianCalendar datNow = (GregorianCalendar) GregorianCalendar.getInstance();
        return datNow;
    }

    public void addDatasCalendario(GregorianCalendar d1, String[] dtNiver) {
        dt1 = new GregorianCalendar();
        int ano = d1.get(GregorianCalendar.YEAR);
        int mes = d1.get(GregorianCalendar.MONTH); //Mês é 0 a 11
        int dia = d1.get(GregorianCalendar.DAY_OF_MONTH);
        dt1.set(ano, mes, dia, 0, 0, 0);
        dt2 = new GregorianCalendar(); // Mês -1 é porque é de 0 a 11
        dt2.set(Integer.parseInt(dtNiver[2]), Integer.parseInt(dtNiver[1]) - 1, Integer.parseInt(dtNiver[0]), 0, 0, 0);
    }

    public int diffAnosDeVida(String y1, String y2)
    {
        String d1[] = y1.split("/"); //ex: 01/01/2001
        String d2[] = y2.split("/"); //ex: 01/01/2022
        int anoNasc = Integer.parseInt(d1[2]);
        int anoAtual = Integer.parseInt(d2[2]);
        return anoAtual - anoNasc; //2022 - 2001 == 21 anos
    }

    public int diffDias() //máximo 30 dias
    {
        //O retorno é em milisegundos fazer: 24*60*60*1000 --> horas,minutos,segundos,milisegundos
        int MILISEG_PARA_DIA = 86400000;
        return (int) ((dt2.getTimeInMillis() - dt1.getTimeInMillis()) / MILISEG_PARA_DIA);
    }

    public String converteGregparaString(GregorianCalendar date){ //converte de GregorianCalandar para string

        SimpleDateFormat fmt = new SimpleDateFormat("dd/MMM/yyyy");
        String dateFormatted = fmt.format(date);
        return dateFormatted;
    }

}