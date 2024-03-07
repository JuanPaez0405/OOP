package bank; // Define el paquete en el que se encuentra la clase
import java.util.Scanner;

public class CheckingAccount{ // Define la clase CheckingAccount
  private String name; // Declara un atributo privado para almacenar el nombre
  private int balance; // Declara un atributo privado para almacenar el saldo
  private int id;

public CheckingAccount(String inputName, int inputBalance,int inputId){ // Constructor de la clase
    this.name = inputName; // Inicializa el atributo name con el valor proporcionado
    this.balance = inputBalance; // Inicializa el atributo balance con el valor proporcionado
    this.id = inputId;
}

public void pedir(int consis){
    System.out.println("decida el valor de la consignacion"); 
    Scanner reader = new Scanner(System.in);
    consis = consis + reader.nextInt(); //lee el numero pedido
    this.balance = consis + balance;
 }
public void reti(int retir){
    System.out.println("decida el valor del retiro"); 
    Scanner reader = new Scanner(System.in);
    retir = retir + reader.nextInt(); //lee el numero pedido
    this.balance = balance - retir;
 }
  public int getBalance(){ // Método para obtener el saldo
      System.out.println("Su saldo es " + balance);
      return balance; // Devuelve el valor del saldo
}
  
  public void setBalance(int newBalance){
    System.out.println("Ingrese su saldo de la cuenta 1"); 
    Scanner reader = new Scanner(System.in);
    newBalance = newBalance + reader.nextInt(); //lee el numero pedido
    this.balance = newBalance; // Actualiza el saldo con el nuevo valor proporcionado
 }  
  public void setBalance2(int newBalance){
    System.out.println("Ingrese su saldo de la cuenta 2"); 
    Scanner reader = new Scanner(System.in);
    newBalance = newBalance + reader.nextInt(); //lee el numero pedido
    this.balance = newBalance; // Actualiza el saldo con el nuevo valor proporcionado
 }  
  /*public double cdt(double val, double mes, double taz, double res ){
      Scanner reader = new Scanner(System.in);
      System.out.println("ingrese el valor de el cdt");
      val = val + reader.nextDouble();
      reader. nextDouble();
      System.out.println("ingrese el valor de el cdt");
      mes = mes + reader.nextDouble();   
      reader. nextDouble();
      res = val + taz + mes/365;
      return res;*/
}

