package bank; // Define el paquete en el que se encuentra la clase

public class Bank{ // Define la clase Bank
  private CheckingAccount accountOne; // Declara un atributo privado para la primera cuenta corriente
  private CheckingAccount accountTwo; // Declara un atributo privado para la segunda cuenta corriente

  public Bank(){ // Constructor de la clase Bank
    accountOne = new CheckingAccount("Zeus", 0, 0); // Inicializa la primera cuenta corriente con nombre "Zeus", saldo inicial 100, e identificador "1"
    accountTwo = new CheckingAccount("Hades", 0, 0); // Inicializa la segunda cuenta corriente con nombre "Hades", saldo inicial 200, e identificador "2"
  }
  public static void main(String[] args){ // Método principal
    Bank bankOfGods = new Bank(); // Crea una nueva instancia de la clase Bank

    bankOfGods.accountOne.setBalance(0); // Establece un nuevo saldo para la primera cuenta corriente
    System.out .println(bankOfGods.accountOne.getBalance());
    
    bankOfGods.accountOne.pedir(0); // Establece un nuevo saldo para la primera cuenta corriente
    System.out.println(bankOfGods.accountOne.getBalance()); // Imprime el saldo de la primera cuenta corriente
    
    bankOfGods.accountOne.pedir(0); // Establece un nuevo saldo para la primera cuenta corriente
    System.out.println(bankOfGods.accountOne.getBalance()); // Imprime el saldo de la primera cuenta corriente
    
    bankOfGods.accountOne.pedir(0); // Establece un nuevo saldo para la primera cuenta corriente
    System.out.println(bankOfGods.accountOne.getBalance()); // Imprime el saldo de la primera cuenta corriente
    
    bankOfGods.accountOne.pedir(0); // Establece un nuevo saldo para la primera cuenta corriente
    System.out.println(bankOfGods.accountOne.getBalance()); // Imprime el saldo de la primera cuenta corriente
    
    bankOfGods.accountOne.pedir(0); // Establece un nuevo saldo para la primera cuenta corriente
    System.out.println(bankOfGods.accountOne.getBalance()); // Imprime el saldo de la primera cuenta corriente
    
    bankOfGods.accountOne.reti(0); // Establece un nuevo saldo para la primera cuenta corriente 
    System.out.println(bankOfGods.accountOne.getBalance()); // Imprime el saldo de la primera cuenta corriente
    
    bankOfGods.accountOne.reti(0); // Establece un nuevo saldo para la primera cuenta corriente 
    System.out.println(bankOfGods.accountOne.getBalance()); // Imprime el saldo de la primera cuenta corriente
    
    bankOfGods.accountOne.reti(0); // Establece un nuevo saldo para la primera cuenta corriente 
    System.out.println(bankOfGods.accountOne.getBalance()); // Imprime el saldo de la primera cuenta corriente
    
    bankOfGods.accountOne.reti(0); // Establece un nuevo saldo para la primera cuenta corriente 
    System.out.println(bankOfGods.accountOne.getBalance()); // Imprime el saldo de la primera cuenta corriente
    
    bankOfGods.accountOne.reti(0); // Establece un nuevo saldo para la primera cuenta corriente 
    System.out.println(bankOfGods.accountOne.getBalance()); // Imprime el saldo de la primera cuenta corriente

    
    
    bankOfGods.accountTwo.setBalance2(0); // Establece un nuevo saldo para la primera cuenta corriente
    System.out .println(bankOfGods .accountTwo.getBalance());
    
    bankOfGods.accountTwo.pedir(0); // Establece un nuevo saldo para la primera cuenta corriente
    System.out.println(bankOfGods.accountTwo.getBalance()); // Imprime el saldo de la primera cuenta corriente
    
    bankOfGods.accountTwo.pedir(0); // Establece un nuevo saldo para la primera cuenta corriente
    System.out.println(bankOfGods.accountTwo.getBalance()); // Imprime el saldo de la primera cuenta corriente
    
    bankOfGods.accountTwo.pedir(0); // Establece un nuevo saldo para la primera cuenta corriente
    System.out.println(bankOfGods.accountTwo.getBalance()); // Imprime el saldo de la primera cuenta corriente
    
    bankOfGods.accountTwo.pedir(0); // Establece un nuevo saldo para la primera cuenta corriente
    System.out.println(bankOfGods.accountTwo.getBalance()); // Imprime el saldo de la primera cuenta corriente
    
    bankOfGods.accountTwo.pedir(0); // Establece un nuevo saldo para la primera cuenta corriente
    System.out.println(bankOfGods.accountTwo.getBalance()); // Imprime el saldo de la primera cuenta corriente
    
    bankOfGods.accountTwo.reti(0); // Establece un nuevo saldo para la primera cuenta corriente 
    System.out.println(bankOfGods.accountTwo.getBalance()); // Imprime el saldo de la primera cuenta corriente
    
    bankOfGods.accountTwo.reti(0); // Establece un nuevo saldo para la primera cuenta corriente 
    System.out.println(bankOfGods.accountTwo.getBalance()); // Imprime el saldo de la primera cuenta corriente
    
    bankOfGods.accountTwo.reti(0); // Establece un nuevo saldo para la primera cuenta corriente 
    System.out.println(bankOfGods.accountTwo.getBalance()); // Imprime el saldo de la primera cuenta corriente
    
    bankOfGods.accountTwo.reti(0); // Establece un nuevo saldo para la primera cuenta corriente 
    System.out.println(bankOfGods.accountTwo.getBalance()); // Imprime el saldo de la primera cuenta corriente
    
    bankOfGods.accountTwo.reti(0); // Establece un nuevo saldo para la primera cuenta corriente 
    System.out.println(bankOfGods.accountTwo.getBalance()); // Imprime el saldo de la primera cuenta corriente
}
}
