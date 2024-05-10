import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Server {

    int port;

    public Server(int port) {
        this.port = port;
    }

    public void start(){
        try {
            //与端口号为port的客户端建立连接
            ServerSocket server = new ServerSocket(port);

            System.out.println("Waiting Client...");
            Socket socket = server.accept();

            //打开输入流,输出流
            BufferedReader is = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter os = new PrintWriter(socket.getOutputStream());

            String name = is.readLine();
            System.out.println("Client "+name+" Connected");

            while (true) {
                String str = is.readLine();
                System.out.println(str);
                if (str.contains("Exit")) {
                    String answer = "Bye";
                    os.println("To "+name+": "+answer);
                    os.flush();
                    break;
                }
                else if (str.contains("Current Time")) {
                    LocalTime time = LocalTime.now();
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
                    os.println("To "+name+": "+time.format(formatter));
                    os.flush();
                }
                else if (str.contains("Generate a random number")){
                    Random random = new Random();
                    int num = random.nextInt(100);
                    String answer = ""+num;
                    os.println("To "+name+": "+answer);
                    os.flush();
                }
                else if (str.contains("help")){
                    String answer1 = "  1.Current Time  ";
                    String answer2 = "  2.Generate a random number  ";
                    String answer3 = "输入数字后的英文以获得服务";
                    os.println("To "+name+": "+answer3+answer1+answer2);
                    os.flush();
                }
                else {
                    String answer = "Enter 'Exit' to exit or 'help' to get help";
                    os.println("To "+name+": "+answer);
                    os.flush();
                }
            }

            os.close();
            is.close();
            socket.close();
            server.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

