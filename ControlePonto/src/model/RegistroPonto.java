package model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class RegistroPonto {
    private long idRegPonto;
    Funcionario func = new Funcionario();
    private LocalDate dataRegistro;
    private LocalDateTime horaEntrada;
    private LocalDateTime horaSaida;

    public long getIdRegPonto() {
        return idRegPonto;
    }

    public void setIdRegPonto(long idRegPonto) {
        this.idRegPonto = idRegPonto;
    }

    public Funcionario getFunc() {
        return func;
    }

    public void setFunc(Funcionario func) {
        this.func = func;
    }

    public LocalDate getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(LocalDate dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    public LocalDateTime getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(LocalDateTime horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public LocalDateTime getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(LocalDateTime horaSaida) {
        this.horaSaida = horaSaida;
    }

    public void apresentarRegistroPonto() {
        System.out.println("Nome do Funcionario: " + func.getNome());
        System.out.println("Data do Registro: " + dataRegistro);
        System.out.println("Horario da Entrada: " + horaEntrada);
        System.out.println("Horario da Saida: " + horaSaida);
    }
}
