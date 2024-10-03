import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try(Socket socket=new Socket("127.0.0.1",8888);
            BufferedWriter bufferedWriter=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(socket.getInputStream()));){

            bufferedWriter.write("666");
            bufferedWriter.newLine();
            bufferedWriter.flush();

            String s=bufferedReader.readLine();
            System.out.println(s);

        }catch (IOException e){
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }




}