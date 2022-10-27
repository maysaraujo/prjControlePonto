import model.Gerente;
import model.Operador;
import model.RegistroPonto;
import model.Secretaria;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class GerenciarControlePonto {
    public static void main(String[] args) throws InterruptedException {
        Gerente gerente = new Gerente();
        gerente.setLogin("nabi");
        gerente.setSenha("Jdka124");
        gerente.setIdFunc(1);
        gerente.setNome("Thainara");
        gerente.setEmail("thainara_nabi@gmail.com");
        gerente.setDocumento("123.456.768-78");

        Secretaria secretaria = new Secretaria();
        secretaria.setIdFunc(2);
        secretaria.setNome("Lucia");
        secretaria.setEmail("lucia_motta@gmail.com");
        secretaria.setDocumento("568.234.127-45");
        secretaria.setTelefone("(19)99654-5562");
        secretaria.setRamal("1");

        Operador operador = new Operador();
        operador.setNome("Guilherme");
        operador.setIdFunc(3);
        operador.setEmail("guilherme.henrique@hotmail.com");
        operador.setDocumento("980.234.129-55");
        operador.setValorHora(5.5);

        RegistroPonto gerentePonto = new RegistroPonto();
        RegistroPonto secretariaPonto = new RegistroPonto();
        RegistroPonto operadorPonto = new RegistroPonto();

        System.out.println("===================================");
        gerentePonto.setFunc(gerente);
        gerentePonto.setIdRegPonto(1);
        gerentePonto.setDataRegistro(LocalDate.now());
        gerentePonto.setHoraEntrada(LocalDateTime.now());
        gerentePonto.apresentarRegistroPonto();
        Thread.sleep(2000);
        System.out.println("===================================");

        secretariaPonto.setFunc(secretaria);
        secretariaPonto.setIdRegPonto(2);
        secretariaPonto.setDataRegistro(LocalDate.now());
        secretariaPonto.setHoraEntrada(LocalDateTime.now());
        secretariaPonto.apresentarRegistroPonto();
        Thread.sleep(2000);
        System.out.println("===================================");

        operadorPonto.setFunc(operador);
        operadorPonto.setIdRegPonto(3);
        operadorPonto.setDataRegistro(LocalDate.now());
        operadorPonto.setHoraEntrada(LocalDateTime.now());
        operadorPonto.apresentarRegistroPonto();
        Thread.sleep(2000);
        System.out.println("===================================");

        gerentePonto.setFunc(gerente);
        gerentePonto.setIdRegPonto(1);
        gerentePonto.setDataRegistro(LocalDate.now());
        gerentePonto.setHoraEntrada(LocalDateTime.now());
        Thread.sleep(2000);
        gerentePonto.setHoraSaida(LocalDateTime.now());
        gerentePonto.apresentarRegistroPonto();
        System.out.println("===================================");

        secretariaPonto.setFunc(secretaria);
        secretariaPonto.setIdRegPonto(2);
        secretariaPonto.setDataRegistro(LocalDate.now());
        secretariaPonto.setHoraEntrada(LocalDateTime.now());
        Thread.sleep(2000);
        secretariaPonto.setHoraSaida(LocalDateTime.now());
        secretariaPonto.apresentarRegistroPonto();
        System.out.println("===================================");

        operadorPonto.setFunc(operador);
        operadorPonto.setIdRegPonto(3);
        operadorPonto.setDataRegistro(LocalDate.now());
        operadorPonto.setHoraEntrada(LocalDateTime.now());
        Thread.sleep(2000);
        operadorPonto.setHoraSaida(LocalDateTime.now());
        operadorPonto.apresentarRegistroPonto();
        System.out.println("===================================");
    }
}