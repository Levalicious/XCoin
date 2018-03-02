import java.security.Security;

public class Test {
	public static void main(String [] args) {
		//Tester Class
		StringUtil su = new StringUtil();
		Security.addProvider(new org.bouncycastle.jce.provider.BouncyCastleProvider()); //Setup Bouncey castle as a Security Provider

		//Create wallets:
		Wallet walletA = new Wallet();
		Wallet walletB = new Wallet();		
		Wallet coinbase = new Wallet();
		
		System.out.println();
		System.out.println(su.getStringFromKey(walletA.privateKey));
		//System.out.println(su.getStringFromKey(walletA.publicKey));

		
		//Encrypt String Password 
		String pwd = "Password";
		System.out.println(su.applyECDSASig(walletA.privateKey, pwd));
		System.out.println(su.verifyECDSASig(walletA.publicKey, pwd, su.applyECDSASig(walletA.privateKey, pwd)));
		
		//isChainValid();
	}
}