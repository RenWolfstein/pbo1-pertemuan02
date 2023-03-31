import java.util.Scanner;

public class InputOutput{
 public static void main(String [] args){
  Scanner scanner = new Scanner(System.in);
  String nama;
  int jumlahsks;
  double IPK;

  System.out.print("Masukkan Nama Anda: ");
  nama = scanner.nextLine();
  System.out.println("Hai, "+nama);

  System.out.print("Masukkan jumlah sks yang sudah di tempuh: ");
  jumlahsks = scanner.nextInt();
  
  System.out.print("Masukkan IPK Sementara : ");
  IPK = scanner.nextDouble(); 

  double jumlah = IPK * jumlahsks;
  System.out.print("Total Nilai = "+jumlah);
 }
}