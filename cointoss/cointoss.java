package cointoss;
import java.util.Random;
public class cointoss {
	enum Coin{Head,Tail};
	static Random randomnum = new Random();
	static int result;
	static //int head=0
	//int tail=1
	Coin coinFlip;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
result = randomnum.nextInt(2);
if (result ==0)
{
	coinFlip = Coin.Head;
	System.out.println ("this is head");
}
else {
	coinFlip= Coin.Tail;
	System.out.println("this is tail");
}
	}

}
