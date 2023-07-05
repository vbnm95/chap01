import java.net.InetAddress;
import java.net.UnknownHostException;

public class Network1 {
	public static void main(String[] args) {
		try {
			InetAddress local = InetAddress.getLocalHost();
			System.out.println("내 컴퓨터 IP" + local.getHostAddress());

			InetAddress[] naver = InetAddress.getAllByName("www.naver.com");
			for(InetAddress i : naver) {
				System.out.println(i.getHostAddress());
				}
		} catch(UnknownHostException e) {
			e.printStackTrace();
		}
	}
}

