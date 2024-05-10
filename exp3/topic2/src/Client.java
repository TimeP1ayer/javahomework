import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

public class Client {
    private int id;
    private String name;
    private int port;
    public Client(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public void start() {
        try {
            Socket socket = new Socket(InetAddress.getLocalHost(),port); //创建连接本机1234端口的Socket对象

            //打开输入流,输出流
            BufferedReader is = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter os = new PrintWriter(socket.getOutputStream());
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Client connecting");
            //向服务器发送名字信息
            os.println(name);

            while (true) {
                String str = in.readLine(); //从键盘读取输入信息
                os.println("From "+id+" "+name+": "+str); //给服务器发送信息
                os.flush();
                System.out.println(is.readLine());

                if (str.contains("Exit")) {
                    break;
                }
            }

            os.close();
            is.close();
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}

