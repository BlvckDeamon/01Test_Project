package Java_8_feature;

import java.util.function.Consumer;

public class TestConsumer {

	public static void main(String[] args) {
		
		Consumer< Integer > consumer = (i) ->{
			if (i%2==0)
				System.out.println("this is Even no :"+i);
			else
				System.out.println("this is odd no :"+i);
		};
		
		consumer.accept(8);
		
	}
}
