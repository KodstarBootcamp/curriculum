public class Main {

    public static void main(String[] args) {
    	Account myAccount = new Account(10.0);
		Account otherAccount = new Account();

		System.out.println("MyAccount Balance=" + myAccount.getBalance());
		System.out.println("OtherAccount Balance=" + otherAccount.getBalance());

		myAccount.transferFromMeTo(otherAccount, 7.0);

		System.out.println("MyAccount Balance=" + myAccount.getBalance());
		System.out.println("OtherAccount Balance=" + otherAccount.getBalance());
    }
}
