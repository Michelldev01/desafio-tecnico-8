import java.time.LocalDate;

public class Funcionario {
  private int idFuncionario;
  private String nome;
  private String cargo;
  private double salario;
  private LocalDate dataAdmissão;
  
  public Funcionario(int idFuncionario, String nome, String cargo, double salario, LocalDate dataAdmissão) {
    this.idFuncionario = idFuncionario;
    this.nome = nome;
    this.cargo = cargo;
    this.salario = salario;
    this.dataAdmissão = dataAdmissão;
  }

  public int getIdFuncionario() {
    return idFuncionario;
  }

  public void setIdFuncionario(int idFuncionario) {
    this.idFuncionario = idFuncionario;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getCargo() {
    return cargo;
  }

  public void setCargo(String cargo) {
    this.cargo = cargo;
  }

  public double getSalario() {
    return salario;
  }

  public void setSalario(double salario) {
    this.salario = salario;
  }

  public LocalDate getDataAdmissão() {
    return dataAdmissão;
  }

  public void setDataAdmissão(LocalDate dataAdmissão) {
    this.dataAdmissão = dataAdmissão;
  }

  public void promover(String novoCargo, double novoSalario){
    salario=novoSalario;
    cargo=novoCargo;
    }

    public double calcularSalario(){
      return salario*12;
    }
}
