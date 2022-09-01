package utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Date {
    /**
     * Retorna data de nascimento no formato MM/dd/yyyy,
     * Ex: 18 anos (-18) retorno 08/29/2004,
     * utilizada para preencher data de Nascimento.
     *
     * @author Roni Miguel
     */
    public String birthDateWithDiffOfYears(int numberOfYears){
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate today = LocalDate.now();
        LocalDate years = today.plusYears(numberOfYears); // Anos adicionados
        String date = years.format(dateFormat);
        return date;
    }

    /**
     * Retorna data no formato MM/dd/yyyy,
     *(Ex: 1 dia)  retorno: 08/30/2022,
     * utilizada para preencher o data de inicio do seguro
     * de forma automática.
     *
     * @author Roni Miguel
     */
    public String fullDateWithDiffOfDays(int numberOfDays){
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate today = LocalDate.now(); // Data atual
        LocalDate days = today.plusDays(numberOfDays); // Dias adicionados
        String date = days.format(dateFormat);
        return date;
    }

    public String today(){
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd-MM-yy");
        LocalDate today = LocalDate.now(); // Data atual
        String date = today.format(dateFormat);
        return date;
    }

}
