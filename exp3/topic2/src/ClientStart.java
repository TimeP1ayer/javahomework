//Client_Start.java
public class ClientStart {
    public static void main(String[] args) {
        /**
         * 先启动服务端，再启动客户端
         */
        Client c = new Client(114514,"李田所"); //创建Client对象，参数为学号和姓名
        c.setPort(1234);
        c.start(); //启动客户端
    }
}


